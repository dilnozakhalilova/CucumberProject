package steps;

import base.BaseClass;
import io.cucumber.java.en.*;
import org.junit.Assert;

public class LoginSteps extends BaseClass {

    @When("user is able to log in using valid login credentials")
    public void user_is_able_to_log_in_using_valid_login_credentials() {
        loginPage.loginToWebsiteViaConfigs("username","password");

    }
    @Then("user is able to see welcome admin message")
    public void user_is_able_to_see_welcome_admin_message() {
        Assert.assertEquals("Admin user log in Failed","Welcome Admin",dashboardPage.welcome.getText());
    }

}
