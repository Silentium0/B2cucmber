Feature: Docuport Login Logout Feature

  Scenario: Login as a client
    Given user is on Docuport login page
    When user enters username for client
    And user enters password for client
    And user clicks login button
    Then  user should see the home page for client

  Scenario: Login as Employee
    Given user is on Docuport login page
    When user enters username for Employee
    And user enters password for Employee
    And user clicks login button
    Then  user should see the home page for Employee

