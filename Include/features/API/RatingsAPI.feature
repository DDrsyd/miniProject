@tag
Feature: Review feature
  I want to use review to system

  @tag1
  Scenario: get rating through API
    Given user set url endpoint get rating
    When user send request get rating
    Then user got valid response get rating

  @tag1
  Scenario: create comment through API
    Given user set url endpoint create comment
    When user send request create comment
    Then user got valid response create comment

  @tag1
  Scenario: get comment through API
    Given user set url endpoint get comment
    When user send request get comment
    Then user got valid response get comment
