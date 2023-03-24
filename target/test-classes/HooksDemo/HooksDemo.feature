Feature: Check LoginFunctionality

  Scenario: 
    Given user is on login page
    When user enterns vailid user name and password
    And clicks on login button
    Then user is nevigated to the HomePage
