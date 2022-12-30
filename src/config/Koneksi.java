package config;

import com.mysql.cj.jdbc.MysqlDataSource;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Koneksi {

  protected static Connection konek;

  public static Connection getKoneksi() {
    if (konek == null) {
      MysqlDataSource dataSource = new MysqlDataSource();
      dataSource.setDatabaseName("penjualan_db");
      dataSource.setUser("root");
      dataSource.setPassword("");
      dataSource.setServerName("localhost");
      dataSource.setPort(3306);
      try {
        konek = dataSource.getConnection();
      } catch (SQLException ex) {
        Logger.getLogger(Koneksi.class.getName()).log(Level.SEVERE, null, ex);
      }
    }
    return konek;
  }
}
