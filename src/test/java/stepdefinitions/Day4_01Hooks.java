package stepdefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import utilities.Driver;

public class Day4_01Hooks {
    //@Before TestNg deki gibi calisir. Her scenariodan önce calisir.
    //GLOBAL Hooks annotation
    @Before(order = 1)      //cucumber olani seciyoruz extends olmadan kullanacagiz.Bütün scenario larin basinda cals.
    public void setUp(){
        System.out.println("Hooks Class- Setup Method");

    }
    //Her ozel(spesific) scenariodan önce calisir
    //TAGGED Hooks annotation
    @Before(value = "@iphone",order = 2)
    public void searchIphone(){
        System.out.println("Hooks Class- IPHONE Method");
    }

    //her scenariodan sonra calisir
    @After
    public void tearDown(Scenario scenario){
        System.out.println("Hooks Class - tearDown Method");

        //Her fail olan scenariodan sonra screenshot almali
        //screenshot almak icin final byte array
        final byte [] screenshot=((TakesScreenshot)Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
        //scenario fail olursa image ekleyelim
        if(scenario.isFailed()){
            scenario.embed(screenshot,"image/png");
        }

        Driver.closeDriver();

    }

}
