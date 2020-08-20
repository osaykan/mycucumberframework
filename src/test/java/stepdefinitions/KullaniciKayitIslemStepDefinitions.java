package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import pages.AutomationHomePage;
import pages.AutomationPracticaPage;
import utilities.Driver;

public class KullaniciKayitIslemStepDefinitions {
    AutomationPracticaPage automationPracticaPage=new AutomationPracticaPage();
    AutomationHomePage apHomePage=new AutomationHomePage();

    @Given("user web sayfasinda")
    public void user_web_sayfasinda() {
        Driver.getDriver().get("http://automationpractice.com/index.php");

    }

    @Given("user sign in linkine tiklar")
    public void user_sign_in_linkine_tiklar() throws InterruptedException {
        Thread.sleep(1000);
     automationPracticaPage.signInButton.click();


    }

    @Given("user Create and account bölümüne  email adresi girer")
    public void user_Create_and_account_bölümüne_email_adresi_girer() throws InterruptedException {
        Thread.sleep(2000);
        automationPracticaPage.email.sendKeys("ke@gmail.com");
    }

    @Given("Create an Account butonuna basar")
    public void create_an_Account_butonuna_basar() {
      automationPracticaPage.creatButton.click();
    }

    @Given("user kisisel bilgilerini ve iletisim bilgilerini girer")
    public void user_kisisel_bilgilerini_ve_iletisim_bilgilerini_girer() {
     automationPracticaPage.title.click();
     automationPracticaPage.firstName.sendKeys("Kenan");
     automationPracticaPage.lastName.sendKeys("Sah");
     automationPracticaPage.password.sendKeys("Ksah543");
     automationPracticaPage.selectDays.sendKeys("20");
     automationPracticaPage.selectMonths.sendKeys("April");
     automationPracticaPage.selectYears.sendKeys("1975");
     automationPracticaPage.newsletterBox.click();
     automationPracticaPage.company.sendKeys("IT");
     automationPracticaPage.address1.sendKeys("Berliner Sokak");
     automationPracticaPage.city.sendKeys("Berlin");
        Select select = new Select(automationPracticaPage.selectState);
        select.selectByIndex(10);
        automationPracticaPage.postcode.sendKeys("12345");
        automationPracticaPage.informationBox.sendKeys("Schöne");
        automationPracticaPage.homePhone.sendKeys("123402365777");
        automationPracticaPage.mobilePhone.sendKeys("015780346555");
        automationPracticaPage.addressReference.clear();
        automationPracticaPage.addressReference.sendKeys("benim adresim");


    }

    @Given("user Register butonuna basar")
    public void user_Register_butonuna_basar() {
        automationPracticaPage.registerButton.click();
    }

    @Then("hesap olustugunu dogrulayin")
    public void hesap_olustugunu_dogrulayin() {
        Assert.assertTrue(automationPracticaPage.kayitMesaj.isDisplayed());
    }





    @Given("email kutusuna gecersiz email adresi yazar ve enter'a tiklar")
    public void email_kutusuna_gecersiz_email_adresi_yazar_ve_enter_a_tiklar() {
      automationPracticaPage.gecersizMail.sendKeys("abtestcdef@gmail.com");
      automationPracticaPage.gecersizPasword.sendKeys("12334444");
      automationPracticaPage.signInButton2.click();

    }

    @Then("error mesajinin  Authentication failed.oldugunu dogrulayin")
    public void error_mesajinin_Authentication_failed_oldugunu_dogrulayin() {

     Assert.assertTrue(automationPracticaPage.uyariMesaji.isDisplayed());
    }


    @Given("imleci Women linkinin uzerine ve daha sonra Tshirts'e tiklayin")
    public void imleci_Women_linkinin_uzerine_ve_daha_sonra_Tshirts_e_tiklayin() throws InterruptedException {
        Actions actions=new Actions(Driver.getDriver());
        actions.moveToElement(apHomePage.womenLink).moveToElement(apHomePage.tshirts).click().perform();
        Thread.sleep(2000);
    }

    @Given("sayfada gorunen ilk urunun textini alin")
    public void sayfada_gorunen_ilk_urunun_textini_alin() {
        Actions actions=new Actions(Driver.getDriver());
        actions.sendKeys(Keys.PAGE_DOWN).perform();

        String productName = apHomePage.product1.getText();
        System.out.println(productName);

    }

    @Given("sayfada ustte bulunan arama cubuguna ayni urun ismini girin ve search butonuna basin")
    public void sayfada_ustte_bulunan_arama_cubuguna_ayni_urun_ismini_girin_ve_search_butonuna_basin() {
        Actions actions=new Actions(Driver.getDriver());
        actions.sendKeys(Keys.PAGE_UP).perform();
        apHomePage.searchBox.sendKeys(apHomePage.product1.getText());
        apHomePage.search.click();
    }

    @Then("acilan sayfada cikan urunun T-Shirt sayfasinda goruntulenen urunle ayni oldugunu dogrulayin")
    public void acilan_sayfada_cikan_urunun_T_Shirt_sayfasinda_goruntulenen_urunle_ayni_oldugunu_dogrulayin() {
        Assert.assertTrue(apHomePage.product2.equals(apHomePage.product1));
    }



}
