#Author : Ebru
@login
Feature: Sauce Labs Login

  Scenario: Valid Login
    Given User is on the Login Page
    When User enters valid username
    And User enters valid password
    And User clicks on the login button
    Then User sees the home page

  Scenario: Invalid Login
    Given User is on the Login Page
    When User enters invalid username
    And User enters invalid password
    And User clicks on the login button
    Then User sees the error message