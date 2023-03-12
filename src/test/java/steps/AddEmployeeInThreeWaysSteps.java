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
    @And("user clicks on createLoginDetailsButtonBox")
    public void userClicksOnCreateLoginDetailsButtonBox() {
        addEmployeePage.CreateLoginDetailsCheckbox.click();
    }
    @And("admin user inputs valid {string} and {string}")
    public void adminUserInputsValidAnd(String userName, String password) {
        addEmployeePage.userName.sendKeys(userName);
        addEmployeePage.password.sendKeys(password);

    }
    @And("user re- enters the password in the {string} field")
    public void userReEntersThePasswordInTheField(String confirmPassword) {
        addEmployeePage.confirmPassword.sendKeys(confirmPassword);
    }
    @And("user clicks save button")
    public void userUploadsAPhotoAndClicksSaveButton() {
      addEmployeePage.saveBtn.click();
    }


    @Then("{string} is successfully added with login credentials")
    public void isSuccessfullyAddedWithLoginCredentials(String newEmployee) {
       Assert.assertEquals("Test failed. New employee was not added using log in credentials",newEmployee, personalDetailsPage.employeeFullName.getText());
    }
}
