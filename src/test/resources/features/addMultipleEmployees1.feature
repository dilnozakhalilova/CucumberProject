@addEmployeeTest
Feature: Adding new employees

  Scenario Outline:
    Given user logs in with valid admin credentials
    And user navigates to the AddEmployee page
    When user inputs valid "<firstName>" and "<lastName>"
    And user clicks the save button
    Then user can see "<new employee>" name displayed
    Examples:
      | firstName | lastName | new employee    |
      | Maya      | Smith    | Maya Smith      |
      | Samantha  | Jones    | Samantha Jones  |
      | Jessica   | Simpson  | Jessica Simpson |
      | Erica     | Smirnov  | Erica Smirnov |
      | Marry     | Jane     | Marry Jane      |


