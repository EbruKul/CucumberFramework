@checkout
  Feature: Checkout

    #Background: if the set up or given is long, break this given operations into Background
  Background:
    Given User successfully login


    Scenario Outline: Order Checkout
      When User clicks on item with name "<Item>"
      And User clicks on the ADD TO CARD button
      And User clicks on the SHOPPING CARD button
      And User clicks on the CHECKOUT button
      And User enters the information as "<Firstname>", "<Lastname>", "<Zip>"
      And User clicks on the CONTINUE button
      Then Item name matches that of "<Item>"

      Examples:
        |Item                   |Firstname  | Lastname | Zip  |
        |Sauce Labs Bike Light  | Test      | Test     | 12345|
        |Sauce Labs Backpack    | Test2     | Test2    | 12345|
        |Sauce Labs Fleece Bag  | Test3     | Test 3   | 23456|

