package steps;

import impl.AdminImpl;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import utils.WebDriverUtils;

public class AdminSteps {
    AdminImpl impl = new AdminImpl();


    @Then("I should see a number for each role and department")
    public void iShouldSeeANumberForEachRoleAndDepartment() throws InterruptedException {
        Assert.assertTrue(impl.countForRolesAndDepartments());
    }

    @Then("I should not be able to delete Role or Department if it is assigned to an employee")
    public void iShouldNotBeAbleToDeleteRoleOrDepartmentIfItIsAssignedToAnEmployee() throws InterruptedException {
        Assert.assertFalse(impl.deleteRoleOrDepartment());
    }
//    @Given("I navigate to homepage")
//    public void iNavigateToHomepage() {
//        impl.navigateToLoginPage();
//    }

    @When("I input {string} as {string}")
    public void i_input_as(String inputFieldName, String value) {
        impl.fillInputField(inputFieldName, value);
    }

    @Then("I click Enter button")
    public void iClickEnterButton() throws InterruptedException {
        impl.getPage().Enter.click();
        Thread.sleep(2000);
    }

    @Then("Employee is populate in the data table")
    public void employeeIsPopulateInTheDataTable() {
        Assert.assertEquals("success", impl.verifyEachUserFields());
    }


}
