@Auth
Feature: Auth feature
  I want to use Auth to system

  @Auth @RegisterAPI
  Scenario: Register through API
    Given user set url endpoint register
    When user send request register
    Then user got valid response register
	@Auth @LoginAPI
  Scenario: login through API
    Given user set url endpoint login
    When user send request login
    Then user got valid response login
	@Auth @GetUserAPI
  Scenario: get user through API
    Given user set url endpoint get user
    When user send request get user
    Then user got valid response get user
