Feature: User Login

  Scenario Outline: Attempt to sign in with various credentials
    Given I am on the sign-in page
    When I enter '<username>' and '<password>'
    And I click the login button
    Then I should see '<message>'

   
      Examples:
  | username  | password    | message                                       |
  | userXYZ   | 0pass123 		| an invalid username                           |
  | user123   | wrongPass   | your password is incorrect                    |
  | userXYZ   | wrongPass   |Invalid Username and Password       						|
  | Dsalgo@146| Gpss@146    | a successful sign-in message                  |

	Scenario: Navigating to the registration page from the sign-in page
  Given I am on the sign-in page
  When I click on the 'Register' link
  Then I should be redirected to the registration page

