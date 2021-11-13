package steps;


import impl.UserImpl;
import io.cucumber.java.en.Then;

public class UserSteps {

    UserImpl impl = new UserImpl();

    @Then("I should be able to see table field id")
    public void i_should_be_able_to_see_table_field_id() {
        impl.getPage().idTable.isDisplayed();

    }
    @Then("I should be able to see table field first name")
    public void i_should_be_able_to_see_table_field_first_name() {

        impl.getPage().firstnameTable.isDisplayed();
    }
    @Then("I should be able to see table field last name")
    public void i_should_be_able_to_see_table_field_last_name() {

        impl.getPage().lastnameTable.isDisplayed();
    }
    @Then("I should be able to see table field role")
    public void i_should_be_able_to_see_table_field_role() {

        impl.getPage().roleTable.isDisplayed();
    }
    @Then("I should be able to see table field department")
    public void i_should_be_able_to_see_table_field_department() {

        impl.getPage().departmentTable.isDisplayed();
    }

}
