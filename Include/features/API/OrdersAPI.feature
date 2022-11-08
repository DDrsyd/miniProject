@tag
Feature: Order feature
  I want to use order to system

  @tag1
  Scenario: create order through API
    Given user set url endpoint create order
    When user send request create order
    Then user got valid response create order

  @tag1
  Scenario: get all order through API
    Given user set url endpoint get all order
    When user send request get all order
    Then user got valid response get all order

  @tag1
  Scenario: get order by id through API
    Given user set url endpoint get order by id
    When user send request get order by id
    Then user got valid response get order by id
