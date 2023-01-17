/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import controller.BarangController.BarangTableModel;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.AbstractTableModel;
import model.Barang;
import model.Pelanggan;
import model.Penjualan;
import model.PenjualanDetail;
import service.KasirService;
import service.impl.KasirServiceImpl;
import view.BarangView;
import view.CariDialogView;
import view.MenuView;
import view.PenjualanView;

/**
 *
 * @author Kamelia
 */
public class PenjualanController {

   private Barang barang;
   private Penjualan penjualan;
   private PenjualanView penjualanView;
   private BarangView barangView;
   private KasirService kasirService;
   private List<Barang> listBarangs;
   private List<PenjualanDetail> penjualanDetails;

   public PenjualanController(PenjualanView penjualanView) {
      this.penjualanView = penjualanView;
      kasirService = new KasirServiceImpl();
      penjualanDetails = new ArrayList<PenjualanDetail>();
   }

   public void cariData(String cari) {
      MenuView mv = new MenuView();
      CariDialogView cdv = new CariDialogView(mv, true);
      listBarangs = kasirService.getCariNama(cari);
      BarangController b = new BarangController(barangView);
      BarangController.BarangTableModel btm = b.new BarangTableModel(listBarangs);
      cdv.getTabelCari().setModel(btm);
      cdv.getTabelCari().getSelectionModel().addListSelectionListener(new BarangTableSelectionListener(cdv.getTabelCari()));
      cdv.setVisible(true);
      penjualanView.gettNamaBarang().setText(barang.getNama());
   }

   public void refreshTabel() {
      penjualanView.getTabelPenjualan().setModel(new PenjualanTableModel(penjualanDetails));
   }

   public void refreshTotalLabel() {
      Double total = 0.0;
      if (penjualanDetails != null && !penjualanDetails.isEmpty()) {
         for (PenjualanDetail pd : penjualanDetails) {
            total += pd.getSubtotal();
         }
      }
      penjualanView.gettRupiah().setText(total.toString());
   }

   public void addBarang() {
      if (barang != null) {
         if (barangDiPenjualan(barang.getKode())) {
            penjualanView.gettNamaBarang().setText("");
            refreshTabel();
            refreshTotalLabel();
         } else {
            penjualanView.gettNamaBarang().setText(barang.getNama());
            PenjualanDetail pd = new PenjualanDetail();
            pd.setBarang(barang);
            pd.setHarga(barang.getHarga());
            pd.setJumlah(1);
            if (pd.getSubtotal() != null) {
               pd.setSubtotal(pd.getSubtotal() + barang.getHarga());
            } else {
               pd.setSubtotal(barang.getHarga());
            }
            penjualanDetails.add(pd);
            refreshTabel();
            refreshTotalLabel();
         }

      } else {
         MenuView mv = new MenuView();
         JOptionPane.showMessageDialog(mv, "Barang tidak ada!", "Error",
                 JOptionPane.ERROR_MESSAGE);
      }
   }

   public void removeBarang() {
      if (penjualanView.getTabelPenjualan().getSelectedRow() >= 0) {
         int baris = penjualanView.getTabelPenjualan().getSelectedRow();
         penjualanDetails.remove(baris);
         refreshTabel();
         refreshTotalLabel();
         penjualanView.getTabelPenjualan().getSelectionModel().clearSelection();
      }
   }

   public void clearForm() {
      penjualanView.gettKode().setText(null);
      penjualanView.gettNamaBarang().setText(null);
      penjualanView.gettRupiah().setText("0");
      barang = new Barang();
      penjualan = new Penjualan();
      penjualanDetails = new ArrayList<PenjualanDetail>();;
      refreshTabel();
   }

   public void simpanTransaksi() {
      if (penjualan == null) {
         penjualan = new Penjualan();
      }
      penjualan.setKodePenjualan(penjualanView.gettKode().getText());
      Date date = new Date();
      penjualan.setTanggalPenjualan(new Timestamp(date.getTime()));
      penjualan.setTotalTransaksi(Double.parseDouble(penjualanView.gettRupiah().getText()));
//      ambil cb yang terpilih dan cari kode pelanggan di db
      List<Pelanggan> pelangganByNama = kasirService.getPelangganByNama(penjualanView.getCbPelanggan().getSelectedItem().toString());
      for (Pelanggan p : pelangganByNama) {
         penjualan.setKodePelanggan(p.getKode());
      }

      kasirService.simpanPenjualan(penjualan);
      for (PenjualanDetail penjualanDetail : penjualanDetails) {
         PenjualanDetail pd = new PenjualanDetail();
         pd.setBarang(penjualanDetail.getBarang());
         pd.setJumlah(penjualanDetail.getJumlah());
         pd.setHarga(penjualanDetail.getHarga());
         pd.setSubtotal(penjualanDetail.getSubtotal());
         pd.setPenjualan(penjualan);
         kasirService.simpanPenjualanDetail(pd);
//update barang
         Barang updateBarang = new Barang();
         int stokUpdate = penjualanDetail.getBarang().getJumlah() - penjualanDetail.getJumlah();
         updateBarang.setNama(penjualanDetail.getBarang().getNama());
         updateBarang.setSatuan(penjualanDetail.getBarang().getSatuan());
         updateBarang.setJumlah(stokUpdate);
         updateBarang.setHarga(penjualanDetail.getBarang().getHarga());
         updateBarang.setKode(penjualanDetail.getBarang().getKode());
         kasirService.updateBarang(updateBarang);
      }
      clearForm();
      JOptionPane.showMessageDialog(penjualanView, "Barang berhasil disimpan!", "Informasi", JOptionPane.INFORMATION_MESSAGE);
   }

   private boolean barangDiPenjualan(String kode) {
      boolean kondisi = false;

      for (PenjualanDetail pd : penjualanDetails) {
         if (pd.getBarang().getKode() != null && pd.getBarang().getKode().equals(kode)) {
            pd.setJumlah(pd.getJumlah() + 1);
            pd.setSubtotal(pd.getHarga() * pd.getJumlah());
            kondisi = true;
            break;
         }
      }
      return kondisi;
   }

   public class PenjualanTableModel extends AbstractTableModel {

      private List<PenjualanDetail> listDetails;
      private String[] columnNames = {"Kode", "Nama", "Harga", "Jumlah", "Subtotal"};

      public PenjualanTableModel(List<PenjualanDetail> listDetails) {
         this.listDetails = listDetails;
      }

      @Override
      public int getRowCount() {
         return listDetails.size();
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
         PenjualanDetail pd = listDetails.get(rowIndex);
         switch (columnIndex) {
            case 0:
               return pd.getBarang().getKode();
            case 1:
               return pd.getBarang().getNama();
            case 2:
               return pd.getHarga();
            case 3:
               return pd.getJumlah();
            case 4:
               return pd.getSubtotal();
            default:
               return "";
         }
      }

      @Override
      public Class<?> getColumnClass(int columnIndex) {
         if (columnIndex == 2 || columnIndex == 4) {
            return Double.class;
         } else if (columnIndex == 3) {
            return Integer.class;
         }
         return String.class;
      }

      @Override
      public boolean isCellEditable(int rowIndex, int columnIndex) {
         if (columnIndex == 3) {
            return true;
         }
         return false;
      }

      @Override
      public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
         PenjualanDetail pd = listDetails.get(rowIndex);
         if (columnIndex == 3) {
            pd.setJumlah((Integer) aValue);
            pd.setSubtotal(pd.getHarga() * pd.getJumlah());
            refreshTotalLabel();
         }
      }
   }

   public class BarangTableSelectionListener implements ListSelectionListener {

      private JTable tabel;

      public BarangTableSelectionListener(JTable tabel) {
         this.tabel = tabel;
      }

      @Override
      public void valueChanged(ListSelectionEvent e) {
         if (tabel.getSelectedRow() >= 0) {
            barang = listBarangs.get(tabel.getSelectedRow());
         }
      }
   }

   public void ambilPelanggan() {
//      ambil data dari db dan masukkan ke dalam combo box
      List<Pelanggan> allPelanggan = kasirService.getAllPelanggan();
      for (Pelanggan p : allPelanggan) {
         penjualanView.getCbPelanggan().addItem(p.getNama());
      }
   }
}
