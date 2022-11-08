@tag
Feature: Auth feature
  I want to use Auth to system

  @tag1
  Scenario: create product through API
    Given user set url endpoint create product
    When user send request create product
    Then user got valid response create product

  @tag1
  Scenario: get all product through API
    Given user set url endpoint get all product
    When user send request get all product
    Then user got valid response get all product

  @tag1
  Scenario: delete product through API
    Given user set url endpoint delete product
    When user send request delete product
    Then user got valid response delete product
