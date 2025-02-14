Feature: User Details to add items

  Background:
    Given users opening chrome
    And users opening url "https://saucedemo.com"
    And users entering username "standard_user"
    And users entering password "secret_sauce"
    And users entering login button
    And users added one item in cart
    And users click on checkout button


    Scenario: Validate user details
      Given user open form to fill the detail
      And user enter first name "Akanksha"
      And user enter last name "patil"
      And user enter postcode "411043"
      And user click on continue button
      Then user validate checkout overview details
