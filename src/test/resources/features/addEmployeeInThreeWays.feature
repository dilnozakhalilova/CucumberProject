@addingEmployeeInThreeWays
Feature: Adding employees in three different ways

  Background:
    Given user logs in with valid admin credentials
    And user navigates to the AddEmployee page

  Scenario Outline:
    When  user inputs valid "<firstName>" and "<lastName>" and clicks save button
    Then "<newEmployee>" is successfully added
    Examples:
      | firstName | lastName | newEmployee |
      | Joe       | Biden    | Joe Biden   |

  Scenario Outline:

    When  user inputs valid "<firstName>" and "<lastName>" and removes id
    Then "<newEmployee>" is successfully added without userID
    Examples:
      | firstName | lastName | newEmployee   | userID |
      | Vivian    | Joseph   | Vivian Joseph |        |

  Scenario Outline:
    When  user inputs valid "<firstName>" and "<lastName>"
    And user clicks on createLoginDetailsButtonBox
    And admin user inputs valid "<username>" and "<password>"
    And user re- enters the password in the "<confirmPassword>" field
    And user clicks save button
    Then "<newEmployee>" is successfully added with login credentials
    Examples:
      | firstName | lastName | username | password      | confirmPassword | newEmployee | login   |
      | Sindy     | Moore    | s.moore  | Fibonachi1358!! |Fibonachi1358!!| Sindy Moore | s.moore |










