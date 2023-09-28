Feature: Confirm purchase order.

  Background:
    Given User is on login page "https://www.saucedemo.com/"

  Scenario: Confirm satisfactory order
    Given that an User enters username as "standard_user" and password as "secret_sauce"
    When the user login with account
    And the user select any article
    And the user confirm order on shopping cart
    Then the user should be to see confirm purchase message "Thank you for your order!"