@userStory8
Feature: Borrowing books functionality
  As a user, I should able to see my borrowing books.

  Scenario: borrowing books table column names
    Given the user is on the homepage
    When the user clicks on Borrowing Books module
    Then the user should see the following column names:
      | Action              |
      | Book Name           |
      | Borrowed Date       |
      | Planned Return Date |
      | Return Date         |
      | Is Returned ?       |

