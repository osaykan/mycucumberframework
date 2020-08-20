package runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)  //Classi cucumber ile calistir.
@CucumberOptions(
        plugin = {"html:target/default-cucumber-reports",
                "json:target/json-reports/cucumber.json",
                "junit:target/xml-report/cucumber.xml" },
       // plugin = "html:target/cucumber",  //html seklinde raporlar almamizi saglar index.html nin icinde
        features = "src/test/resources/features" ,   //features in path ini yapistirdik
               // stepdefinitionlar arasinda baglanti kurmak icin yaziyoruz
        glue = "stepdefinitions" ,  //stepdefinitionsun üzerine gidip clasörü aciyoruz
        //sadece birini calistiracaksak onun tag ini buraya yaziyoruz
        //tags = "@googlesearch",   //featurefile yazildi burayada yazarsak sadece bunu calistirir.
        //tags = "@fhcloginparameter or @nokia", //3.gün parmetre_fhclogin.feature icin yazdik eksikleri FhcTripLoginStepDef.altina ekledik
        //tags = "@datatable",
        //tags = "@datatable00",
       // tags = "@datatable01",
       // tags = "@datatable02",    day3
      //  tags = "@googlesearch",  //day4
       // tags = "@fhcregister",
        //tags = "@kayitIslemi",
        //tags = "@kayitHataMesaji",
        tags = "@testcase3",
        dryRun = false
        //ikinci eksik olan definitionlari bulmak icin yazdik.Son durumda false olarak kalmali
        // true yazarsak brovser acilmiyor sadece kayiplari,eksikleri veriyor.kopyalayip stepdefinitions a yapistiriyoruz

)


public class Runner {
}
