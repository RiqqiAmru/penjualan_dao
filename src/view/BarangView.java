/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package view;

import controller.BarangController;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;

/**
 *
 * @author Kamelia
 */
public class BarangView extends javax.swing.JInternalFrame {

   /**
    * Creates new form NewJInternalFrame
    */
   public BarangController barangController;

   public BarangView() {
      initComponents();
      barangController = new BarangController(this);
      barangController.enableForm(false);
      barangController.refreshTabel();
      tabelBarang.getSelectionModel()
              .addListSelectionListener(barangController.new BarangTableSelectionListener(tabelBarang));
   }

   public JButton getBtnBaru() {
      return btnBaru;
   }

   public JButton getBtnHapus() {
      return btnHapus;
   }

   public JButton getBtnSimpan() {
      return btnSimpan;
   }

   public JComboBox<String> getCmbSatuan() {
      return cmbSatuan;
   }

   public JTextField gettCari() {
      return tCari;
   }

   public JButton getBtnUpdate() {
      return btnUpdate;
   }

   public JScrollPane getjScrollPane1() {
      return jScrollPane1;
   }

   public JTextField gettCariNama() {
      return tCari;
   }

   public JTextField gettHarga() {
      return tHarga;
   }

   public JTextField gettJumlah() {
      return tJumlah;
   }

   public JTextField gettKode() {
      return tKode;
   }

   public JTextField gettNama() {
      return tNama;
   }

   public JTable getTabelBarang() {
      return tabelBarang;
   }

   /**
    * This method is called from within the constructor to initialize the form.
    * WARNING: Do NOT modify this code. The content of this method is always
    * regenerated by the Form Editor.
    */
   @SuppressWarnings("unchecked")
   // <editor-fold defaultstate="collapsed" desc="Generated
   // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
   private void initComponents() {

      jLabel7 = new javax.swing.JLabel();
      jLabel8 = new javax.swing.JLabel();
      jPanel1 = new javax.swing.JPanel();
      btnBaru = new javax.swing.JButton();
      jLabel1 = new javax.swing.JLabel();
      btnHapus = new javax.swing.JButton();
      jLabel2 = new javax.swing.JLabel();
      btnSimpan = new javax.swing.JButton();
      jLabel3 = new javax.swing.JLabel();
      jLabel4 = new javax.swing.JLabel();
      jLabel5 = new javax.swing.JLabel();
      tKode = new javax.swing.JTextField();
      tNama = new javax.swing.JTextField();
      cmbSatuan = new javax.swing.JComboBox<>();
      tJumlah = new javax.swing.JTextField();
      tHarga = new javax.swing.JTextField();
      jScrollPane1 = new javax.swing.JScrollPane();
      tabelBarang = new javax.swing.JTable();
      jLabel6 = new javax.swing.JLabel();
      tCari = new javax.swing.JTextField();
      btnUpdate = new javax.swing.JButton();

      jLabel7.setText("jLabel7");

      jLabel8.setText("jLabel8");

      setClosable(true);
      setMaximizable(true);
      setResizable(true);
      setTitle("Form Barang");

      javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
      jPanel1.setLayout(jPanel1Layout);
      jPanel1Layout.setHorizontalGroup(
         jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGap(0, 0, Short.MAX_VALUE)
      );
      jPanel1Layout.setVerticalGroup(
         jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGap(0, 200, Short.MAX_VALUE)
      );

      btnBaru.setText("BARU");
      btnBaru.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            btnBaruActionPerformed(evt);
         }
      });

      jLabel1.setText("Kode");

      btnHapus.setText("HAPUS");
      btnHapus.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            btnHapusActionPerformed(evt);
         }
      });

      jLabel2.setText("Nama");

      btnSimpan.setText("SIMPAN");
      btnSimpan.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            btnSimpanActionPerformed(evt);
         }
      });

      jLabel3.setText("Satuan");

      jLabel4.setText("Jumlah");

      jLabel5.setText("Harga");

      cmbSatuan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "----- pilih -----", "kilo", "liter", "box" }));

      tJumlah.setText("0");

      tHarga.setText("0");

      tabelBarang.setModel(new javax.swing.table.DefaultTableModel(
         new Object [][] {

         },
         new String [] {
            "NO", "KODE", "NAMA", "SATUAN", "JUMLAH", "HARGA"
         }
      ));
      jScrollPane1.setViewportView(tabelBarang);

      jLabel6.setText("Cari Barang Berdasarkan Nama");

      tCari.addKeyListener(new java.awt.event.KeyAdapter() {
         public void keyReleased(java.awt.event.KeyEvent evt) {
            tCariKeyReleased(evt);
         }
      });

      btnUpdate.setText("UPDATE");
      btnUpdate.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            btnUpdateActionPerformed(evt);
         }
      });

      javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
      getContentPane().setLayout(layout);
      layout.setHorizontalGroup(
         layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(layout.createSequentialGroup()
            .addContainerGap()
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addGroup(layout.createSequentialGroup()
                  .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                  .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                  .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                     .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 628, javax.swing.GroupLayout.PREFERRED_SIZE)
                     .addGroup(layout.createSequentialGroup()
                        .addComponent(btnBaru)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSimpan)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnHapus)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tCari, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
                     .addGroup(layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addComponent(btnUpdate))))
               .addGroup(layout.createSequentialGroup()
                  .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                     .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                           .addComponent(jLabel1)
                           .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                           .addComponent(tNama, javax.swing.GroupLayout.DEFAULT_SIZE, 98, Short.MAX_VALUE)
                           .addComponent(tKode)))
                     .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cmbSatuan, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                     .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                           .addComponent(jLabel4)
                           .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                           .addComponent(tJumlah, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                           .addGroup(layout.createSequentialGroup()
                              .addComponent(tHarga)
                              .addGap(2, 2, 2)))))
                  .addGap(0, 0, Short.MAX_VALUE)))
            .addContainerGap())
      );
      layout.setVerticalGroup(
         layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(layout.createSequentialGroup()
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
               .addComponent(jLabel1)
               .addComponent(tKode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
               .addComponent(tNama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
               .addComponent(jLabel2))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
               .addComponent(jLabel3)
               .addComponent(cmbSatuan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(15, 15, 15)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
               .addComponent(jLabel4)
               .addComponent(tJumlah, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
               .addComponent(jLabel5)
               .addComponent(tHarga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
               .addGroup(layout.createSequentialGroup()
                  .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                     .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel6)
                        .addComponent(tCari, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                     .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                           .addComponent(btnBaru)
                           .addComponent(btnSimpan)
                           .addComponent(btnHapus))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnUpdate)))
                  .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                  .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addContainerGap())
      );

      pack();
   }// </editor-fold>//GEN-END:initComponents

   private void btnBaruActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnBaruActionPerformed
      barangController.enableForm(true);
      barangController.clearForm();
      btnUpdate.setEnabled(false);
      btnHapus.setEnabled(false);
   }// GEN-LAST:event_btnBaruActionPerformed

   private void btnSimpanActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnSimpanActionPerformed
      barangController.simpan();
      barangController.clearForm();
      barangController.enableForm(false);
      barangController.refreshTabel();
   }// GEN-LAST:event_btnSimpanActionPerformed

   private void btnHapusActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnHapusActionPerformed
      int konfirmasi = JOptionPane.showConfirmDialog(this,
              "Apakah anda yakin akan menghapus data ini?",
              "Konfirmasi Hapus Data", JOptionPane.YES_NO_OPTION);
      if (konfirmasi == 0) {
         barangController.delete();
         barangController.clearForm();
         barangController.enableForm(false);
         barangController.refreshTabel();
      }
   }// GEN-LAST:event_btnHapusActionPerformed

   private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnUpdateActionPerformed
      barangController.update();
      barangController.clearForm();
      barangController.enableForm(false);
      barangController.refreshTabel();
   }// GEN-LAST:event_btnUpdateActionPerformed

   private void tCariKeyReleased(java.awt.event.KeyEvent evt) {// GEN-FIRST:event_tCariKeyReleased
      barangController.cariData();
   }// GEN-LAST:event_tCariKeyReleased

   // Variables declaration - do not modify//GEN-BEGIN:variables
   private javax.swing.JButton btnBaru;
   private javax.swing.JButton btnHapus;
   private javax.swing.JButton btnSimpan;
   private javax.swing.JButton btnUpdate;
   private javax.swing.JComboBox<String> cmbSatuan;
   private javax.swing.JLabel jLabel1;
   private javax.swing.JLabel jLabel2;
   private javax.swing.JLabel jLabel3;
   private javax.swing.JLabel jLabel4;
   private javax.swing.JLabel jLabel5;
   private javax.swing.JLabel jLabel6;
   private javax.swing.JLabel jLabel7;
   private javax.swing.JLabel jLabel8;
   private javax.swing.JPanel jPanel1;
   private javax.swing.JScrollPane jScrollPane1;
   private javax.swing.JTextField tCari;
   private javax.swing.JTextField tHarga;
   private javax.swing.JTextField tJumlah;
   private javax.swing.JTextField tKode;
   private javax.swing.JTextField tNama;
   private javax.swing.JTable tabelBarang;
   // End of variables declaration//GEN-END:variables
}
