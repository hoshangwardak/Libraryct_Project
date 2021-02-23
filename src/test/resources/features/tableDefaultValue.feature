@userStory6
Feature: Default Value of the Table
  As a students, I should be able to see tables with default info


  Scenario: Verification of table default value
    Given the user on the homepage
    Then the user should see the following column names:
      | Actions     |
      | ISBN        |
      | Name        |
      | Author      |
      | Category    |
      | Year        |
      | Borrowed By |

