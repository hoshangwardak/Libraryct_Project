Feature: Logout functionality

  @logout
  Scenario: Logout functionality
    Given user is logged in as student or librarian
    When user clicks on logout dropDown and on logout button
    Then user should be redirected to login page and see "login.html" in the url
