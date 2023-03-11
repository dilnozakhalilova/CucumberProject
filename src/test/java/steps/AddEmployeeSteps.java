package steps;

import base.BaseClass;
import io.cucumber.java.en.*;
import org.junit.Assert;

public class AddEmployeeSteps extends BaseClass {


    @When("user inputs valid {string} and {string}")
    public void user_inputs_valid_and(String firstName, String lastName) {
        addEmployeePage.firstName.sendKeys(firstName);
        addEmployeePage.lastName.sendKeys(lastName);

    }

//    @When("user clicks the save button")
//    public void user_clicks_the_save_button() {
//        addEmployeePage.saveBtn.click();
//
//    }

    @Then("user can see {string} name displayed")
    public void user_can_see_name_displayed(String newEmployeeDetails) {
        Assert.assertEquals("Test failed",newEmployeeDetails,personalDetailsPage.personalDetailsHeader.getText());

    }

}
