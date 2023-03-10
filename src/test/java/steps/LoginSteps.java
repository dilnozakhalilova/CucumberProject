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


    @When("user is unable to log in using invalid password")
    public void user_is_unable_to_log_in_using_invalid_password() {
        loginPage.loginToWebsiteViaConfigs("username","invalidPassword");

    }
    @Then("Invalid credentials error message is displayed")
    public void invalid_credentials_error_message_is_displayed() {
        Assert.assertEquals("Test Failed","Invalid credentials",loginPage.loginErrorMessage.getText());

    }

    @When("user logs in with invalid admin login and empty admin password field")
    public void user_logs_in_with_invalid_admin_login_and_empty_admin_password_field() {
        loginPage.loginToWebsiteViaConfigs("Admin123","");

    }
    @Then("Password cannot be empty message is displayed")
    public void password_cannot_be_empty_message_is_displayed() {
        Assert.assertEquals("Test failed. Password cannot be empty",loginPage.loginErrorMessage.getText());
    }


}
