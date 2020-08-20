package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class FhcRegisterPage {
    public FhcRegisterPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy (id = "UserName")
    public WebElement usernameBox;
    @FindBy (id = "Password")
    public WebElement passwordBox;
    @FindBy(id = "Email")
    public WebElement email;
    @FindBy(id = "NameSurname")
    public WebElement fullName;
    @FindBy (id = "PhoneNo")
    public WebElement phoneNo;
    @FindBy(id = "SSN")
    public WebElement SSN;
    @FindBy (id = "IDCountry")
    public WebElement country;
    @FindBy (xpath = "//select[@id='IDState']")
    public WebElement state;
    @FindBy (id = "Address")
    public WebElement address;
    @FindBy (id = "BirthDate")
    public WebElement birthDate;
    @FindBy(id = "WorkingSector")
    public WebElement workingSector;
    @FindBy (id = "btnSubmit")
    public WebElement saveButton;
    @FindBy(xpath = "//div[@class='bootbox-body']")
    public WebElement successfullyMessage;
    @FindBy(xpath = "//*[.='Create a new account']")
    public WebElement createButton;
    @FindBy (id = "DrivingLicense")
    public WebElement drivingLicense;

    @FindBy (id = "IDRole")
    public WebElement role;
    @FindBy (xpath = "//input[@value='True']")
    public WebElement radioButton;




    @FindBy (id = "btnSubmit")
    public WebElement loginButton;
    @FindBy(linkText = "Users")
    public WebElement users;
    @FindBy(xpath = "//span[@class='hidden-480']")
    public WebElement addUsers;
    @FindBy(xpath = "//div[@class='caption']")
    public WebElement createUser;
    @FindBy(id = "UserName")
    public WebElement newUserName;
    @FindBy(id = "txtPassword")
    public WebElement newPassword;



}
