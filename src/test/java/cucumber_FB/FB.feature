Feature: Test facebook smoke scenario
  Scenario: Test login with valid credentials
    Given open browser and Start application
    When i enter valid username and password
    Then user should be able to login