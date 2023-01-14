/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import com.mysql.cj.jdbc.MysqlDataSource;
import java.sql.SQLException;
import model.Person;
import service.impl.ServiceJDBC;

/**
 *
 * @author Kamelia
 */
public class MainJdbc {

  public static void main(String[] args) {
    MysqlDataSource dataSource = new MysqlDataSource();
    dataSource.setUser("root");
    dataSource.setPassword("");
    dataSource.setDatabaseName("penjualan_db");
    dataSource.setServerName("localhost");
    dataSource.setPortNumber(3306);

    ServiceJDBC service = new ServiceJDBC();
    service.setDataSource(dataSource);
    Person person = new Person();
    person.setName("administrator");
    person.setPassword("pwd");
    service.save(person);
    System.out.println("id   : " + person.getId());
    System.out.println("name : " + person.getName());
    try {
      dataSource.getConnection().close();
    } catch (SQLException ex) {
      ex.printStackTrace();
    }
  }
}
