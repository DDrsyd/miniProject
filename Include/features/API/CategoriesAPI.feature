@category
Feature: category feature
  I want to use category to system

  @createcat
  Scenario: create category through API
    Given user set url endpoint create category
    When user send request create category
    Then user got valid response create category

  @getallcat
  Scenario: get all category through API
    Given user set url endpoint get all category
    When user send request get all category
    Then user got valid response get all category

  @getcatId
  Scenario: get category by id through API
    Given user set url endpoint get category by id
    When user send request get category by id
    Then user got valid response get category by id
