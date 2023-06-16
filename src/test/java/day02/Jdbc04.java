package day02;

import jdbcUtils.JdbcReusable;
import org.testng.annotations.Test;

public class Jdbc04 {


    static JdbcReusable jdbcReusable = new JdbcReusable();

    @Test
    public void isNameExistPeopleTable(){

        jdbcReusable.isNameExistPeopleTable("Alex");
        jdbcReusable.closeConnnection();
    }

    @Test
    public void isAddressExistPeopleTable() {
        jdbcReusable.isAddressExistPeopleTable("Istanbul");
        jdbcReusable.closeConnnection();
    }

    @Test
    public void isPostcodeExistPeopleTable(){
        jdbcReusable.isPostCodeExistPeopleTable(60100);
        jdbcReusable.closeConnnection();
    }

    @Test
    public void isSSNexistPeopleTable(){
        jdbcReusable.isSSNExistPeopleTable(7412);
        jdbcReusable.closeConnnection();
    }

    @Test
    public void isIDExistCustomerTable(){

        jdbcReusable.customerIdExistCustomerTable(10);
        jdbcReusable.closeConnnection();
    }
    @Test
    public void isNameExistCustomerTable(){

        jdbcReusable.customerNameExistCustomerTable("Mustafa Aksoy");
        jdbcReusable.closeConnnection();
    }

    @Test
    public void isEmailExistCustomerTable(){

        jdbcReusable.emailExistCustomerTable("ayse@example.com");
        jdbcReusable.closeConnnection();
    }
    @Test
    public void isPhoneNoExistCustomerTable(){

        jdbcReusable.phonenumberExistCustomerTable("1234567890");
        jdbcReusable.closeConnnection();
    }
    @Test
    public void isCityExistCustomerTable(){
        jdbcReusable.cityExistCustomerTable("Bursa");
        jdbcReusable.closeConnnection();
    }



}
