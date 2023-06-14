package jdbcUtils;

import day01.SqlQueries;
import org.testng.Assert;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class JdbcReusable {


    static String databaseUrl = "jdbc:mysql://localhost:3306/team112?serverTimezone=UTC";
    static String username = "root";
    static String password = "ervanaz2012";

    static Statement statement;
    static Connection connection;
    static ResultSet resultSet;
    static SqlQueries sqlQueries = new SqlQueries();


    public void isNameExistPeopleTable(String name){
        List<List<Object>> tableData = null ;
        try {
            connection = DriverManager.getConnection(databaseUrl,username,password);
            statement = connection.createStatement();
            resultSet = statement.executeQuery(sqlQueries.readingTableData("people"));
            tableData = new ArrayList<>() ;
            while (resultSet.next()){
                List<Object> rowData = new ArrayList<>();
                rowData.add(resultSet.getInt(1));
                rowData.add(resultSet.getString(2));
                rowData.add(resultSet.getString(3));
                rowData.add(resultSet.getInt(4));
                tableData.add(rowData) ;
            }
        }catch (SQLException e){
            System.out.println(e.getMessage());
        }

        boolean isNameFound = false;
        for(List<Object>rowData : tableData){
            if(rowData.contains(name)){
                isNameFound = true ;
                break;
            }
        }
        Assert.assertTrue(isNameFound);
    }

    public void isAddressExistPeopleTable(String address){
        List<List<Object>> tableData = null ;
        try {
            connection = DriverManager.getConnection(databaseUrl,username,password);
            statement = connection.createStatement();
            resultSet = statement.executeQuery(sqlQueries.readingTableData("people"));
            tableData = new ArrayList<>() ;
            while (resultSet.next()){
                List<Object> rowData = new ArrayList<>();
                rowData.add(resultSet.getInt(1));
                rowData.add(resultSet.getString(2));
                rowData.add(resultSet.getString(3));
                rowData.add(resultSet.getInt(4));
                tableData.add(rowData) ;
            }
        }catch (SQLException e){
            System.out.println(e.getMessage());
        }

        boolean isAddressFound = false;
        for(List<Object>rowData : tableData){
            if(rowData.contains(address)){
                isAddressFound = true ;
                break;
            }
        }
        Assert.assertTrue(isAddressFound);
    }

    public void isPostCodeExistPeopleTable(int postcode){
        List<List<Object>> tableData = null ;
        try {
            connection = DriverManager.getConnection(databaseUrl,username,password);
            statement = connection.createStatement();
            resultSet = statement.executeQuery(sqlQueries.readingTableData("people"));
            tableData = new ArrayList<>() ;
            while (resultSet.next()){
                List<Object> rowData = new ArrayList<>();
                rowData.add(resultSet.getInt(1));
                rowData.add(resultSet.getString(2));
                rowData.add(resultSet.getString(3));
                rowData.add(resultSet.getInt(4));
                tableData.add(rowData) ;
            }
        }catch (SQLException e){
            System.out.println(e.getMessage());
        }

        boolean isPostCodeFound = false;
        for(List<Object>rowData : tableData){
            if(rowData.contains(postcode)){
                isPostCodeFound = true ;
                break;
            }
        }
        Assert.assertTrue(isPostCodeFound);
    }

    public void isSSNExistPeopleTable(int ssn){
        List<List<Object>> tableData = null ;
        try {
            connection = DriverManager.getConnection(databaseUrl,username,password);
            statement = connection.createStatement();
            resultSet = statement.executeQuery(sqlQueries.readingTableData("people"));
            tableData = new ArrayList<>() ;
            while (resultSet.next()){
                List<Object> rowData = new ArrayList<>();
                rowData.add(resultSet.getInt(1));
                rowData.add(resultSet.getString(2));
                rowData.add(resultSet.getString(3));
                rowData.add(resultSet.getInt(4));
                tableData.add(rowData) ;
            }
        }catch (SQLException e){
            System.out.println(e.getMessage());
        }

        boolean isSSNFound = false;
        for(List<Object>rowData : tableData){
            if(rowData.contains(ssn)){
                isSSNFound = true ;
                break;
            }
        }
        Assert.assertTrue(isSSNFound);
    }


    public void customerIdExistCustomerTable(int id){
        List<List<Object>> tableData = null ;
        try {
            connection = DriverManager.getConnection(databaseUrl,username,password);
            statement = connection.createStatement();
            resultSet = statement.executeQuery(sqlQueries.readingTableData("customer"));
            tableData = new ArrayList<>() ;
            while (resultSet.next()){
                List<Object> rowData = new ArrayList<>();
                rowData.add(resultSet.getInt(1));
                rowData.add(resultSet.getString(2));
                rowData.add(resultSet.getString(3));
                rowData.add(resultSet.getString(4));
                rowData.add(resultSet.getString(5));
                tableData.add(rowData) ;
            }
        }catch (SQLException e){
            System.out.println(e.getMessage());
        }

        boolean isCustomerIdFound = false;
        for(List<Object>rowData : tableData){
            if(rowData.contains(id)){
                isCustomerIdFound = true ;
                break;
            }
        }
        Assert.assertTrue(isCustomerIdFound);
    }

    public void customerNameExistCustomerTable(String customerName){
        List<List<Object>> tableData = null ;
        try {
            connection = DriverManager.getConnection(databaseUrl,username,password);
            statement = connection.createStatement();
            resultSet = statement.executeQuery(sqlQueries.readingTableData("customer"));
            tableData = new ArrayList<>() ;
            while (resultSet.next()){
                List<Object> rowData = new ArrayList<>();
                rowData.add(resultSet.getInt(1));
                rowData.add(resultSet.getString(2));
                rowData.add(resultSet.getString(3));
                rowData.add(resultSet.getString(4));
                rowData.add(resultSet.getString(5));
                tableData.add(rowData) ;
            }
        }catch (SQLException e){
            System.out.println(e.getMessage());
        }

        boolean iscustomerNameFound = false;
        for(List<Object>rowData : tableData){
            if(rowData.contains(customerName)){
                iscustomerNameFound = true ;
                break;
            }
        }
        Assert.assertTrue(iscustomerNameFound);
    }

    public void emailExistCustomerTable(String email){
        List<List<Object>> tableData = null ;
        try {
            connection = DriverManager.getConnection(databaseUrl,username,password);
            statement = connection.createStatement();
            resultSet = statement.executeQuery(sqlQueries.readingTableData("customer"));
            tableData = new ArrayList<>() ;
            while (resultSet.next()){
                List<Object> rowData = new ArrayList<>();
                rowData.add(resultSet.getInt(1));
                rowData.add(resultSet.getString(2));
                rowData.add(resultSet.getString(3));
                rowData.add(resultSet.getString(4));
                rowData.add(resultSet.getString(5));
                tableData.add(rowData) ;
            }
        }catch (SQLException e){
            System.out.println(e.getMessage());
        }

        boolean isEmailFound = false;
        for(List<Object>rowData : tableData){
            if(rowData.contains(email)){
                isEmailFound = true ;
                break;
            }
        }
        Assert.assertTrue(isEmailFound);
    }
    public void phonenumberExistCustomerTable(String phone){
        List<List<Object>> tableData = null ;
        try {
            connection = DriverManager.getConnection(databaseUrl,username,password);
            statement = connection.createStatement();
            resultSet = statement.executeQuery(sqlQueries.readingTableData("customer"));
            tableData = new ArrayList<>() ;
            while (resultSet.next()){
                List<Object> rowData = new ArrayList<>();
                rowData.add(resultSet.getInt(1));
                rowData.add(resultSet.getString(2));
                rowData.add(resultSet.getString(3));
                rowData.add(resultSet.getString(4));
                rowData.add(resultSet.getString(5));
                tableData.add(rowData) ;
            }
        }catch (SQLException e){
            System.out.println(e.getMessage());
        }

        boolean isPhoneNumberFound = false;
        for(List<Object>rowData : tableData){
            if(rowData.contains(phone)){
                isPhoneNumberFound = true ;
                break;
            }
        }
        Assert.assertTrue(isPhoneNumberFound);
    }
    public void cityExistCustomerTable(String city){
        List<List<Object>> tableData = null ;
        try {
            connection = DriverManager.getConnection(databaseUrl,username,password);
            statement = connection.createStatement();
            resultSet = statement.executeQuery(sqlQueries.readingTableData("customer"));
            tableData = new ArrayList<>() ;
            while (resultSet.next()){
                List<Object> rowData = new ArrayList<>();
                rowData.add(resultSet.getInt(1));
                rowData.add(resultSet.getString(2));
                rowData.add(resultSet.getString(3));
                rowData.add(resultSet.getString(4));
                rowData.add(resultSet.getString(5));
                tableData.add(rowData) ;
            }
        }catch (SQLException e){
            System.out.println(e.getMessage());
        }

        boolean isCityFound = false;
        for(List<Object>rowData : tableData){
            if(rowData.contains(city)){
                isCityFound = true ;
                break;
            }
        }
        Assert.assertTrue(isCityFound);
    }
}
