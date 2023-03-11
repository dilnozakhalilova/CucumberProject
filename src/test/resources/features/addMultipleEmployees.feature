Feature: Adding multiple employees

  To perform DDT (Data Driven Testing) in Cucumber we use Scenario Outline
  """
  HW 3: Add Employee in three different ways using Cucumber:
Feature title is 'Add new employee'
  Scenario 1 - Add with first name and last name
  Scenario 2 - Add without employee ID
  Scenario 3 - Add with login credentials (edited)
"""

  Scenario Outline: Adding multiple employees

    Given user logs in with valid admin credentials
    And user navigates to the add employee page
    When user enters new employees "<first name>", "<middle name>", and "<last name>"
    And user clicks the save button
    Then new employee <"full name"> is added successfully
    Examples:
      | first name | middle name | last name | "full name"       |
      | Sophia     | S.          | Smison    | Sophia S. Smison  |
      | Zara       | M.          | Smith     | Zara M. Smith     |
      | Kacie      | V.          | White     | Kacie V. White    |
      | Maria      | J.          | Jackson   | Maria J. Jackson  |
      | Melanie    | P.          | Peters    | Melanie P. Peters |

  """
    # Alternatively, you can do this
    Then new employee "<first name>, <middle name>, and <last name>" is added successfully
    Examples:

      | first name | middle name | last name | "full name"       |
      | Sophia     | S.          | Smison    | Sophia S. Smison  |
      | Zara       | M.          | Smith     | Zara M. Smith     |
      | Kacie      | V.          | White     | Kacie V. White    |
      | Maria      | J.          | Jackson   | Maria J. Jackson  |
      | Melanie    | P.          | Peters    | Melanie P. Peters |
"""





