Feature: Login Functionality

  Background:
    Given the user is on the Bookswagon login page

  # 1. Empty Fields Case
  Scenario: Login with empty credentials
    When the user clicks the login button
    Then an error message should be displayed

  # 2. Incorrect Credentials Case
  Scenario: Login with incorrect credentials
    When the user enters email "wronguser@test.com"
    And the user enters password "WrongPassword123"
    And the user clicks the login button
    Then an error message should be displayed

  # 3. Valid Login (Performed Last)
  Scenario: Login with valid credentials
    When the user enters email "Noorafrah2005@gmail.com"
    And the user enters password "bookswagon@0604"
    And the user clicks the login button
    Then the user should be redirected to the account dashboard