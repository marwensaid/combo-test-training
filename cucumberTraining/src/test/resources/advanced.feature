Feature: Advanced Tests

  Scenario: User can perform advanced actions
    Given the user is on the profile page
    When the user updates their profile with the following information
      | Field       | Value          |
      | First Name  | John           |
      | Last Name   | Doe            |
    Then the profile should be updated successfully
