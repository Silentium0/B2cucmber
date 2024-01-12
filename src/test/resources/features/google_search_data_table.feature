Feature: Passing multiple parameters to the same step
   Background:

   @java
  Scenario: Search multiple items
    Given user is on Google search page
    Then  user searchs the following item
      | Loop academy |
      | java         |
      | selenium     |
      | SQL          |
      | API          |