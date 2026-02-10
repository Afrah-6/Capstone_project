
Feature: Contact Us Functionality

  As a user of BooksWagon

  I want to submit the Contact Us form

  So that I can reach out for support or inquiries



  Scenario: Successfully fill out the Contact Us form for courier issues

    Given I am on the BooksWagon homepage

    When I click on the Contact Us link

    And I enter "John Doe" in the name field

    And I enter "johndoe@example.com" in the email field

    And I enter "123 Main Street, New York" in the address field

    And I enter "9876543210" in the phone field

    And I enter "Late Delivery" in the subject field

    And I select "Courier Related" from the subject type dropdown

    And I enter "My order has not arrived yet" in the description field