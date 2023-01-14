/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import model.Person;

/**
 *
 * @author Kamelia
 */
public class PersonDAOjdbc {

  private Connection connection;
  private PreparedStatement insertStatement;
  private PreparedStatement updateStatement;
  private PreparedStatement deleteStatement;
  private PreparedStatement getByIdStatement;
  private PreparedStatement getAllStatement;
  private final String insertQuery = "insert into T_PERSON(name,password) values(?,?)";
  private final String updateQuery = "update T_person sdt name = ?, password = ? where id = ?";
  private final String deleteQuery = "delete from t_person where id = ?";
  private final String getByIdQuery = "SELECT * FROM T_PERSON where id = ? ";
  private final String getAllQuery = "SELECT * FROM T_PERSON  ";

  public void setConnection(Connection connection) throws SQLException {
    this.connection = connection;
    insertStatement = this.connection.prepareStatement(insertQuery, Statement.RETURN_GENERATED_KEYS);
    updateStatement = this.connection.prepareStatement(updateQuery);
    deleteStatement = this.connection.prepareStatement(deleteQuery);
    getByIdStatement = this.connection.prepareStatement(getByIdQuery);
    getAllStatement = this.connection.prepareStatement(getAllQuery);
  }

  public Person save(Person person) throws SQLException {
    if (person.getId() == 0) {
      insertStatement.setString(1, person.getName());
      insertStatement.setString(2, person.getPassword());
      int id = insertStatement.executeUpdate();
      person.setId(id);
    } else {
      updateStatement.setString(1, person.getName());
      updateStatement.setString(2, person.getPassword());
      updateStatement.setInt(3, person.getId());
      updateStatement.executeUpdate();
    }
    return person;
  }

  public Person delete(Person person) throws SQLException {
    deleteStatement.setInt(1, person.getId());
    deleteStatement.executeUpdate();
    return person;
  }

  public Person getById(Long id) throws SQLException {
    getByIdStatement.setLong(1, id);
    ResultSet rs = getByIdStatement.executeQuery();
//proses mapping dari relational ke object
    if (rs.next()) {
      Person person = new Person();
      person.setId(rs.getInt("id "));
      person.setName(rs.getString("name"));
      person.setPassword(rs.getString("password"));
      return person;
    }
    return null;
  }

  public List<Person> getAll() throws SQLException {
    List<Person> persons = new ArrayList<Person>();
    ResultSet rs = getAllStatement.executeQuery();
    while (rs.next()) {
      Person person = new Person();
      person.setId(rs.getInt("id "));
      person.setName(rs.getString("name"));
      person.setPassword(rs.getString("password"));
      persons.add(person);
    }
    return persons;
  }
}
