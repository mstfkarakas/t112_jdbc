package day01;

public class SqlQueries {


    public String schoolTableDataForName(String name){
        String query = "select name,surname,field from school where name='"+name+"';";
        return query;
    }

     public String readingTableData(String tableName) {
         String query = "select * from " +tableName;
         return query;
     }

     public String employeeSalaryTable(int salary){
        String query = "select first_name, Last_name, salary from employees where salary>"+salary+";" ;
        return query ;
     }


}
