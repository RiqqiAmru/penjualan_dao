package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.Barang;

public class BarangDAO {

  private Connection connection;
  private PreparedStatement insertStatement;
  private PreparedStatement updateStatement;
  private PreparedStatement deleteStatement;

  private PreparedStatement getAllStatement;
  private PreparedStatement getByNamaStatement;

  private final String queryInsert = "INSERT INTO barang_dao(kode,nama,satuan,jumlah,harga) VALUES (?,?,?,?,?)";
  private final String queryUpdate = "UPDATE barang_dao SET nama=?, satuan=?,jumlah=?, harga=? WHERE kode=?";
  private final String queryDelete = "DELETE FROM barang_dao where kode=?";

  private final String querySelect = "SELECT * FROM barang";
  private final String cariNama = "SELECT * FROM barang WHERE nama like ?";

  public void setConnection(Connection connection) throws SQLException {
    this.connection = connection;
    insertStatement = this.connection.prepareStatement(queryInsert);
    updateStatement = this.connection.prepareStatement(queryUpdate);
    deleteStatement = this.connection.prepareStatement(queryDelete);

    getAllStatement = this.connection.prepareStatement(querySelect);
    getByNamaStatement = this.connection.prepareStatement(cariNama);

  }

  public Barang save(Barang barang) throws SQLException {
    insertStatement.setString(1, barang.getKode());
    insertStatement.setString(2, barang.getNama());
    insertStatement.setString(3, barang.getSatuan());
    insertStatement.setInt(4, barang.getJumlah());
    insertStatement.setInt(5, barang.getHarga());
    System.out.println(insertStatement.getMetaData());
    insertStatement.executeUpdate();
    return barang;
  }

  public Barang update(Barang barang) throws SQLException {
    updateStatement.setString(1, barang.getNama());
    updateStatement.setString(2, barang.getSatuan());
    updateStatement.setInt(3, barang.getJumlah());
    updateStatement.setInt(4, barang.getHarga());
    updateStatement.setString(5, barang.getKode());
    updateStatement.executeUpdate();
    return barang;
  }

  public Barang delete(Barang barang) throws SQLException {
    deleteStatement.setString(1, barang.getKode());
    deleteStatement.executeUpdate();
    return barang;
  }

  public List<Barang> getAll() throws SQLException {
    List<Barang> barangs = new ArrayList<Barang>();
    ResultSet rs = getAllStatement.executeQuery();
    while (rs.next()) {
      Barang barang = new Barang();
      barang.setKode(rs.getString("kode"));
      barang.setNama(rs.getString("nama"));
      barang.setSatuan(rs.getString("satuan"));
      barang.setJumlah(rs.getInt("jumlah"));
      barang.setHarga(rs.getInt("harga"));
      barangs.add(barang);
    }
    return barangs;
  }

  public List<Barang> getByNama(String nama) throws SQLException {
    List<Barang> barangs = new ArrayList<Barang>();
    getByNamaStatement.setString(1, "%" + nama + "%");
    ResultSet rs = getByNamaStatement.executeQuery();
    while (rs.next()) {
      Barang barang = new Barang();
      barang.setKode(rs.getString("kode"));
      barang.setNama(rs.getString("nama"));
      barang.setSatuan(rs.getString("satuan"));
      barang.setJumlah(rs.getInt("jumlah"));
      barang.setHarga(rs.getInt("harga"));
      barangs.add(barang);
    }
    return barangs;
  }

} // penutup dari class BarangDao
