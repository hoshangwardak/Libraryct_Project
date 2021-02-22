Feature: LibraryCt login functionality
  As a user, I should be able to login to the library app.

  @login
 Scenario Outline: students and librarians login verification
   Given the user login as a <role>
   Then the user on  <page>
   Examples:
     | role       | page      |
     | student    | books.    |
     | librarian# | Dashboard |




