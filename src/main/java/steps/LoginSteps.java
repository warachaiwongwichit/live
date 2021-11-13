package steps;

import impl.LoginImpl;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class LoginSteps {

   LoginImpl impl = new LoginImpl();

    @Given("I navigate to Login page")
    public void i_navigate_to_login_page() {

        impl.navigateToLoginPage();

    }

    @Then("I should see the WELCOME USER!")
    public void i_should_see_the_user() {
     Assert.assertEquals("WELCOME USER !" , impl.getPage().welcomeuserTxt.getText());

    }



    @Then("I should see the WELCOME ADMIN!")
    public void iShouldSeeTheWELCOMEADMIN() {
     Assert.assertEquals("WELCOME ADMIN !", impl.getPage().welcomeAdminTxt.getText());
    }


 @And("I enter username as  {string} and password as {string} and click on Sign in button")
 public void iEnterUsernameAsAndPasswordAsAndClickOnSignInButton(String username, String password) {
  impl.getPage().usernameInput.sendKeys(username);

  impl.getPage().passwordInput.sendKeys(password);

  impl.getPage().SignInBtn.click();
 }

 @Then("I should see the Incorrect password error")
 public void iShouldSeeTheIncorrectPasswordError() {
      Assert.assertEquals("Incorrect password" , impl.getPage().loginErrorTxt.getText());

 }

 @Then("I should see the Incorrect Invalid username error")
 public void iShouldSeeTheIncorrectInvalidUsernameError() {
  Assert.assertEquals("Invalid username" , impl.getPage().loginErrorTxt.getText());
 }
}
