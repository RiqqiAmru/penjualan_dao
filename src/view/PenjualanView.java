/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package view;

import controller.PenjualanController;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;

/**
 *
 * @author Kamelia
 */
public class PenjualanView extends javax.swing.JInternalFrame {

   private PenjualanController penjualanController;

   /**
    * Creates new form PenjualanView
    */
   public PenjualanView() {
      initComponents();
      penjualanController = new PenjualanController(this);
      penjualanController.refreshTabel();
   }

   public JButton getBtnBatal() {
      return btnBatal;
   }

   public JButton getBtnCari() {
      return btnCari;
   }

   public JButton getBtnHapusBarang() {
      return btnHapusBarang;
   }

   public JButton getBtnSimpanTransaksi() {
      return btnSimpanTransaksi;
   }

   public JButton getBtnTambahBarang() {
      return btnTambahBarang;
   }

   public JComboBox<String> getCbPelanggan() {
      return cbPelanggan;
   }

   public JScrollPane getjScrollPane1() {
      return jScrollPane1;
   }

   public JTextField gettKode() {
      return tKode;
   }

   public JTextField gettNamaBarang() {
      return tNamaBarang;
   }

   public JTextField gettRupiah() {
      return tRupiah;
   }

   public JTextField gettTanggal() {
      return tTanggal;
   }

   public JTable getTabelPenjualan() {
      return tabelPenjualan;
   }

   /**
    * This method is called from within the constructor to initialize the form.
    * WARNING: Do NOT modify this code. The content of this method is always
    * regenerated by the Form Editor.
    */
   @SuppressWarnings("unchecked")
   // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
   private void initComponents() {

      btnTambahBarang = new javax.swing.JButton();
      btnHapusBarang = new javax.swing.JButton();
      btnSimpanTransaksi = new javax.swing.JButton();
      btnBatal = new javax.swing.JButton();
      jLabel1 = new javax.swing.JLabel();
      tKode = new javax.swing.JTextField();
      jLabel2 = new javax.swing.JLabel();
      tTanggal = new javax.swing.JTextField();
      tNamaBarang = new javax.swing.JTextField();
      jLabel3 = new javax.swing.JLabel();
      btnCari = new javax.swing.JButton();
      tRupiah = new javax.swing.JTextField();
      jScrollPane1 = new javax.swing.JScrollPane();
      tabelPenjualan = new javax.swing.JTable();
      jLabel4 = new javax.swing.JLabel();
      cbPelanggan = new javax.swing.JComboBox<>();

      addComponentListener(new java.awt.event.ComponentAdapter() {
         public void componentShown(java.awt.event.ComponentEvent evt) {
            formComponentShown(evt);
         }
      });

      btnTambahBarang.setText("Tambah Barang");
      btnTambahBarang.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            btnTambahBarangActionPerformed(evt);
         }
      });

      btnHapusBarang.setText("Hapus Barang");
      btnHapusBarang.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            btnHapusBarangActionPerformed(evt);
         }
      });

      btnSimpanTransaksi.setText("Simpan Transaksi");
      btnSimpanTransaksi.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            btnSimpanTransaksiActionPerformed(evt);
         }
      });

      btnBatal.setText("Batal");

      jLabel1.setText("Kode Penjualan");

      jLabel2.setText("Tanggal Penjualan");

      tTanggal.setEnabled(false);

      jLabel3.setText("Nama Barang");

      btnCari.setText("Cari");
      btnCari.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            btnCariActionPerformed(evt);
         }
      });

      tRupiah.setEditable(false);
      tRupiah.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
      tRupiah.setText("0");
      tRupiah.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

      tabelPenjualan.setModel(new javax.swing.table.DefaultTableModel(
         new Object [][] {

         },
         new String [] {
            "Title 1", "Title 2", "Title 3", "Title 4"
         }
      ));
      jScrollPane1.setViewportView(tabelPenjualan);

      jLabel4.setText("Nama Pelanggan");

      cbPelanggan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-- pilih--" }));
      cbPelanggan.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            cbPelangganActionPerformed(evt);
         }
      });

      javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
      getContentPane().setLayout(layout);
      layout.setHorizontalGroup(
         layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(layout.createSequentialGroup()
            .addContainerGap()
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addComponent(jScrollPane1)
               .addGroup(layout.createSequentialGroup()
                  .addComponent(btnTambahBarang)
                  .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                  .addComponent(btnHapusBarang)
                  .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                  .addComponent(btnSimpanTransaksi)
                  .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                  .addComponent(btnBatal))
               .addGroup(layout.createSequentialGroup()
                  .addComponent(jLabel3)
                  .addGap(18, 18, 18)
                  .addComponent(tNamaBarang, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                  .addGap(18, 18, 18)
                  .addComponent(btnCari)
                  .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                  .addComponent(tRupiah, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
               .addGroup(layout.createSequentialGroup()
                  .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                     .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(10, 10, 10)
                        .addComponent(cbPelanggan, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                     .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(tKode, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)))
                  .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 188, Short.MAX_VALUE)
                  .addComponent(jLabel2)
                  .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                  .addComponent(tTanggal, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addContainerGap())
      );
      layout.setVerticalGroup(
         layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(layout.createSequentialGroup()
            .addContainerGap()
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
               .addComponent(btnTambahBarang)
               .addComponent(btnHapusBarang)
               .addComponent(btnSimpanTransaksi)
               .addComponent(btnBatal))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addGroup(layout.createSequentialGroup()
                  .addGap(20, 20, 20)
                  .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                     .addComponent(jLabel2)
                     .addComponent(tTanggal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
               .addGroup(layout.createSequentialGroup()
                  .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                  .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                     .addComponent(jLabel1)
                     .addComponent(tKode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                  .addGap(6, 6, 6)
                  .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                     .addComponent(jLabel4)
                     .addComponent(cbPelanggan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
            .addGap(21, 21, 21)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                  .addComponent(jLabel3)
                  .addComponent(tNamaBarang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                  .addComponent(btnCari))
               .addComponent(tRupiah, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(18, 18, 18)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE)
            .addContainerGap())
      );

      pack();
   }// </editor-fold>//GEN-END:initComponents

  private void btnCariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCariActionPerformed
      penjualanController.cariData(tNamaBarang.getText());
  }//GEN-LAST:event_btnCariActionPerformed

  private void btnTambahBarangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTambahBarangActionPerformed
      penjualanController.addBarang();
  }//GEN-LAST:event_btnTambahBarangActionPerformed

  private void btnHapusBarangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHapusBarangActionPerformed
      penjualanController.removeBarang();
  }//GEN-LAST:event_btnHapusBarangActionPerformed

  private void btnSimpanTransaksiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSimpanTransaksiActionPerformed
      penjualanController.simpanTransaksi();
  }//GEN-LAST:event_btnSimpanTransaksiActionPerformed

  private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
      Date date = new Date();
      SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
      tTanggal.setText(sdf.format(date));
      penjualanController.ambilPelanggan();
  }//GEN-LAST:event_formComponentShown

   private void cbPelangganActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbPelangganActionPerformed

   }//GEN-LAST:event_cbPelangganActionPerformed

   // Variables declaration - do not modify//GEN-BEGIN:variables
   private javax.swing.JButton btnBatal;
   private javax.swing.JButton btnCari;
   private javax.swing.JButton btnHapusBarang;
   private javax.swing.JButton btnSimpanTransaksi;
   private javax.swing.JButton btnTambahBarang;
   private javax.swing.JComboBox<String> cbPelanggan;
   private javax.swing.JLabel jLabel1;
   private javax.swing.JLabel jLabel2;
   private javax.swing.JLabel jLabel3;
   private javax.swing.JLabel jLabel4;
   private javax.swing.JScrollPane jScrollPane1;
   private javax.swing.JTextField tKode;
   private javax.swing.JTextField tNamaBarang;
   private javax.swing.JTextField tRupiah;
   private javax.swing.JTextField tTanggal;
   private javax.swing.JTable tabelPenjualan;
   // End of variables declaration//GEN-END:variables
}
