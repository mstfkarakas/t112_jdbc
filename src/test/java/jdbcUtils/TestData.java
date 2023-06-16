package jdbcUtils;

import org.testng.annotations.DataProvider;

public class TestData {


    @DataProvider(name = "verifyNamesPeopleData")
    public static Object[][] nameVerify(){
        return new Object[][]{
                {"Ali Can"},{"Veli Cem"},{"Mine"},{"Ahmet"},{"Osman"},{"Erva"},{"Naz"},{"Ahmet"},
                {"Mine"},{"Ali"},{"Mustafa"},{"Mustafa"},{"Eda"},{"Eda"},{"Eda"},{"Alex"},
        };
    }
    @DataProvider(name = "verifySSNPeopleData")
    public static Object[][] ssnVerify(){
        return new Object[][]{
                {1234},{7412},{7896},{3698},{3698},{1254},{3852},{4000},
                {3698},{3698},{3698},{3698},{3690},{3698},{4687},{4687},
        };
    }

       // Extra info, not related jdbc
    @DataProvider(name = "negativeTestLoginPage")
    public static Object[][] passwordLogin(){
        return new Object[][]{
                {" ","Mehmet1984."},
                {" ","mehmet1984."},
                {" "," "},
                {"Tusername "," "},
                {"123654 "," "},
                {"Fusername ","Tpassword"},
                {"Tusername ","Mehmet19845"},
                {"Fusername ","Mehmet."},
                {"Tusername ","Mehet1."},
        };
    }







}
