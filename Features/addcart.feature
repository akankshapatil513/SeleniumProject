Feature: Add Cart items

  Background:
    Given user open chrome
    And open url "https://www.saucedemo.com
    And user enter username "standard_user"
    And user enter password "secret_sauce"
    And user enter login button


  Scenario: Validate add cart items
    When user logins succesfully
    And add one item in cart
    And add another item in cart
    Then user can see container count
    And user can validate cart items