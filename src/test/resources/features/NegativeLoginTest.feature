@login
Feature: Login test (Negative)
  As an Invalid I should not be able to log in using invalid credentials,
  and when I try to log in I should see an derror message

  @negativeLogin
  Scenario: Negative login Test using DataTable:

    When user is unable to login using invalid credentials
      | username | password         | errorMessage             |
      | admi123  | invalidPass      | Invalid credentials      |
      | Admin    | invalidPassword  | Invalid credentials      |
      | Admin    |                  | Password cannot be empty |
      |          | Exelent2022Sdet! | Username cannot be empty |

    Then Invalid credentials error message is displayed



