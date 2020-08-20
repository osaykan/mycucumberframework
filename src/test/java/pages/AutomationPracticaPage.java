package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AutomationPracticaPage {
    public AutomationPracticaPage(){
        PageFactory.initElements(Driver.getDriver(),this);

    }
    @FindBy(xpath = "//body//nav//div")
    public WebElement signInButton;
    @FindBy(id = "email_create")
    public WebElement email;
    @FindBy(id = "SubmitCreate")
    public WebElement creatButton;
    
    @FindBy(id = "id_gender1")
    public WebElement title;

    @FindBy(id = "customer_firstname")
    public WebElement firstName;
    @FindBy(id = "customer_lastname")
    public WebElement lastName;
    @FindBy(id = "passwd")
    public WebElement password;
    @FindBy(id = "days")
    public WebElement selectDays;
    @FindBy(id = "months")
    public WebElement selectMonths;
    @FindBy(id = "years")
    public WebElement selectYears;
    @FindBy(id = "newsletter")
    public WebElement newsletterBox;
    @FindBy(id = "optin")
    public  WebElement recaiveBox;

    @FindBy(id = "company")
    public WebElement company;
    @FindBy(id = "address1")
    public WebElement address1;
    @FindBy(id = "address2")
    public WebElement address2;
    @FindBy(id = "city")
    public WebElement city;
    @FindBy(id = "id_state")
    public WebElement selectState;
    @FindBy(id = "postcode")
    public WebElement postcode;
    @FindBy(id = "other")
    public WebElement informationBox;
    @FindBy(id = "phone")
    public WebElement homePhone;
    @FindBy(id = "phone_mobile")
    public WebElement mobilePhone;
    @FindBy(id = "alias")
    public WebElement addressReference;
    @FindBy(id = "submitAccount")
    public WebElement registerButton;
    @FindBy(xpath = "//h1")
    public WebElement kayitMesaj;

    @FindBy(id = "email")
    public WebElement gecersizMail;
    @FindBy(id = "passwd")
    public WebElement gecersizPasword;
    @FindBy(id = "SubmitLogin")
    public WebElement signInButton2;
    @FindBy(xpath = "//li[.='Authentication failed.']")
    public WebElement uyariMesaji;






}
