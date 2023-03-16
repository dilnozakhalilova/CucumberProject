package steps;

import base.BaseClass;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;
import org.junit.Assert;

public class addMultipleEmployeesSteps extends BaseClass {

        @Given("user navigates to the add employee page")
        public void user_navigates_to_the_add_employee_page() {
            pimPage.navigateToAddEmployee();
        }
        @When("user enters new employee's {string}, {string}, and {string}")
        public void userEntersNewEmployeeSAnd(String firstName, String middleName, String lastName) {
            sendText(addEmployeePage.firstName, firstName);
            sendText(addEmployeePage.middleName, middleName);
            sendText(addEmployeePage.lastName, lastName);
        }
        @When("user clicks on the save button")
        public void user_clicks_on_the_save_button() {
            addEmployeePage.saveBtn.click();
        }
        @Then("new employee {string} is added successfully")
        public void new_employee_is_added_successfully(String fullName) {
            Assert.assertEquals("Employee full name does NOT match. ", fullName, personalDetailsPage.employeeFullName.getText());
        }

    @When("user enters employee's full name and clicks on save button")
    public void user_enters_employee_s_full_name_and_clicks_on_save_button(DataTable dataTable) {


    }
    @Then("new employee is added successfully")
    public void new_employee_is_added_successfully() {

    }


}



