package steps;

import impl.AdminImpl;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
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
}
