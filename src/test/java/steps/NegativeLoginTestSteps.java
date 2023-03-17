package steps;

import base.BaseClass;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.List;
import java.util.Map;

public class NegativeLoginTestSteps extends BaseClass {

    @When("user is unable to login using invalid credentials")
    public void user_is_unable_to_login_using_invalid_credentials(DataTable dataTable) {

        List<Map<String, String>> mapList = dataTable.asMaps();
        for (Map<String, String> errorMsg : mapList) {
            loginPage.username.sendKeys("username");
            loginPage.password.sendKeys("password");
            loginPage.loginBtn.click();
            String expected = errorMsg.get("errorMessage");
            Assert.assertEquals("Test failed.", expected, loginPage.loginErrorMessage.getText());
            System.out.println(loginPage.loginErrorMessage.getText());
        }
    }


}
