@login2 @regression

Feature: login Test

  Scenario: valid admin login

# This is imperative style( detailed)
  #Scenario: valid admin login
   #  When admin user enters valid username
   # * admin user enters valid username
   # * admin user enters valid password
   # Then admin user is logged in successfully

  # This is Declarative style ( not step by step)
    When admin user logs in with valid credentials
    Then admin user logs in successfully

  Scenario: valid ess login
    When ess user logs in with valid credentials
    Then ess user logs in successfully


  Scenario Outline:
    When user enters a valid "<username>" and a valid "<password>"
    And user clicks on the log in button
    Then user logs in successfully a "<message>" is displayed
    Examples:
      | username | password         | message       |
      | Admin    | Exelent2022Sdet! | Welcome Admin |
      | ESSUser  | Ess@2023         | Welcome John  |


# Similar to DataProvider in TestNG







