package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AutomationHomePage {
    public AutomationHomePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//body//nav//div")
    public WebElement signInButton;
    @FindBy(id = "email_create")
    public WebElement email;
    @FindBy(id = "SubmitCreate")
    public WebElement creatButton;

    @FindBy(id = "email")
    public WebElement gecersizMail;
    @FindBy(id = "passwd")
    public WebElement gecersizPasword;
    @FindBy(id = "SubmitLogin")
    public WebElement signInButton2;
    @FindBy(xpath = "//li[.='Authentication failed.']")
    public WebElement uyariMesaji;

    @FindBy(xpath = "//a[.='Women']")
    public WebElement womenLink;
    @FindBy(xpath = "//a[.='T-shirts']")
    public WebElement tshirts;
    @FindBy (xpath = "(//a[@title='Faded Short Sleeve T-shirts'])[2]")
    public WebElement product1;
    @FindBy(id = "search_query_top")
    public WebElement searchBox;
    @FindBy(name = "submit_search")
    public WebElement search;
    @FindBy(xpath = "(//a[@title='Faded Short Sleeve T-shirts'])[2]")
    public WebElement product2;


}
