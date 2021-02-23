Feature:
  9. user group category features
  @category
  Scenario: verify user categories

    Given the user (Librarian) on the homepage
    When the user click users moudle
    And the user click User Group dopdown
    Then the user should see the below options:
      | All       |
      | Librarian |
      | Students  |

#Actual option is ALL so failed
#  failed
#  Expected :[ALL, Librarian, Students]
#  Actual   :[All, Librarian, Students]
