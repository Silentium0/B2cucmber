Feature: Google Search Functionality title Validation
  User Story: As a user, when im on the google search page
  i should be able to search whatever i want  and see relevant information


  Scenario: search functionality result title validation
    Given user  is Google search page
    When user types loop Academy in the google search box and click enter
    Then user should see Loop  Academy  - Google search in the google title
  Scenario: search functionality result title validation
    Given user  is Google search page
    When user types "Loop Academy" in the google search box and click enter
    Then user should see "Loop Academy - Google Search" in the google title
  @google
  Scenario: search functionality result title validation
    Given user  is Google search page
    When user types "Feyruz is King" in the google search box and click enter
    Then user should see "Feyruz is King - Google Search" in the google title