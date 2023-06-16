package jdbcUtils;

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

   public void closeConnnection(){
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

   // to check Null data is in tha table
    public void isNullDataExistInPeople(){
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

        boolean isNullDataFound = false;

        //check if null data exist in any row
        for(List<Object>rowData : tableData){
            if(rowData.contains(null)){
                isNullDataFound = true ;
                break;
            }
        }
        Assert.assertTrue(isNullDataFound);
    }


    public void isNullDataExistInEmployee(){
        List<List<Object>> tableData = null ;
        try {
            connection = DriverManager.getConnection(databaseUrl,username,password);
            statement = connection.createStatement();
            resultSet = statement.executeQuery(sqlQueries.readingTableData("employees"));
            tableData = new ArrayList<>() ;
            while (resultSet.next()){
                List<Object> rowData = new ArrayList<>();
                rowData.add(resultSet.getInt(1));
                rowData.add(resultSet.getString(2));
                rowData.add(resultSet.getString(3));
                rowData.add(resultSet.getString(4));
                rowData.add(resultSet.getDate(5));
                rowData.add(resultSet.getInt(6));
                rowData.add(resultSet.getInt(7));
                tableData.add(rowData) ;
            }
        }catch (SQLException e){
            System.out.println(e.getMessage());
        }
        boolean isNullDataFound = false;

        //check if null data exist in any row
        for(List<Object>rowData : tableData){
            if(rowData.contains(null)){
                isNullDataFound = true ;
                Assert.assertTrue(isNullDataFound);
                break;
            }else {
                Assert.assertFalse(isNullDataFound);
            }
        }
    }

    //The number of null cell in the table

    public int countNullCellsInPeopleTable(){
        int nullCellCount = 0;
        try {
            connection = DriverManager.getConnection(databaseUrl,username,password);
            statement = connection.createStatement();
            resultSet = statement.executeQuery(sqlQueries.readingTableData("people"));
            // ResulSetMetData is an interface provides information about columns in a table,such as column name,
            // column types, number of columns...
            while (resultSet.next()){
              ResultSetMetaData metaData = resultSet.getMetaData();
              int columnCount = metaData.getColumnCount();
              for(int i = 1 ; i<=columnCount; i++){
                  if(resultSet.getObject(i)==null){
                      nullCellCount++;
                  }
              }
            }
        }catch (SQLException e){
            System.out.println(e.getMessage());
        }
        System.out.println(nullCellCount);
        return nullCellCount ;
    }


    public int countNullCellsInEmployeeTable(){
        int nullCellCount = 0;
        try {
            connection = DriverManager.getConnection(databaseUrl,username,password);
            statement = connection.createStatement();
            resultSet = statement.executeQuery(sqlQueries.readingTableData("employees"));
            // ResulSetMetData is an interface provides information about columns in a table,such as column name,
            // column types, number of columns...
            while (resultSet.next()){
                ResultSetMetaData metaData = resultSet.getMetaData();
                int columnCount = metaData.getColumnCount();
                for(int i = 1 ; i<=columnCount; i++){
                    if(resultSet.getObject(i)==null){
                        nullCellCount++;
                    }
                }
            }
        }catch (SQLException e){
            System.out.println(e.getMessage());
        }
        System.out.println(nullCellCount);
        return nullCellCount ;
    }

    // this method tests to assert that the number of rows in the sql table

    public int testRowCountInTable(String tableName){
        int actualRowCount = 0;
        try {
            connection = DriverManager.getConnection(databaseUrl,username,password);
            statement = connection.createStatement();
            resultSet = statement.executeQuery(sqlQueries.getRowCountFromTable(tableName));
            if(resultSet.next()){
                actualRowCount = resultSet.getInt(1);
            }
        }catch (SQLException e){
            System.out.println(e.getMessage());
        }
        return actualRowCount ;
    }

   //Calculate how many occurrence of a specific data exist in the table

    public int countOccurrenceOfDataInTable(String tableName,String columnName,String nameOfData){
        int dataCount = 0;
        try {
            connection = DriverManager.getConnection(databaseUrl,username,password);
            statement = connection.createStatement();
            resultSet = statement.executeQuery(sqlQueries.countOccurrenceOfDataInTable(tableName,columnName,nameOfData));
            if(resultSet.next()){
                dataCount = resultSet.getInt(1);
            }
        }catch (SQLException e){
            System.out.println(e.getMessage());
        }
        System.out.println(nameOfData+ " is repeating "+ dataCount+" times");
        return dataCount ;
    }





}
