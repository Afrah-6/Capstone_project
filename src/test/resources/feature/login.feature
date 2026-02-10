Feature: Bookswagon Login Functionality



  Scenario: Login with invalid credentials

    Given user is on Bookswagon login page

    When user enters invalid username or password

    Then user should see login error message



  Scenario: Login with empty credentials

    Given user is on Bookswagon login page

    When user clicks login without entering credentials

    Then user should see validation message



  Scenario: Login with valid credentials

    Given user is on Bookswagon login page

    When user enters valid username and password

    Then user should be logged in successfully