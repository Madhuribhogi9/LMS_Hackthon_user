@Tag1
Feature: Manage user page

  Scenario: Verify landing in Manage user page
    Given User is on any page after Login
    When User clicks the Tab user
    Then User should see the Manage user page