Feature: Docuport Login Logout Feature

Background:
  Given user is on Docuport login page

@smoke
  Scenario: Login as a client
    When user enters username for client
    And user enters password for client
    And user clicks login button
    Then  user should see the home page for client

  Scenario: Login as Employee
    When user enters username for Employee
    And user enters password for Employee
    And user clicks login button
    Then  user should see the home page for Employee

  Scenario: Login as Advisor
    When user enters username for Advisor
    And user enters password for Advisor
    And user clicks login button
    Then  user should see the home page for Advisor

  Scenario: Login as supervisor
    When user enters username for supervisor
    And user enters password for supervisor
    And user clicks login button
    Then  user should see the home page for supervisor

