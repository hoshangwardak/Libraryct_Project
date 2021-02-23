Feature: Book Records Verification
  As a librarian, I should be able to see book records on user page


  Scenario: Default Record Verification
    Given user is logged in as Librarian
    When user clicks on Books module
    Then user should see the default record as "10"

  @LibrarianRecords
  Scenario Outline: Show Records with count options
    Given user is logged in as Librarian
    When user clicks on Books module
    Then user should be able to see records for <count> options
    Examples:
      | count |
      | 5     |
      | 10    |
      | 15    |
      | 50    |
      | 100   |
      | 200   |
      | 500   |
