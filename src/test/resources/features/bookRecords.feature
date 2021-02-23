@UserStory5
Feature: book records functionality
  As a librarian, I should be able to see book records on user page

  Scenario: Default value verification
    Given The librarian on the homepage
    When librarian clicks on books link
    Then verify that the default record is 10

  Scenario: Verify the count options
    Given The librarian on the homepage
    When librarian clicks on books link
    Then Show records for the following count
      | 5     |
      | 10    |
      | 15    |
      | 50    |
      | 100   |
      | 200   |
      | 500   |