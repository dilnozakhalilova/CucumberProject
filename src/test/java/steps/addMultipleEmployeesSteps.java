package steps;

import base.BaseClass;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;
import org.junit.Assert;

import java.util.List;
import java.util.Map;

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
        List<Map<String, String>> mapList = dataTable.asMaps();
        // System.out.println(mapList);
        //  mapList.forEach(System.out::println);
        for (Map<String, String> user : mapList) {
            // System.out.println( user.get("FirstName"));
            addEmployeePage.firstName.sendKeys(user.get("FirstName"));
            addEmployeePage.middleName.sendKeys(user.get("MiddleName"));
            addEmployeePage.lastName.sendKeys(user.get("LastName"));
            addEmployeePage.saveBtn.click();

            // Assertion/ Validation
            String expectedFullName = user.get("FirstName") + " " + user.get("MiddleName") + " " + user.get("LastName");
            String actualFullName = personalDetailsPage.employeeFullName.getText();
            Assert.assertEquals("Test Failed. ", expectedFullName, actualFullName);

            // click add employee again
            pimPage.addEmployee.click();  // Get rid of extra click

        }
    }
    @Then("new employee is added successfully")
    public void new_employee_is_added_successfully() {
        System.out.println("All users are added successfully using DataTable");

    }


}



