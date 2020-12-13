Feature: Fess Functionality
  Background:
    Given Navigate to basqar
    When Enter username and password and click Login Button
    Then User should login successfully
    And Navigate to Fess page

  Scenario: Create a fees
    When User create Fess with ApachePOI
    Then User should login successfully

  Scenario: Edit a fees
    When User edit Fess with ApachePOI
    Then User should login successfully

  Scenario: Delete a fees
    When  User delete Fess with ApachePOI
    Then User should login successfully

