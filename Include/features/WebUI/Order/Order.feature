Feature: Order Feature
  I want to order products from the web

  Scenario: Order product after login
    Given user already login and at homepage
    When user see the product click beli
    And user click cart icon
    And user click bayar
    Then verify the product

  