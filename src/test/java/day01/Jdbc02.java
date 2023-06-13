package day01;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Jdbc02 {


    static String databaseUrl = "jdbc:mysql://localhost:3306/team112?serverTimezone=UTC";
    static String username = "root";
    static String password = "ervanaz2012";

    static Statement statement;
    static Connection connection;
    static ResultSet resultSet;

    static SqlQueries sqlQueries = new SqlQueries();


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
    public void schoolTableData1() throws SQLException {
        resultSet = statement.executeQuery(sqlQueries.schoolTableDataForName("John")) ;
        while (resultSet.next()){
            System.out.println(resultSet.getString(1)+"  "
                    +resultSet.getString(2)+"  "+resultSet.getString(3));
        }
    }

    @Test
    public void schoolTableData2() throws SQLException {
        resultSet = statement.executeQuery(sqlQueries.schoolTableDataForName("James")) ;
        while (resultSet.next()){
            System.out.println(resultSet.getString(1)+"  "
                    +resultSet.getString(2)+"  "+resultSet.getString(3));
        }
    }

    @Test
    public void schoolTableData3() throws SQLException {
        resultSet = statement.executeQuery(sqlQueries.schoolTableDataForName("Okan")) ;
        while (resultSet.next()){
            System.out.println(resultSet.getString(1)+"  "
                    +resultSet.getString(2)+"  "+resultSet.getString(3));
        }
    }

    @Test
    public void peopleTable() throws SQLException {
        resultSet = statement.executeQuery(sqlQueries.readingTableData("people"));
        List<List<Object>> tableData = new ArrayList<>();

        while (resultSet.next()){
            List<Object> rowData = new ArrayList<>();
            rowData.add(resultSet.getInt(1));
            rowData.add(resultSet.getString(2));
            rowData.add(resultSet.getString(3));
            rowData.add(resultSet.getInt(4));
            tableData.add(rowData);
        }

        boolean isDataFound = false ;

        for(List<Object> rowData : tableData){
            if(rowData.contains(60100)) {
                isDataFound = true;
                break;
            }
        }
        Assert.assertTrue(isDataFound);
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
}
