@UserStory4
Feature: Adding Users
  As a librarian, I should be able to add users from users page.


 Scenario Outline: adding librarian users from user page
    Given user is on the library landing page
    When user clicks on the Users link
    And user should click on the Add User button
    And User fills out the form as followed from the table below:
   And User enters "<Full Name>" in the inputBox
   And User enters "<Password>" password in the inputBox
   And User enters "<Email>" email in the inputBox
   And User selects "<User Group>" userGroup from dropDown menu
   And User selects "<Status>" status from dropDown menu
   And User enters "<Start Date>" startDate in the inputBox
   And User enters "<End Date>" endDate in the inputBox
   And User enters "<Address>" address in the inputBox
   And User clicks on the Save Changes button
   Then User verifies "<Actual Name>" is in the list
   Examples:
   |Full Name|Password|Email|User Group|Status|Start Date|End Date|Address|Actual Name|
   |Demo One|123Abc|DemoOne@yahoo.com|Librarian|ACTIVE|2021-02-22|2021-02-23|VA|Demo One|
   |Demo One|123Abc|DemoOne@yahoo.com|Librarian|ACTIVE|2021-02-22|2021-02-23|VA|Demo One|
   |Demo One|123Abc|DemoOne@yahoo.com|Librarian|ACTIVE|2021-02-22|2021-02-23|VA|Demo One|
   |Demo One|123Abc|DemoOne@yahoo.com|Librarian|ACTIVE|2021-02-22|2021-02-23|VA|Demo One|
   |Demo One|123Abc|DemoOne@yahoo.com|Librarian|ACTIVE|2021-02-22|2021-02-23|VA|Demo One|
   |Demo One|123Abc|DemoOne@yahoo.com|Librarian|ACTIVE|2021-02-22|2021-02-23|VA|Demo One|
   |Demo One|123Abc|DemoOne@yahoo.com|Librarian|ACTIVE|2021-02-22|2021-02-23|VA|Demo One|
   |Demo One|123Abc|DemoOne@yahoo.com|Librarian|ACTIVE|2021-02-22|2021-02-23|VA|Demo One|

   Scenario: librarian edit user functionality
     Given user is on the library landing page
     When user clicks on the Users link
     When user clicks on the Edit User button
     And User edits the form as required
     Then User clicks on the close button
