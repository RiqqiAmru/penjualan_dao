package controller;

import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.AbstractTableModel;
import model.Barang;
import service.KasirService;
import service.impl.KasirServiceImpl;
import view.BarangView;

public class BarangController {
    
    BarangView barangView;
    KasirService kasirService;
    
    private List<Barang> listBarangs;

    // constructor
    public BarangController(BarangView barangView) {
        this.barangView = barangView;
        kasirService = new KasirServiceImpl();
    }
    
    public void editableKode(boolean bool) {
        barangView.gettKode().setEditable(bool);
    }
    
    public void clearForm() {
        barangView.gettKode().setText("");
        barangView.gettNama().setText("");
        barangView.getCmbSatuan().setSelectedIndex(0);
        barangView.gettJumlah().setText("");
        barangView.gettHarga().setText("");
        barangView.getTabelBarang().clearSelection();
    }
    
    public void enableForm(boolean kondisi) {
        barangView.gettKode().setEnabled(kondisi);
        barangView.gettNama().setEnabled(kondisi);
        barangView.getCmbSatuan().setEnabled(kondisi);
        barangView.gettJumlah().setEnabled(kondisi);
        barangView.gettHarga().setEnabled(kondisi);
        
        barangView.getBtnSimpan().setEnabled(kondisi);
        barangView.getBtnUpdate().setEnabled(kondisi);
        barangView.getBtnHapus().setEnabled(kondisi);
    }
    
    private boolean validasiForm() {
        if (barangView.gettKode().getText().length() > 0
                && barangView.gettNama().getText().length() > 0
                && barangView.getCmbSatuan().getSelectedIndex() != 0
                && barangView.gettJumlah().getText().length() > 0
                && barangView.gettHarga().getText().length() > 0) {
            return true;
        } else {
            JOptionPane.showMessageDialog(barangView, "Input tidak boleh kosong",
                    "ERROR", JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }
    
    public void simpan() {
        if (validasiForm()) {
            Barang b = new Barang();
            b.setKode(barangView.gettKode().getText());
            b.setNama(barangView.gettNama().getText());
            b.setSatuan(barangView.getCmbSatuan().getSelectedItem().toString());
            b.setJumlah(Integer.parseInt(barangView.gettJumlah().getText()));
            b.setHarga(Integer.parseInt(barangView.gettHarga().getText()));
            kasirService.simpanBarang(b);
            JOptionPane.showMessageDialog(barangView, "DATA BERHASIL DISIMPAN!",
                    "INFORMASI", JOptionPane.INFORMATION_MESSAGE);
            refreshTabel();
            
        }
    }
    
    public void update() {
        if (validasiForm()) {
            Barang b = new Barang();
            b.setNama(barangView.gettNama().getText());
            b.setSatuan(barangView.getCmbSatuan().getSelectedItem().toString());
            b.setJumlah(Integer.parseInt(barangView.gettJumlah().getText()));
            b.setHarga(Integer.parseInt(barangView.gettHarga().getText()));
            b.setKode(barangView.gettKode().getText());
            kasirService.updateBarang(b);
            JOptionPane.showMessageDialog(barangView, "DATA BERHASIL DIUBAH!",
                    "INFORMASI", JOptionPane.INFORMATION_MESSAGE);
            refreshTabel();
        }
    }
    
    public void delete() {
        if (!barangView.gettKode().getText().isEmpty()) {
            Barang b = new Barang();
            b.setKode(barangView.gettKode().getText());
            kasirService.deleteBarang(b);
            JOptionPane.showMessageDialog(barangView, "DATA BERHASIL DIHAPUS!",
                    "INFORMASI", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(barangView, "Kode barang tidak boleh kosong",
                    "Peirngatan", JOptionPane.WARNING_MESSAGE);
        }
        
    }
    
    public void refreshTabel() {
        listBarangs = kasirService.getAll();
        BarangTableModel btm = new BarangTableModel(listBarangs);
        barangView.getTabelBarang().setModel(btm);
    }
    
    public void cariData() {
        listBarangs = kasirService.getCariNama(barangView.gettCari().getText());
        BarangTableModel btm = new BarangTableModel(listBarangs);
        barangView.getTabelBarang().setModel(btm);
    }
    
    public void loadModelToForm(Barang b) {
        barangView.gettKode().setText(b.getKode());
        barangView.gettNama().setText(b.getNama());
        barangView.getCmbSatuan().setSelectedItem(b.getSatuan());
        barangView.gettJumlah().setText(b.getJumlah().toString());
        barangView.gettHarga().setText(b.getHarga().toString());
    }
    
    public void kondisiAwal() {
        enableForm(false);
        barangView.getBtnSimpan().setEnabled(false);
        barangView.getBtnUpdate().setEnabled(false);
        barangView.getBtnHapus().setEnabled(false);
    }
    
    private class BarangTableModel extends AbstractTableModel {
        
        private final List<Barang> listBarangs;
        private final String[] columnNames = {"Kode", "Nama", "Satuan", "Jumlah", "Harga"};
        
        public BarangTableModel(List<Barang> listBarangs) {
            this.listBarangs = listBarangs;
        }
        
        @Override
        public int getRowCount() {
            return listBarangs.size();
        }
        
        @Override
        public int getColumnCount() {
            return 5;
        }
        
        @Override
        public String getColumnName(int column) {
            return columnNames[column];
        }
        
        @Override
        public Object getValueAt(int rowIndex, int columnIndex) {
            Barang b = listBarangs.get(rowIndex);
            switch (columnIndex) {
                case 0:
                    return b.getKode();
                case 1:
                    return b.getNama();
                case 2:
                    return b.getSatuan();
                case 3:
                    return b.getJumlah();
                case 4:
                    return b.getHarga();
                default:
                    return "";
            }
        }
    }
    
    public class BarangTableSelectionListener
            implements ListSelectionListener {
        
        private JTable tabel;
        
        public BarangTableSelectionListener(JTable tabel) {
            this.tabel = tabel;
        }
        
        @Override
        public void valueChanged(ListSelectionEvent e) {
            if (tabel.getSelectedRow() >= 0) {
                Barang b = listBarangs.get(tabel.getSelectedRow());
                enableForm(true);
                loadModelToForm(b);
                barangView.getBtnSimpan().setEnabled(false);
            }
        }
    }
    
}
