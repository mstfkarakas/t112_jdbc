package jdbcUtils;

public class SqlQueries {


    public String schoolTableDataForName(String name){
        String query = "select name,surname,field from school where name='"+name+"';";
        return query;
    }

     public String readingTableData(String tableName) {
         String query = "select * from " +tableName;
         return query;
     }

    public String getRowCountFromTable(String tableName) {
        String query = "select count(*) from " +tableName;
        return query;
    }
     public String employeeSalaryTable(int salary){
        String query = "select first_name, Last_name, salary from employees where salary>"+salary+";" ;
        return query ;
     }

     public String countOccurrenceOfDataInTable(String tableName,String columnName, String nameOfData){
        String query = "select count(*) from " + tableName + " where "+ columnName + " = '" + nameOfData + "'";
        return query;
     }


}
