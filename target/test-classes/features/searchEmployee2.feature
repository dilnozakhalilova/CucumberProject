Feature: Searching existing Employees

  Background:
    And user logs in with valid admin credentials
    * user navigates to the employee list page


  Scenario: Search for an employee by id
    * user enters an existing employee id "0909"in the id search-field
    When user clicks on the search button
    Then the employee information is displayed on the employee list table

  @testingnow
  Scenario: Search for an employee by name
    * user enters an existing employee name in the name search-field
    When user clicks on the search button
    Then the employee information is displayed on the employee list table

