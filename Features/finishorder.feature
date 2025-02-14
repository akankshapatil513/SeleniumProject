
Feature: Place the order

  Background:
    Given user opening chrome
    And opening url "https://saucedemo.com"
    And user entering username "standard_user"
    And user entering password "secret_sauce"
    And user entering login button
    And added one item in cart
    And user click on checkout button
    And user open form to fill detail
    And user enter the first name "Akanksha"
    And user enter the last name "patil"
    And user enter the postcode "411043"
    And user click on continue button
    Then user validate checkout overview details



    Scenario:Finish the order
      Given items is added in cart and added all the details
      And user click on finish button
