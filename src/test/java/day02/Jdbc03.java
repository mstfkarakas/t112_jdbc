package day02;

import day01.SqlQueries;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Jdbc03 {


    static String databaseUrl = "jdbc:mysql://localhost:3306/team112?serverTimezone=UTC";
    static String username = "root";
    static String password = "ervanaz2012";

    static Statement statement;
    static Connection connection;
    static ResultSet resultSet;
    static SqlQueries sqlQueries = new SqlQueries();

    @BeforeMethod
    public void setUp(){
        try {
            connection = DriverManager.getConnection(databaseUrl,username,password);
            statement = connection.createStatement();
        }catch (SQLException e){
            System.out.println(e.getMessage());
        }
    }


   // Retrieve name and surname and salary whose salary is bigger than 8000
    // And check Kaan Burhan is exist in the table
   @Test
   public void employeesTable() throws SQLException {
    resultSet = statement.executeQuery(sqlQueries.employeeSalaryTable(8000));
    while (resultSet.next()){
        System.out.println(resultSet.getString(1)
                +"  "+resultSet.getString(2)+"   "+resultSet.getInt(3));
    }


    List<List<Object>> tableData = new ArrayList<>();
    while (resultSet.next()){
        List<Object> rowData = new ArrayList<>();
        rowData.add(resultSet.getString(1));
        rowData.add(resultSet.getString(2));
        rowData.add(resultSet.getInt(3));
        tableData.add(rowData);
    }

    boolean isNameExist = false;
    for(List<Object> rowData : tableData){
        if(rowData.contains("Bahadir")){
            isNameExist = true;
            break;
        }
    }
       Assert.assertTrue(isNameExist);

   }












    @AfterMethod
    public void tearDown() {
       try {
           if(statement != null){
               statement.close();
           }
           if(connection != null){
               connection.close();
           }
       }catch (SQLException e){
           System.out.println(e.getMessage());
       }



    }


}
