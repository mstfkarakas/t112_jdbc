package day03;

import jdbcUtils.JdbcReusable;
import jdbcUtils.TestData;
import org.testng.annotations.Test;

public class Jdbc06 {

    // In this class we will use dataprovider

    JdbcReusable jdbcReusable =new JdbcReusable();



    @Test(dataProvider = "verifyNamesPeopleData",dataProviderClass = TestData.class)
    public void isNameExistPeopleTable(String name){
        jdbcReusable.isNameExistPeopleTable(name);
        jdbcReusable.closeConnnection();
    }
    @Test(dataProvider = "verifySSNPeopleData",dataProviderClass = TestData.class)
    public void isSSNExistPeopleTable(int ssn){
        jdbcReusable.isSSNExistPeopleTable(ssn);
        jdbcReusable.closeConnnection();
    }





}
