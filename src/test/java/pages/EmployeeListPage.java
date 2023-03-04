package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EmployeeListPage {
    @FindBy(id = "empsearch_id")
    public WebElement employeeIDSearchField;

    @FindBy(id = "empsearch_employee_name_empName")
    public WebElement employeeNameSearchField;
    @FindBy(id = "searchBtn")
    public WebElement empListSearchButton;

    public void searchEmployeeById(String empId){
        employeeIDSearchField.sendKeys(empId);
    }


}