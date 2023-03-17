package steps;

import base.BaseClass;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;
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

    @When("I enter invalid username andOr password I will see an error message")
    public void i_enter_invalid_username_and_or_password_i_will_see_an_error_message(DataTable dataTable) {
        List<Map<String, String>> mapList = dataTable.entries();
        for (Map<String, String> map : mapList) {
            if (map.get("Username") != null) {
                sendText(loginPage.username, map.get("Username"));
            }
            if (map.get("Password") == null) {
                loginPage.password.clear();
            } else {
                sendText(loginPage.password, map.get("Password"));
            }
            loginPage.loginBtn.click();
            wait(1);
            Assert.assertEquals("Login Error Message is incorrect:", map.get("ErrorMessage"), loginPage.loginErrorMessage.getText());

        }


    }

}