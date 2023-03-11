@addEmployeeTest
Feature: Adding new employees

  Scenario Outline:
    Given user logs in with valid admin credentials
    And user navigates to the employee list page
    When user inputs valid "<firstName>" and "<lastName>"
    And user clicks the save button
    Then user can see "<new employee>" name displayed
    Examples:

      | firstName | lastName |
      | Maya      | Jerriho  |
    #  | Sandy     | Smith    |
     # | Katie     | Jackson  |
    #  | Emely     | Suhana   |