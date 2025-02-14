Feature: Add Cart items


  Background:
    Given user opens chrome
    And open url "https://saucedemo.com"
    And user enters username "standard_user"
    And user enters password "secret_sauce"
    And user enters login button
    And add one item in cart

  Scenario:Validate cart items
  Given User login in the application
    And add one item in cart
#    And add another item in cart
#   Then user can see container count
#    Then user can validate cart items