@login
Feature: Login test

  Scenario:  Valid Admin Log in
    When user is able to log in using valid login credentials
    Then user is able to see welcome admin message

  Scenario: Valid Admin login and invalid Admin password
    When user is unable to log in using invalid password
    Then Invalid credentials error message is displayed


    Scenario: Invalid Admin login and empty Admin password
      When   user logs in with invalid admin login and empty admin password field
      Then  Password cannot be empty message is displayed