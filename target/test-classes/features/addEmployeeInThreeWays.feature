@addingEmployeeInThreeWays
Feature: Adding employees in three different ways

  Scenario Outline:
    Given user logs in with valid admin credentials
    And user navigates to the AddEmployee page
    When  user inputs valid "<firstName>" and "<lastName>" and clicks save button
    Then "<newEmployee>" is successfully added
    Examples:
      | firstName | lastName | newEmployee |
      | Joe       | Biden    | Joe Biden |

  Scenario Outline:
    Given user logs in with valid admin credentials
    And user navigates to the AddEmployee page
    When  user inputs valid "<firstName>" and "<lastName>" and removes id
    Then "<newEmployee>" is successfully added without userID
    Examples:
      | firstName | lastName | newEmployee     | userID |
      | Vivian    | Joseph   | Vivian Joseph |        |








