Feature: Scenario Outline practice
  @googleSearchOutline
  Scenario Outline: Google search fir capital cities
    Given user is on Google search page
    When user search for the "<country>"
    Then user should see the "<capital>" in the result
    Examples:
      | country     | capital          |
      | Azerbaijan  | Baku             |
      | Ukraine     | Kyiv             |
      | Afghanistan | Kabul            |
      | USA         | Washington, D.C |
      | Uzbekistan  | Tashkent         |