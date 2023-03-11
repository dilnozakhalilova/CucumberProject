@addEmployeeTest
Feature: Adding new employees

  Background:
    * user logs in with valid admin credentials
    * user navigates to the employee list page

  Scenario Outline:

    When user inputs valid "<firstName>" and "<lastName>"
    * user clicks the save button
    Then user can see "<new employee>" name displayed
    Examples:

      | firstName | lastName |
      | Maya      | Jerriho  |
    #  | Sandy     | Smith    |
     # | Katie     | Jackson  |
    #  | Emely     | Suhana   |