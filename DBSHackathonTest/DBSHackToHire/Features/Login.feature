Feature: Login

  In order to perform successful login
  As a user
  
  Scenario: Validate login feature with valid credentials
    Given User navigated to the application
    And User enters "username" and "password" in mentioned fields
    When User clicks on submit button
    Then User should be displayed with home page

