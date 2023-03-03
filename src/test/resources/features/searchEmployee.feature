Feature: Searching existing Employees

  Scenario: Search for an employee by id
    Given user is on the Exelenter homepage
    And user logs in with valid admin credentials
    And user navigates to the employee list page
    And user enters an existing employee id in the id search-field
    When user clicks on the search button
    Then the employee information is displayed on the employee list table

    Scenario: Search for an employee by name
      Given user is on the Exelenter homepage
      And user logs in with valid admin credentials
      And user navigates to the employee list page
      And user enters an existing employee name in the name search-field
      When user clicks on the search button
      Then the employee information is displayed on the employee list table

# Tip 1: Ideally, declarative approach(shorter, behavior-driven) is preferred for writing steps in Gherkin
#        In rare scenarios, we do need imperative style( longer, detailed, and procedural driven).Feature:
# Tip 2: Try to keep your steps withing 7-8 OR less steps, shorter is better.  If more than 7 steps try to break into smaller steps
# Remember: S.M.A.R.T or I.N.V.E.S.T criteria in Testing. While 'S" in smart stand for Specific, 'S' in INVEST stands for 'Small' or 'Short'

