@userStory9
Feature: User group category verification
  As as user, I should see the group category features

  Scenario: Verify user categories
    Given the user Librarian on the homepage
    When the user click users module
    And the user click User Group dropDown
    Then the user should see the following options:
      | ALL       |
      | Librarian |
      | Students  |



