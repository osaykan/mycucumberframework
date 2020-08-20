package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.support.ui.Select;
import pages.FhcRegisterPage;
import pages.FhcTripLoginPage;
import utilities.ConfigurationReader;
import utilities.Driver;

public class FhcRegisterStepDefinitions {
    FhcTripLoginPage fhcTripLoginPage=new FhcTripLoginPage();
    FhcRegisterPage fhcRegisterPage=new FhcRegisterPage();

    @Given("kullanici fhctrip sayfasindadir")
    public void kullanici_fhctrip_sayfasindadir() {
        Driver.getDriver().get(ConfigurationReader.getProperty("fhc_login_url"));
    }

    @Given("kullanici “create a new account” butonuna tiklar")
    public void kullanici_create_a_new_account_butonuna_tiklar() {
     fhcTripLoginPage.createButton.click();
    }

    @Given("kullanici username girer")
    public void kullanici_username_girer() {
        fhcRegisterPage.usernameBox.sendKeys("susmaya");

    }

    @Given("kullanici password girer")
    public void kullanici_password_girer() {
        fhcRegisterPage.passwordBox.sendKeys("Ossay_123!");
    }

    @Given("kullanici email girer")
    public void kullanici_email_girer() {
      fhcRegisterPage.email.sendKeys("boossas@gmail.com");
    }

    @Given("kullanici fullname girer")
    public void kullanici_fullname_girer() {
    fhcRegisterPage.fullName.sendKeys("Orr Aayyk");
    }

    @Given("kullanici phone girer")
    public void kullanici_phone_girer() throws InterruptedException {
        Thread.sleep(6000);
    fhcRegisterPage.phoneNo.sendKeys("0123266809");
    }

    @Given("kullanici SSN girer")
    public void kullanici_SSN_girer() throws InterruptedException {
        Thread.sleep(6000);
     fhcRegisterPage.SSN.sendKeys("105423872");
    }

    @Given("kullanici Driven lisans girer")
    public void kullanici_Driven_lisans_girer() {
    fhcRegisterPage.drivingLicense.sendKeys("133-ab-123");
    }

    @Given("kullanici country dropdowndan secer")
    public void kullanici_country_dropdowndan_secer() {
        Select select = new Select(fhcRegisterPage.country);
        select.selectByVisibleText("United States");


    }

    @Given("kullanici state dropdowndan secer")
    public void kullanici_state_dropdowndan_secer() {
    Select select = new Select(fhcRegisterPage.state);
        select.selectByIndex(15);
    }

    @Given("kullanici adress girer")
    public void kullanici_adress_girer() {
        fhcRegisterPage.address.sendKeys("Berlin Deutschland");
    }

    @Given("kullanici working sector girer")
    public void kullanici_working_sector_girer() {
    fhcRegisterPage.workingSector.sendKeys("IT");
    }

    @Given("kullanici birthday girer")
    public void kullanici_birthday_girer() {
    fhcRegisterPage.birthDate.sendKeys("10.10.2000");
    }

    @Then("kullanici save butonuna tiklar")
    public void kullanici_save_butonuna_tiklar() {
     fhcRegisterPage.saveButton.click();
    }

}
