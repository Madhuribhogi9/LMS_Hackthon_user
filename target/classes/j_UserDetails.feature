Feature: user details window

  Scenario: Verify the heading of User details window
    Given User is on any page after Login
    When User clicks the Tab user
    Given User is on Manage user page
    When User clicks A Add new user button
    Then User should see User details window with heading User Details

  Scenario: Verify the presence of Cancel button in user details window
    Given User is on Manage user page
    When User clicks A Add new users button
    Then User should see a button with text Cancel in user details window

  Scenario: Functionality of Cancel button
    Given User is on User details window
    When User clicks A cancel button
    Then User details window should be closed

  Scenario: Verify the presence of Submit button in user details window
    Given User is on Manage user page
    When User clicks A Add new user button
    Then User should see a button with text Submit in user details window

  Scenario: Verify the presence of Label Texts
    Given User is on Manage user page
    When User clicks Add new user button
    Then User should see the placeholders with all details

  Scenario:Verify the presence of input fields
    Given User is on Manage user page
    When User clicks Add new user button
    Then User should see the input fields with all details

  Scenario: Validating the presence of Address2 button
    Given User is on Manage user page
    When User click A Add new user button
    Then User should see the button with some text

  Scenario: Validating Address2 in User details window
    Given User is on User details window
    When User clicks the button which contains address text
    Then User should see the input field with Label "Address2"

  Scenario: Validating the presence of input number arrows in postal code input field
    Given User is on User details window
    When User clicks postal code input field
    Then User should see the input Number arrows in the postal code input field



