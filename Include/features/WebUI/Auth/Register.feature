Feature: registration
  I want to register to the web

  Scenario Outline: register to web
    Given user navigate to the page
    When user navigate loginpage
    And user click register
    And user input the <name>,<email>,<password>
    Then user click button

    Examples: 
      | name  | email       | password |
      | DDname12467 | DDname14276@gmail |     D51234567 |
      