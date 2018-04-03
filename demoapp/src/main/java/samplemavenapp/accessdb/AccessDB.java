package samplemavenapp.accessdb;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;


public class AccessDB {
	  private Connection connect = null;
	  private Statement statement = null;
	  private PreparedStatement preparedStatement = null;
	  private ResultSet resultSet = null;
	  
	  final private String host = "localhost";
	  final private String user = "root";
	  final private String passwd = "rockstar@31";
	  
	  public void readDataBase() throws Exception {
	    try {
	      // This will load the MySQL driver, each DB has its own driver
	      Class.forName("com.mysql.jdbc.Driver");
	      
	      // Setup the connection with the DB
	      connect = DriverManager
	          .getConnection("jdbc:mysql://" + host + "/random?"
	              + "user=" + user + "&password=" + passwd );

	      // Statements allow to issue SQL queries to the database
	      statement = connect.createStatement();
	      // Result set get the result of the SQL query
	      resultSet = statement
	          .executeQuery("select * from random.user_details");
	      writeResultSet(resultSet);

	      // PreparedStatements can use variables and are more efficient
//	      preparedStatement = connect
//	          .prepareStatement("insert into  feedback.comments values (default, ?, ?, ?, ? , ?, ?)");
//	      // "myuser, webpage, datum, summary, COMMENTS from feedback.comments");
//	      // Parameters start with 1
//	      preparedStatement.setString(1, "Test");
//	      preparedStatement.setString(2, "TestEmail");
//	      preparedStatement.setString(3, "TestWebpage");
//	      preparedStatement.setDate(4, new java.sql.Date(2009, 12, 11));
//	      preparedStatement.setString(5, "TestSummary");
//	      preparedStatement.setString(6, "TestComment");
//	      preparedStatement.executeUpdate();


	      // Remove again the insert comment
//	      preparedStatement = connect
//	      .prepareStatement("delete from feedback.comments where myuser= ? ; ");
//	      preparedStatement.setString(1, "Test");
//	      preparedStatement.executeUpdate();
	      
//	      resultSet = statement
//	      .executeQuery("select * from feedback.comments");
//	      writeMetaData(resultSet);
	      
	    } catch (Exception e) {
	      throw e;
	    } finally {
	      close();
	    }

	  }

	  private void writeMetaData(ResultSet resultSet) throws SQLException {
	    //   Now get some metadata from the database
	    // Result set get the result of the SQL query
	    
	    System.out.println("The columns in the table are: ");
	    
	    System.out.println("Table: " + resultSet.getMetaData().getTableName(1));
	    for  (int i = 1; i<= resultSet.getMetaData().getColumnCount(); i++){
	      System.out.println("Column " +i  + " "+ resultSet.getMetaData().getColumnName(i));
	    }
	  }

	  private void writeResultSet(ResultSet resultSet) throws SQLException {
	    // ResultSet is initially before the first data set
	    while (resultSet.next()) {
	      // It is possible to get the columns via name
	      // also possible to get the columns via the column number
	      // which starts at 1
	      // e.g. resultSet.getSTring(2);
	      String user = resultSet.getString("id");
	      String email = resultSet.getString("email");
	      String firstName = resultSet.getString("first_name");
//	      Date date = resultSet.getDate("last_name");
	      String lastName = resultSet.getString("last_name");
	      String password = resultSet.getString("password");
	      System.out.println("ID: " + user);
	      System.out.println("EMail: " + email);
	      System.out.println("FirstName: " + firstName);
	      System.out.println("LastName: " + lastName);
	      System.out.println("Password: " + password);
	    }
	  }

	  // You need to close the resultSet
	  private void close() {
	    try {
	      if (resultSet != null) {
	        resultSet.close();
	      }

	      if (statement != null) {
	        statement.close();
	      }

	      if (connect != null) {
	        connect.close();
	      }
	    } catch (Exception e) {

	    }
	  }


}