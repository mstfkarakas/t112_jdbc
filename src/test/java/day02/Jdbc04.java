package day02;

import jdbcUtils.JdbcReusable;
import org.testng.annotations.Test;

public class Jdbc04 {


    static JdbcReusable jdbcReusable = new JdbcReusable();

    @Test
    public void isNameExistPeopleTable(){
        jdbcReusable.isNameExistPeopleTable("Alex");
    }

    @Test
    public void isAddressExistPeopleTable() {
        jdbcReusable.isAddressExistPeopleTable("Istanbul");
    }

    @Test
    public void isPostcodeExistPeopleTable(){
        jdbcReusable.isPostCodeExistPeopleTable(60100);
    }

    @Test
    public void isSSNexistPeopleTable(){
        jdbcReusable.isSSNExistPeopleTable(7412);
    }

    @Test
    public void isIDExistCustomerTable(){
        jdbcReusable.customerIdExistCustomerTable(10);
    }
    @Test
    public void isNameExistCustomerTable(){
        jdbcReusable.customerNameExistCustomerTable("Mustafa Aksoy");
    }

    @Test
    public void isEmailExistCustomerTable(){
        jdbcReusable.emailExistCustomerTable("ayse@example.com");
    }
    @Test
    public void isPhoneNoExistCustomerTable(){
        jdbcReusable.phonenumberExistCustomerTable("1234567890");
    }
    @Test
    public void isCityExistCustomerTable(){
        jdbcReusable.cityExistCustomerTable("Bursa");
    }
}
