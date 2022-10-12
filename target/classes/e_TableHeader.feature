Feature: TableHeader

  Scenario: Verify Table header
    Given User is on any page after Login
    When User is on the Manage user page after clicking User Tab
    Then User should see the table header as Empty checkbox-icon
    And ID with sort icon
    And Name with Sort icon
    And Email Address with sort icon
    And Contact Number with sort icon
    And Batch with sort icon
    And Skill with Sort icon
    And Edit and Delete as column names

  Scenario: Verify the functionality of sort icon present in table header
    Given User table is displayed in manage user page
    When User clicks sort icon in table header
    Then Table rows should be sorted

  Scenario: Check box in table header
    Given User table is displayed in manage user page
    When User checks empty checkbox in header
    Then Check box in all the rows of user table should be checked

  Scenario: Check box in table header
    Given User table is displayed in manage user page
    When User unchecks checkbox in header
    Then Check box in all the rows of user table should be unchecked