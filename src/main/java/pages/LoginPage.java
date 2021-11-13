package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.WebDriverUtils;

import javax.xml.xpath.XPath;

public class LoginPage {

    public LoginPage(){

        PageFactory.initElements(WebDriverUtils.getDriver(), this);
    }


    @FindBy(xpath = "//input[@name ='username']")
    public WebElement usernameInput;

    @FindBy(xpath = "//input[@name ='password']")
    public WebElement passwordInput;

    @FindBy(xpath = "//button[@class='btn btn-primary mb-4']")
    public WebElement SignInBtn;

    @FindBy(xpath = "//div//nav//a")
    public WebElement welcomeuserTxt;

    @FindBy(xpath = "//div//nav//a//h5")
    public WebElement welcomeAdminTxt;

    @FindBy(xpath = "//div[@class='rounded']")
    public WebElement loginErrorTxt;






}
