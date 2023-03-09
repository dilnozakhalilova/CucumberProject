@login
  Feature: Login test

    Scenario:  Valid Admin Log in
      When user is able to log in using valid login credentials
      Then user is able to see welcome admin message
