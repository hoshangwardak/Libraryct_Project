@userStory10
Feature: Status options verification
  As a librarian user, I should be able to see the status options

  Scenario: verify user status options
    Given user Librarian is on the homepage
    When user clicks on users module
    And user clicks on Status dropDown
    Then user should see the following options:
      | ACTIVE   |
      | INACTIVE |



