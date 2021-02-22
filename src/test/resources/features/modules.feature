Feature: Modules verification
  As a user, I should be able to  see several modules once I login.

  @StudentModule
  Scenario: Students Module Verification
    Given the student on the home page
    Then the user should see following students modules
      | Books           |
      | Borrowing Books |

  @LibrarianModule
  Scenario: Librarian Module Verification
    Given the librarian on the homepage
    Then the user should see following librarian modules
      | Dashboard       |
      | Books           |
      | Borrowing Books |
