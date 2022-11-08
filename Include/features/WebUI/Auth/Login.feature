Feature: login feature
  I want to login to the website

  Scenario Outline: Login to the website
    Given user navigate to the login page
    When user input <email> and <password>
    And user click login button
    Then user verify profile icon

    Examples: 
      | email        | password |
      | DD@gmail.com | DD123    |

      
