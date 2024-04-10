Feature: Facebook features

  @RegressionTest
  Scenario Outline: Facebook Login Test
    Given user is already on "<url>" page
    When title of the facebook is login page
    Then close the browser

    Examples: 
      | url                       |
      | https://www.facebook.com/ |
      | https://www.facebook.com/ |
