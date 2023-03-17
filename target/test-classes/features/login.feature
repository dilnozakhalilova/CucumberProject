@login
Feature: Login test

  @smoke
  Scenario:  Valid Admin Log in
    When user is able to log in using valid login credentials
    Then user is able to see welcome admin message

  @smoke
  Scenario: Valid Admin login and Invalid Admin password
    When user is unable to log in using invalid password
    Then Invalid credentials error message is displayed

  @smoke
  Scenario: Invalid Admin login and empty Admin password
    When   user logs in with invalid admin login and empty admin password field
    Then  Password cannot be empty message is displayed

  @negativeLogin
  Scenario: Negative login Test using DataTable:

    When user is unable to login using invalid credentials
      | username | password         | errorMessage             |
      | admi123  | invalidPass      | Invalid credentials      |
     | Admin    |                  | Password cannot be empty |
     # |          | Exelent2022Sdet! | Username cannot be empty |
     # | Admin    | invalidPassword  | Invalid credentials      |
    Then Invalid credentials error message is displayed



