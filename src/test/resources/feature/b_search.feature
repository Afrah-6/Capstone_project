Feature: Search Functionality

  Scenario: Search and Add to Cart
    Given the user is logged into their account
    When the user searches for "The Alchemist"
    And the user selects the book from the results
    And the user adds the book to the cart
    Then the book should be successfully added