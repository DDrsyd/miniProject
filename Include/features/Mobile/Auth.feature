@tag
Feature: Auth Feature
  I want to Auth to the app

  @tag1
  Scenario Outline: register to the system
    Given user navigate to mobile register page
    When user type the register <fullname>, <email>, <password>
    And user click register button
    Then I verify the register

    Examples: 
      | fullname  | email               | password     |
      | siapaDlah1234 | emailDaja14@gmail.com | passworDdaja14 |

  @tag2
  Scenario Outline: Login to the system
    Given user navigate to mobile login page
    When user type the login <emaillogin>, <passwordlogin>
    And user click login button on mobile
    Then I verify the login

    Examples: 
      | emaillogin   | passwordlogin |
      | DD@gmail.com | DD123         |

  @tag3
  Scenario: logout from the system
    Given user login on mobile auth
    When user click on logout
    Then user verify the logout
    