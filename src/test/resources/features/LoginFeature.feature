Feature: Docuport Login Logout Feature

  Background:
    Given user is on Docuport login page

  @B2G3-212 @B2G3-210
  Scenario: Login as a client
    When user enters username for client
    And user enters password for client
    And user clicks login button
    Then  user should see the home page for client

  @smoke1
  Scenario: Login as Employee
    When user enters username for Employee
    And user enters password for Employee
    And user clicks login button
    Then  user should see the home page for Employee

  @smoke2
  Scenario: Login as Advisor
    When user enters username for Advisor
    And user enters password for Advisor
    And user clicks login button
    Then  user should see the home page for Advisor

  @smoke3
  Scenario: Login as supervisor
    When user enters username for supervisor
    And user enters password for supervisor
    And user clicks login button
    Then  user should see the home page for supervisor

  @login
  Scenario: Login as a client  map practice
    When user enter credentials
      | username | b1g3_client@gmail.com |
      | password | Group3                |
    Then user should see the home page for client

