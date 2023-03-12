package steps;

import base.BaseClass;
import io.cucumber.java.en.*;
import org.junit.Assert;

public class AddMultipleEmployees1Steps extends BaseClass {

    @Given("user navigates to the AddEmployee page")
    public void user_navigates_to_the_add_employee_page() {
    pimPage.navigateToAddEmployee();
    }
    @When("user inputs valid {string} and {string}")
    public void user_inputs_valid_and(String firstName, String lastName) {
       addEmployeePage.firstName.sendKeys(firstName);
       addEmployeePage.lastName.sendKeys(lastName);
    }
    @When("user clicks the save button")
    public void user_clicks_the_save_button() {
        addEmployeePage.saveBtn.click();
    }
    @Then("user can see {string} name displayed")
    public void user_can_see_name_displayed(String newEmployee) {
        Assert.assertEquals("Test failed. Employee was not added. ",newEmployee,personalDetailsPage.employeeFullName.getText());

    }


}
