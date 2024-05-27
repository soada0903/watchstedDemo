@watchsted231
Feature: As a user, I should be able to launch webpage, navigate to SEARCH, search for Liverpool and then take Screenshot.


  Scenario: Search Functionality
    Given I navigate to landing page
    And I can see page title as "Watchsted - Watchsted - Maps"
    And I click SEARCH link
    And I can see "KEYWORD SEARCH"
    When I enter Liverpool in the search field
    And click SEARCH button
    Then I should see and print the results


  Scenario: Invalid search
    And I click SEARCH link
    And I can see "KEYWORD SEARCH"
    When I search with invalid city name "liver-pool"
    And click SEARCH button
    Then I should not see search result "recent inspections"
