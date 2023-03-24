Feature: to test and verify the login page

  Scenario: login successfully with vailid credential
    And hit the url
    When user enterned vailid name and password
    And click on Login button
    Then User nevigated on Home Page Successfully
