/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import model.Penjualan;

/**
 *
 * @author Kamelia
 */
public class PenjualanDAO {

   private Connection connection;
   private PreparedStatement insertStatement;
   private final String queryInsert = "INSERT INTO penjualan VALUES (?,?,?,?)";

   public void setConnection(Connection connection) throws SQLException {
      this.connection = connection;
      insertStatement = this.connection.prepareStatement(queryInsert);
   }

   public Penjualan save(Penjualan penjualan) throws SQLException {
      insertStatement.setString(1, penjualan.getKodePenjualan());
      insertStatement.setObject(2, penjualan.getTanggalPenjualan());
      insertStatement.setDouble(3, penjualan.getTotalTransaksi());
      insertStatement.setString(4, penjualan.getKodePelanggan());
      insertStatement.executeUpdate();
      return penjualan;
   }
}
