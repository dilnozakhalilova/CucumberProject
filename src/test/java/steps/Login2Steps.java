package steps;

import base.BaseClass;
import io.cucumber.java.en.*;
import org.junit.Assert;

public class Login2Steps extends BaseClass {


    @When("admin user logs in with valid credentials")
    public void admin_user_logs_in_with_valid_credentials() {
        loginPage.loginToWebsiteViaConfigs("username", "password");
        // 2nd way
        // sendText(loginPage.username,"username");
        // sendText(loginPage.password,ConfigsReader.getProperties("password");
        //click(loginPage.loginBtn);

        // 3rd way
//        loginPage.username.sendKeys("Admin");

    }

    @Then("admin user logs in successfully")
    public void admin_user_logs_in_successfully() {
        String expectedMessage = "Welcome Admin";
        String actualMessage = dashboardPage.welcome.getText();
        Assert.assertEquals("Welcome Admin message is Displayed. Test passed", expectedMessage, actualMessage);
    }

    @When("ess user logs in with valid credentials")
    public void ess_user_logs_in_with_valid_credentials() {
        loginPage.loginToWebsiteViaConfigs("essUsername", "essPassword");

    }

    @Then("ess user logs in successfully")
    public void ess_user_logs_in_successfully() {
        String expectedMessage = "Welcome John";
        String actualMessage = dashboardPage.welcome.getText();
        Assert.assertEquals("Welcome John message is Displayed. Test passed", expectedMessage, actualMessage);

    }

    @When("user enters a valid {string} and a valid {string}")
    public void user_enters_a_valid_and_a_valid(String username, String password) {
        loginPage.username.sendKeys(username);
        loginPage.password.sendKeys(password);
    }

    @When("user clicks on the log in button")
    public void user_clicks_on_the_log_in_button() {
        loginPage.loginBtn.click();
    }

    @Then("user logs in successfully a {string} is displayed")
    public void user_logs_in_successfully_a_is_displayed(String expectedMessage) {
        Assert.assertEquals("User login is NOT successful",expectedMessage,dashboardPage.welcome.getText());

    }
}
