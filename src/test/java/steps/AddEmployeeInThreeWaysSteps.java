package steps;

import base.BaseClass;
import io.cucumber.java.en.*;
import org.junit.Assert;

public class AddEmployeeInThreeWaysSteps extends BaseClass {
    @When("user inputs valid {string} and {string} and clicks save button")
    public void user_inputs_valid_and_and_clicks_save_button(String firstName, String lastName) {
        addEmployeePage.firstName.sendKeys(firstName);
        addEmployeePage.lastName.sendKeys(lastName);
        addEmployeePage.saveBtn.click();

    }
    @Then("{string} is successfully added")
    public void is_successfully_added(String newEmployee) {
        Assert.assertEquals("Test Failed. Employee was not added using First and Last Name",newEmployee,personalDetailsPage.employeeFullName.getText());

    }
    @When("user inputs valid {string} and {string} and removes id")
    public void user_inputs_valid_and_and_removes_id(String firstName, String lastName) {
        addEmployeePage.firstName.sendKeys(firstName);
        addEmployeePage.lastName.sendKeys(lastName);
        addEmployeePage.employeeId.clear();
        addEmployeePage.saveBtn.click();

    }

    @Then("{string} is successfully added without userID")
    public void isSuccessfullyAddedWithoutUserID(String newEmployee) {
        Assert.assertEquals("Test failed. New employee was not added without ID" , newEmployee,personalDetailsPage.employeeFullName.getText());

    }
    @When("user clicks on {string}")
    public void user_clicks_on(String createLoginDetailsButtonBox) {
        addEmployeePage.CreateLoginDetailsCheckbox.click();
    }
    @When("user inputs valid s.moore and {string}")
    public void user_inputs_valid_s_moore_and(String username, String password  ) {


    }
    @When("user confirms the password in the {string} field and clicks save button")
    public void user_confirms_the_password_in_the_field_and_clicks_save_button(String string) {

    }
    @Then("{string} is successfully added with credentials")
    public void is_successfully_added_with_credentials(String string) {

    }


}
