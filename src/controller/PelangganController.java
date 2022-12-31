/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.AbstractTableModel;
import model.Pelanggan;
import service.KasirService;
import service.impl.KasirServiceImpl;
import view.PelangganView;

/**
 *
 * @author Kamelia
 */
public class PelangganController {

  PelangganView pelangganView;
  KasirService kasirService;

  private List<Pelanggan> listPelanggan;

  public PelangganController(PelangganView p) {
    this.pelangganView = p;
    kasirService = new KasirServiceImpl();
  }

  public void clearForm() {
    pelangganView.gettKode().setText("");
    pelangganView.gettNama().setText("");
    pelangganView.gettEmail().setText("");
    pelangganView.gettAlamat().setText("");
    pelangganView.getTabelPelanggan().clearSelection();
  }

  public void enableForm(boolean b) {
    pelangganView.gettKode().setEnabled(b);
    pelangganView.gettNama().setEnabled(b);
    pelangganView.gettEmail().setEnabled(b);
    pelangganView.gettAlamat().setEnabled(b);
    pelangganView.getBtnHapus().setEnabled(b);
    pelangganView.getBtnSimpan().setEnabled(b);
    pelangganView.getBtnUpdate().setEnabled(b);
  }

  private boolean validasiForm() {
    if (pelangganView.gettKode().getText().length() > 0
            && pelangganView.gettNama().getText().length() > 0
            && pelangganView.gettEmail().getText().length() > 0
            && pelangganView.gettAlamat().getText().length() > 0) {
      return true;
    } else {
      JOptionPane.showMessageDialog(pelangganView, "Input tidak boleh kosong",
              "ERROR", JOptionPane.ERROR_MESSAGE);
      return false;
    }
  }

  public void simpan() {
    if (validasiForm()) {
      Pelanggan p = new Pelanggan();
      p.setKode(pelangganView.gettKode().getText());
      p.setNama(pelangganView.gettNama().getText());
      p.setAlamat(pelangganView.gettAlamat().getText());
      p.setEmail(pelangganView.gettEmail().getText());
      kasirService.simpanPelanggan(p);
      JOptionPane.showMessageDialog(pelangganView, "DATA BERHASIL DISIMPAN!",
              "INFORMASI", JOptionPane.INFORMATION_MESSAGE);
      refreshTabel();
    }
  }

  public void update() {
    if (validasiForm()) {
      Pelanggan p = new Pelanggan();
      p.setKode(pelangganView.gettKode().getText());
      p.setNama(pelangganView.gettNama().getText());
      p.setAlamat(pelangganView.gettAlamat().getText());
      p.setEmail(pelangganView.gettEmail().getText());
      kasirService.updatePelanggan(p);
      JOptionPane.showMessageDialog(pelangganView, "DATA BERHASIL DIUBAH!",
              "INFORMASI", JOptionPane.INFORMATION_MESSAGE);
      refreshTabel();
    }
  }

  public void delete() {
    if (!pelangganView.gettKode().getText().isEmpty()) {
      Pelanggan p = new Pelanggan();

      p.setKode(pelangganView.gettKode().getText());
      kasirService.deletePelanggan(p);
      JOptionPane.showMessageDialog(pelangganView, "DATA BERHASIL DIHAPUS!",
              "INFORMASI", JOptionPane.INFORMATION_MESSAGE);
    } else {
      JOptionPane.showMessageDialog(pelangganView, "Kode barang tidak boleh kosong",
              "Peirngatan", JOptionPane.WARNING_MESSAGE);
    }

  }

  public void refreshTabel() {
    listPelanggan = kasirService.getAllPelanggan();
    PelangganTableModel btm = new PelangganTableModel(listPelanggan);
    pelangganView.getTabelPelanggan().setModel(btm);
  }

  public void cariData() {
    listPelanggan = kasirService.getPelangganByNama(pelangganView.gettCari().getText());
    PelangganTableModel btm = new PelangganTableModel(listPelanggan);
    pelangganView.getTabelPelanggan().setModel(btm);
  }

  public void loadModelToForm(Pelanggan p) {
    pelangganView.gettKode().setText(p.getKode());
    pelangganView.gettNama().setText(p.getNama());
    pelangganView.gettEmail().setText(p.getEmail());
    pelangganView.gettAlamat().setText(p.getAlamat());
  }

  public void kondisiAwal() {
    enableForm(false);
    pelangganView.getBtnSimpan().setEnabled(false);
    pelangganView.getBtnUpdate().setEnabled(false);
    pelangganView.getBtnHapus().setEnabled(false);
  }

  private class PelangganTableModel extends AbstractTableModel {

    private final List<Pelanggan> listPelanggan;
    private final String[] columnNames = {"Kode", "Nama", "Email", "Alamat"};

    public PelangganTableModel(List<Pelanggan> listPelanggan) {
      this.listPelanggan = listPelanggan;
    }

    @Override
    public int getRowCount() {
      return listPelanggan.size();
    }

    @Override
    public int getColumnCount() {
      return 4;
    }

    @Override
    public String getColumnName(int column) {
      return columnNames[column];
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
      Pelanggan p = listPelanggan.get(rowIndex);
      switch (columnIndex) {
        case 0:
          return p.getKode();
        case 1:
          return p.getNama();
        case 2:
          return p.getEmail();
        case 3:
          return p.getAlamat();
        default:
          return "";
      }
    }
  }

  public class PelangganTableSelectionListener
          implements ListSelectionListener {

    private JTable tabel;

    public PelangganTableSelectionListener(JTable tabel) {
      this.tabel = tabel;
    }

    @Override
    public void valueChanged(ListSelectionEvent e) {
      if (tabel.getSelectedRow() >= 0) {
        Pelanggan p = listPelanggan.get(tabel.getSelectedRow());
        enableForm(true);
        loadModelToForm(p);
        pelangganView.getBtnSimpan().setEnabled(false);
      }
    }
  }
}
