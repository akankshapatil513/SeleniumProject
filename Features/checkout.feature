Feature:checkout Items

  Background:
    Given user opening chrome
    And open url "https://saucedemo.com"
    And user entering username "standard_user"
    And user entering password "secret_sauce"
    And user entering login button
    And added one item in cart

    Scenario:Validate checkout process
      Given user login the application and added items in cart
      And user click on checkout button
      Then user validate checkout page
