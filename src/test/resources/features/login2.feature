@login2

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





