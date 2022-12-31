/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.Pelanggan;

/**
 *
 * @author Kamelia
 */
public class PelangganDAO {

  private Connection connection;
  private PreparedStatement insertStatement;
  private PreparedStatement updateStatement;
  private PreparedStatement deleteStatement;

  private PreparedStatement getAllPelangganStatement;
  private PreparedStatement getByNamaStatement;

  private final String queryInsert = "INSERT INTO pelanggan_dao(kode,nama,email,alamat) VALUES (?,?,?,?)";
  private final String queryUpdate = "UPDATE pelanggan_dao SET nama=?, email=?, alamat=? WHERE kode=?";
  private final String queryDelete = "DELETE FROM pelanggan_dao where kode=?";

  private final String querySelect = "SELECT * FROM pelanggan_dao";
  private final String cariNama = "SELECT * FROM pelanggan_dao WHERE nama like ?";

  public void setConnection(Connection connection) throws SQLException {
    this.connection = connection;
    insertStatement = this.connection.prepareStatement(queryInsert);
    updateStatement = this.connection.prepareStatement(queryUpdate);
    deleteStatement = this.connection.prepareStatement(queryDelete);

    getAllPelangganStatement = this.connection.prepareStatement(querySelect);
    getByNamaStatement = this.connection.prepareStatement(cariNama);

  }

  public Pelanggan save(Pelanggan p) throws SQLException {
    insertStatement.setString(1, p.getKode());
    insertStatement.setString(2, p.getNama());
    insertStatement.setString(3, p.getEmail());
    insertStatement.setString(4, p.getAlamat());
    insertStatement.executeUpdate();
    return p;
  }

  public Pelanggan update(Pelanggan p) throws SQLException {
    updateStatement.setString(1, p.getNama());
    updateStatement.setString(2, p.getEmail());
    updateStatement.setString(3, p.getAlamat());
    updateStatement.setString(4, p.getKode());
    updateStatement.executeUpdate();
    return p;
  }

  public Pelanggan delete(Pelanggan p) throws SQLException {
    deleteStatement.setString(1, p.getKode());
    deleteStatement.executeUpdate();
    return p;
  }

  public List<Pelanggan> getAllPelanggan() throws SQLException {
    List<Pelanggan> pelanggans = new ArrayList<Pelanggan>();
    ResultSet rs = getAllPelangganStatement.executeQuery();
    while (rs.next()) {
      Pelanggan p = new Pelanggan();
      p.setKode(rs.getString("kode"));
      p.setNama(rs.getString("nama"));
      p.setEmail(rs.getString("email"));
      p.setAlamat(rs.getString("alamat"));
      pelanggans.add(p);
    }
    return pelanggans;
  }

  public List<Pelanggan> getPelangganByNama(String nama) throws SQLException {
    List<Pelanggan> pelanggans = new ArrayList<Pelanggan>();
    getByNamaStatement.setString(1, "%" + nama + "%");
    ResultSet rs = getByNamaStatement.executeQuery();

    while (rs.next()) {
      Pelanggan p = new Pelanggan();
      System.out.println(rs.getString("nama"));
      p.setKode(rs.getString("kode"));
      p.setNama(rs.getString("nama"));
      p.setEmail(rs.getString("email"));
      p.setAlamat(rs.getString("alamat"));
      pelanggans.add(p);
    }
    return pelanggans;
  }
}
