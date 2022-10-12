@Tag1
Feature: Pagination

  Scenario: Verify the presence of pagination
    Given User is on any page after Login
    When User clicks the Tab user
    Then User should see the pagination controls below data table

  Scenario: Verify the Pagination control with less rows
    Given User is on Manage user page
    When Manage user table has less than or equal to five rows
    Then Pagination control should be disabled

  Scenario: Verify the Pagination control with more than five rows
    Given User is on Manage user page
    When Manage user table has more than five rows
    Then Pagination control should be enabled

  Scenario: Verify pagination next link
    Given User is on Manage user page
    When User clicks next link of pagination
    Then Next page should be displayed

  Scenario: Verify pagination next link after last record of user table
    Given last page of User records are displayed
    When User clicks next link of pagination
    Then Next link of pagination should be disabled

  Scenario: Verify pagination Previous link
    Given User is on Manage user page
    When User clicks previous link of pagination
    Then previous page should be displayed

  Scenario: Verify pagination previous link in first page of user table
    Given First page of user table is displayed
    When User clicks previous link of pagination
    Then Previous link of pagination should be disabled

  Scenario: Verify button with << icon
    Given User is on Manage user page
    When User clicks << icon in pagination
    Then User should see the First page of the table

  Scenario: Verify button with >> icon
    Given User is on Manage user page
    When User clicks >> icon in pagination
    Then User should see the last page of the table
