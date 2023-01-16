/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import model.PenjualanDetail;

/**
 *
 * @author Kamelia
 */
public class PenjualanDetailDAO {

   private Connection connection;
   private PreparedStatement insertStatement;
   private final String queryInsert = "INSERT INTO penjualan_detail "
           + "(kode_barang, jumlah, harga, subtotal, kode_penjualan)"
           + "VALUES (?,?,?,?,?)";

   public void setConnection(Connection connection) throws SQLException {
      this.connection = connection;
      insertStatement = this.connection.prepareStatement(queryInsert);
   }

   public PenjualanDetail save(PenjualanDetail penjualanDetail) throws SQLException {
      insertStatement.setString(1, penjualanDetail.getBarang().getKode());
      insertStatement.setInt(2, penjualanDetail.getJumlah());
      insertStatement.setDouble(3, penjualanDetail.getHarga());
      insertStatement.setDouble(4, penjualanDetail.getSubtotal());
      insertStatement.setString(5, penjualanDetail.getPenjualan().getKodePenjualan());
      insertStatement.executeUpdate();
      return penjualanDetail;
   }
}
