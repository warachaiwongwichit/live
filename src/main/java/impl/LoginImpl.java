package impl;

import pages.LoginPage;
import utils.ConfigReader;
import utils.WebDriverUtils;

public class LoginImpl {

    LoginPage page;


    public LoginPage getPage(){
        if(page == null)
            page = new LoginPage();
        return page;
    }
    public void navigateToLoginPage(){
        WebDriverUtils.getDriver().get(ConfigReader.readProperty("url"));
    }



}
