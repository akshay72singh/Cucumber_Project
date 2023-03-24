Feature: To test vtiger Login functionality

  Scenario Outline: To test login with vailid cedential
    Given browser is open
    And hit the Url
    When user enterned vailid <Username> and <password>
    And click on Login button
    Then user Nevigated on Home Pge Successfully

    Examples: 
      | Username | password |
      | admin    | admin    |
