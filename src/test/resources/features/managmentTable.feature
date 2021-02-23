@userStory11
Feature: Management table Header Verification
  As as librarian user, I should be able to see the management table headers

  Scenario: user management table column names
    Given user librarian is on the homepage
    When user clicks on the users module
    Then user should see the following column names:
      | Actions   |
      | User ID   |
      | Full Name |
      | Email     |
      | Group     |
      | Status    |


