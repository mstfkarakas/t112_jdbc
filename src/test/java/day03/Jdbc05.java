package day03;

import jdbcUtils.JdbcReusable;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Jdbc05 {


   static JdbcReusable jdbcReusable = new JdbcReusable();
    @Test
    public void nullDataIsExistPeopleTable(){
        jdbcReusable.isNullDataExistInPeople();
        jdbcReusable.closeConnnection();
    }
    @Test
    public void nullDataIsExistEmployeeTable(){
        jdbcReusable.isNullDataExistInEmployee();
        jdbcReusable.closeConnnection();
    }



    @Test
    public void nullCellCountInPeopleTable(){
        Assert.assertEquals(jdbcReusable.countNullCellsInPeopleTable(),0);
        jdbcReusable.closeConnnection();
    }

    @Test
    public void nullCellCountInEmployeeTable(){
        Assert.assertEquals(jdbcReusable.countNullCellsInEmployeeTable(),0);
        jdbcReusable.closeConnnection();
    }
    @Test
    public void rowCountTestPeopleTable(){
        Assert.assertEquals(jdbcReusable.testRowCountInTable("people"),16);
        jdbcReusable.closeConnnection();
    }

    @Test
    public void rowCountTestOopatTable(){
        Assert.assertEquals(jdbcReusable.testRowCountInTable("oopat"),45);
        jdbcReusable.closeConnnection();
    }

    @Test
    public void counNameInPeopleTable(){

        jdbcReusable.countOccurrenceOfDataInTable("people","firstname","Mustafa");
    }


}
