Feature: Category

  @category
  Scenario: As a user, I should able to hover on category successfully

    Given I am on Nopecommerce HomePage
    When I hover on Computers Link
    Then I should able to see sub category successfully