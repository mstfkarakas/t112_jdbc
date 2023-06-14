package day01;


import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.sql.*;

public class Jdbc01 {

    static String databaseUrl = "jdbc:mysql://localhost:3306/team112?serverTimezone=UTC";
    static String username = "root";
    static String password = "ervanaz2012";

    static Statement statement;
    static Connection connection;
    static ResultSet resultSet;

    @BeforeMethod
    public void setUp() {
       try {
           connection = DriverManager.getConnection(databaseUrl, username, password);
           statement = connection.createStatement();
       }catch (SQLException e){
           System.out.println(e.getMessage());
       }
    }


    @Test
    public void productsTableView() throws SQLException {
        resultSet = statement.executeQuery("select * from salesman");
        while (resultSet.next()) {
            System.out.println(resultSet.getInt(1) + " " + resultSet.getString(2) +
                    " " + resultSet.getString(3) + " " + resultSet.getInt(4) + " " + resultSet.getString(5));
        }
    }

    @Test
    public void employeesTable() throws SQLException {
        resultSet = statement.executeQuery("select * from employees where Last_name like '%z%'");
        while (resultSet.next()) {
            System.out.println(resultSet.getInt(1) + "    " + resultSet.getString(2) +
                    "     " + resultSet.getString(3) + "    " + resultSet.getString(4));
        }
        // we can use getString() for all data type, but it is not good approach because
        // when we Assert data it will send an error message
    }

    @Test
    public void staffTableGmail() throws SQLException {
        resultSet = statement.executeQuery("select name,surname,salary from staff where salary>4000");
        while (resultSet.next()) {
            System.out.println(resultSet.getString(1) + "    " + resultSet.getString(2) +
                    "    " + resultSet.getDouble(3));
        }
    }

    @Test
    public void createTable() throws SQLException {
        String createTable = "create table t112(\n" +
                "teamId int primary key,\n" +
                "teamName varchar(50),\n" +
                "teamPlace varchar(50),\n" +
                "country varchar(50)\n" +
                ");";
        statement.execute(createTable) ;

    }

    @AfterMethod
    public void tearDown() {
        try {
            if (statement != null) {
                statement.close();
            }
            if (connection != null) {
                connection.close();
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    // Components of JDBC
    // DriverManager, Driver, Statements, Connection, Resultset, SQLException
}