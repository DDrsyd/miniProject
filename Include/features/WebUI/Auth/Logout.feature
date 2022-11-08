Feature: Logout Feature
  I want to Logout from the website

  Scenario: Logout the account
    Given user already login
    When user click profile icon
    When user click logout button
    Then user verify the page
