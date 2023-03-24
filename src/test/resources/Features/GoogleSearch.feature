Feature: feature to test Google Search functionality

  Scenario: Validate Google Search is working
    Given Browser is open
    And user is on search page of Google
    When user is entered some text in search box
    And hits enter button
    Then user is nevigated to searched result
