package steps;

import base.BaseClass;
import com.sun.source.tree.AssertTree;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;
import org.junit.Assert;
import utils.Constants;
import utils.ExcelUtility;

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

    @When("user enters employee data from {string} sheet")
    public void user_enters_employee_data_from_sheet(String sheetName) {
        List<Map<String, String>> mapList = ExcelUtility.readFromExcelMap(Constants.TESTDATA_FILEPATH, sheetName);// specifying path

        for (Map<String, String> map : mapList) {
            addEmployeePage.firstName.sendKeys(map.get("Firstname"));
            addEmployeePage.lastName.sendKeys(map.get("Lastname"));
//            addEmployeePage.CreateLoginDetailsCheckbox.click();
//            addEmployeePage.userName.sendKeys("Username");
//            addEmployeePage.password.sendKeys("Password");
            addEmployeePage.saveBtn.click();

            // Validation

            String expectedFullName = map.get("Firstname") + " " + map.get("Lastname");
            String actualFullName = personalDetailsPage.employeeFullName.getText();
            Assert.assertEquals("Employee name does not match.", expectedFullName, actualFullName);
            System.out.println(actualFullName + " is successfully added using Excel import");

            // click addEmployee sub-menu again
            System.out.println("map size"+mapList.size());
           if (!map.get("Firstname").equals(mapList.get(mapList.size() - 1).get("Firstname"))) {
                pimPage.navigateToAddEmployee();
           }
        }
    }

    @Then("new employee is added successfully using Excel import")
    public void new_employee_is_added_successfully_using_excel_import() {
        System.out.println("All new employees are added");

    }


}



