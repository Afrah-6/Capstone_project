Feature: Change Password Functionality

  As a registered user of BooksWagon

  I want to be able to change my account password

  So that I can keep my account secure



  Scenario: Successfully navigate to change password and submit the form

    Given I am on the BooksWagon home page

    When I hover over the username menu

    And I click on the link

    And I enter "hhhhhhh" as the current password

    And I enter "aaaaaaa" as the new password

    And I enter "ppp" as the confirm password

    And I click the submit button