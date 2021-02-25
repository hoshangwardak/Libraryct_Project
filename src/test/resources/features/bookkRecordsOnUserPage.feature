
Feature: As a librarian, I should be able to see book records on user page

@UserStory5
  Scenario : verifying the default record is 10

    Given The librarian on the homepage
    When librarian clicks on books link
    Then verify that the default record is 10

@UserStory_5.1
  Scenario : verify the count options

    Given The librarian on the homepage
    When librarian clicks on books link
    Then Show records for the following options

      | 5     |
      | 10    |
      | 15    |
      | 50    |
      | 100   |
      | 200   |
      | 300   |






