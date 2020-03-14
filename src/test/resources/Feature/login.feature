Feature: To validate login the Adactin Page
  Scenario Outline: To validate the login page with valid credientials
   Given User in the Adactin login page
    When The user to enter the valid username and password "<username>" and "<password>"
    And The user to login the page
    Then The user navigation to the next page
    Examples: 
      | username  | password |
      | Anisha213 | @2101ana |
