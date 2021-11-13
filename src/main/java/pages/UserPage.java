package pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.WebDriverUtils;

public class UserPage {
    public UserPage(){

        PageFactory.initElements(WebDriverUtils.getDriver(), this);

    }

    // this xpath locates ID table
    @FindBy(xpath = "//thead/tr/th[1]")
    public WebElement idTable;

    // this xpath locates first name table
    @FindBy(xpath = "//thead/tr/th[2]")
    public WebElement firstnameTable;

    // this xpath locates last name table
    @FindBy(xpath = "//thead/tr/th[3]")
    public WebElement lastnameTable;

    // this xpath locates role table
    @FindBy(xpath = "//thead/tr/th[4]")
    public WebElement roleTable;

    // this xpath locates department table
    @FindBy(xpath = "//thead/tr/th[5]")
    public WebElement departmentTable;


}
