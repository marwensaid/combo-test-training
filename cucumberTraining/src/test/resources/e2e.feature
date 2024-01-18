Feature: E2E Tests

  Scenario: User can log in
    Given the user is on the login page
    When the user enters valid credentials
    And clicks the login button
    Then the user should be redirected to the dashboard

  Scenario: User can add an item to the cart
    Given the user is on the product page
    When the user adds an item to the cart
    Then the item should appear in the cart
