package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.GooglePage;
import utilities.Driver;

public class Day2_01GoogleSearchStepDefinitions {  //2.gün bu clasi acarak basladik.
    // Alttakileri runner clasi calistirdiktan sonra konsoldan alip buraya yapistirdik.
    // Kayip ,olmayan adimlari konsolda sonuc bölumunden aldik ve fazlaliklari sildik
    GooglePage googlePage=new GooglePage();


@Given("user is in the google page")
public void user_is_in_the_google_page() {
    Driver.getDriver().get("https://www.google.com");//Ekledik. Iclerine kodlarini yaziyoruz
}
@Given("user searches iphone")
public void user_searches_iphone() {
    googlePage.searchBox.sendKeys("iphone"+ Keys.ENTER);//veya alttaki
    //googlePage.searchBox.submit();

}
    @Then("verify the result has iphone")
    public void verify_the_result_has_iphone() {
        Assert.assertTrue(Driver.getDriver().getTitle().contains("iphone"));

    }


    @Given("user searches nokia")
    public void user_searches_nokia() {
        googlePage.searchBox.sendKeys("nokia"+Keys.ENTER);

    }




    @Then("verify the result has nokia")
    public void verify_the_result_has_nokia() {
        Assert.assertTrue(Driver.getDriver().getTitle().contains("nokia"));

    }
//3.gün
    @Given("user searches {string}")
    public void user_searches(String string) {
    googlePage.searchBox.sendKeys(string+Keys.ENTER);


}

    @Then("verify result has {string}")
    public void verify_result_has(String string) {
    String title=Driver.getDriver().getTitle();
        System.out.println("Title : "+title);
        Assert.assertTrue(title.contains(string));


    }





}
