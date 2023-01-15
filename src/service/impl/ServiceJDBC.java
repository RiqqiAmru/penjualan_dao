/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service.impl;

import dao.PersonDAOjdbc;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;
import javax.sql.DataSource;
import model.Person;

/**
 *
 * @author Kamelia
 */
public class ServiceJDBC {

  private PersonDAOjdbc personDao;
  private Connection connection;

  public void setDataSource(DataSource dataSource) {
    try {
      connection = dataSource.getConnection();
      personDao = new PersonDAOjdbc();
      personDao.setConnection(connection);
    } catch (SQLException ex) {
      ex.printStackTrace();
    }
  }

  public Person save(Person person) {
    try {
      connection.setAutoCommit(false);
      personDao.save(person);
      connection.commit();
      connection.setAutoCommit(true);
    } catch (SQLException ex) {
      try {
        connection.rollback();
      } catch (SQLException e) {
        e.printStackTrace();
      }
    }
    return person;
  }

  public Person delete(Person person) {
    try {
      connection.setAutoCommit(false);
      personDao.save(person);
      connection.commit();
      connection.setAutoCommit(true);
    } catch (SQLException ex) {
      try {
        connection.rollback();
      } catch (SQLException e) {
        e.printStackTrace();
      }
    }
    return person;
  }

  public Person getPerson(Long id) {
    try {
      return personDao.getById(id);
    } catch (SQLException ex) {
      ex.printStackTrace();
    }
    return null;
  }

  public List<Person> getPersons() {
    try {
      return personDao.getAll();
    } catch (Exception e) {
      e.printStackTrace();
    }
    return null;
  }
}
