/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package view;

import controller.PelangganController;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;

/**
 *
 * @author Kamelia
 */
public class PelangganView extends javax.swing.JInternalFrame {

   public JButton getBtnBaru() {
      return btnBaru;
   }

   public JTextField gettCari() {
      return tCari;
   }

   public JButton getBtnHapus() {
      return btnHapus;
   }

   public JTextField gettAlamat() {
      return tAlamat;
   }

   public JButton getBtnSimpan() {
      return btnSimpan;
   }

   public JButton getBtnUpdate() {
      return btnUpdate;
   }

   public JTextField gettEmail() {
      return tEmail;
   }

   public JTextField gettKode() {
      return tKode;
   }

   public JTextField gettNama() {
      return tNama;
   }

   public JTable getTabelPelanggan() {
      return tabelPelanggan;
   }

   public PelangganController pelangganController;

   /**
    * Creates new form PelangganViewRiqqi
    */
   public PelangganView() {
      initComponents();
      pelangganController = new PelangganController(this);
      pelangganController.enableForm(false);
      pelangganController.refreshTabel();
      tabelPelanggan.getSelectionModel().addListSelectionListener(pelangganController.new PelangganTableSelectionListener(tabelPelanggan));
   }

   /**
    * This method is called from within the constructor to initialize the form.
    * WARNING: Do NOT modify this code. The content of this method is always
    * regenerated by the Form Editor.
    */
   @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    jLabel1 = new javax.swing.JLabel();
    jLabel2 = new javax.swing.JLabel();
    jLabel3 = new javax.swing.JLabel();
    jLabel4 = new javax.swing.JLabel();
    tKode = new javax.swing.JTextField();
    tAlamat = new javax.swing.JTextField();
    tEmail = new javax.swing.JTextField();
    tNama = new javax.swing.JTextField();
    btnBaru = new javax.swing.JButton();
    btnHapus = new javax.swing.JButton();
    btnSimpan = new javax.swing.JButton();
    jScrollPane1 = new javax.swing.JScrollPane();
    tabelPelanggan = new javax.swing.JTable();
    btnUpdate = new javax.swing.JButton();
    jLabel5 = new javax.swing.JLabel();
    tCari = new javax.swing.JTextField();

    setClosable(true);
    setMaximizable(true);
    setResizable(true);
    setTitle("Form Pelanggan");

    jLabel1.setText("Kode");

    jLabel2.setText("Nama");

    jLabel3.setText("Email");

    jLabel4.setText("Alamat");

    btnBaru.setText("BARU");
    btnBaru.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnBaruActionPerformed(evt);
      }
    });

    btnHapus.setText("HAPUS");
    btnHapus.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnHapusActionPerformed(evt);
      }
    });

    btnSimpan.setText("SIMPAN");
    btnSimpan.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnSimpanActionPerformed(evt);
      }
    });

    tabelPelanggan.setModel(new javax.swing.table.DefaultTableModel(
      new Object [][] {

      },
      new String [] {
        "NO", "KODE", "NAMA", "EMAIL", "ALAMAT"
      }
    ));
    jScrollPane1.setViewportView(tabelPelanggan);

    btnUpdate.setText("UPDATE");
    btnUpdate.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnUpdateActionPerformed(evt);
      }
    });

    jLabel5.setText("Cari Pelanggan berdasarkan nama");

    tCari.addKeyListener(new java.awt.event.KeyAdapter() {
      public void keyReleased(java.awt.event.KeyEvent evt) {
        tCariKeyReleased(evt);
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
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addComponent(jLabel3)
              .addComponent(jLabel4))
            .addGap(20, 20, 20)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
              .addComponent(tEmail, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
              .addComponent(tAlamat))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel5))
          .addGroup(layout.createSequentialGroup()
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addGroup(layout.createSequentialGroup()
                .addComponent(btnBaru)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSimpan)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnHapus)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnUpdate)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tCari, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
              .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                .addComponent(tNama, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                  .addComponent(jLabel1)
                  .addGap(29, 29, 29)
                  .addComponent(tKode, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
              .addComponent(jLabel2))
            .addGap(0, 0, Short.MAX_VALUE)))
        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
      .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
    );
    layout.setVerticalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addContainerGap()
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jLabel1)
          .addComponent(tKode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(tNama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(jLabel2))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(tEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(jLabel3))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(tAlamat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(jLabel4)
          .addComponent(jLabel5))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(btnBaru)
          .addComponent(btnSimpan)
          .addComponent(btnHapus)
          .addComponent(btnUpdate)
          .addComponent(tCari, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addContainerGap(15, Short.MAX_VALUE))
    );

    pack();
  }// </editor-fold>//GEN-END:initComponents

  private void btnBaruActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBaruActionPerformed
      pelangganController.enableForm(true);
      pelangganController.clearForm();
      btnUpdate.setEnabled(false);
      btnHapus.setEnabled(false);
  }//GEN-LAST:event_btnBaruActionPerformed

  private void btnSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSimpanActionPerformed
      pelangganController.simpan();
      pelangganController.clearForm();
      pelangganController.enableForm(false);
      pelangganController.refreshTabel();
  }//GEN-LAST:event_btnSimpanActionPerformed

  private void btnHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHapusActionPerformed
      int konfirmasi = JOptionPane.showConfirmDialog(this,
              "Apakah anda yakin akan menghapus data ini?",
              "Konfirmasi Hapus Data", JOptionPane.YES_NO_OPTION);
      if (konfirmasi == 0) {
         pelangganController.delete();
         pelangganController.clearForm();
         pelangganController.enableForm(false);
         pelangganController.refreshTabel();
      }
  }//GEN-LAST:event_btnHapusActionPerformed

  private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
      pelangganController.update();
      pelangganController.clearForm();
      pelangganController.enableForm(false);
      pelangganController.refreshTabel();
  }//GEN-LAST:event_btnUpdateActionPerformed

  private void tCariKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tCariKeyReleased
      pelangganController.cariData();
  }//GEN-LAST:event_tCariKeyReleased

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JButton btnBaru;
  private javax.swing.JButton btnHapus;
  private javax.swing.JButton btnSimpan;
  private javax.swing.JButton btnUpdate;
  private javax.swing.JLabel jLabel1;
  private javax.swing.JLabel jLabel2;
  private javax.swing.JLabel jLabel3;
  private javax.swing.JLabel jLabel4;
  private javax.swing.JLabel jLabel5;
  private javax.swing.JScrollPane jScrollPane1;
  private javax.swing.JTextField tAlamat;
  private javax.swing.JTextField tCari;
  private javax.swing.JTextField tEmail;
  private javax.swing.JTextField tKode;
  private javax.swing.JTextField tNama;
  private javax.swing.JTable tabelPelanggan;
  // End of variables declaration//GEN-END:variables
}
