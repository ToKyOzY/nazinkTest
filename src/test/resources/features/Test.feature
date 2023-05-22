@home
Feature: Hompage
  Scenario: Test01
    Given Navigate to the home page
    And Assert that both the email address and password inputs are present as well as the login button
    And Enter in an email address
    And Enter in an password
    And Close the page

  Scenario: Test02
    Given Navigate to the home page
    When  In the test 2 div, assert that there are three values in the listgroup
    Then  Assert that the second list item's value is set to List Item 2
    And   Assert that the second list item's badge value is 6
    And   Close the page

  Scenario: Test03
    Given Navigate to the home page
    When  In the Test 3 div, assert that "Option 1" is the default selected value.
    Then  Select "Option 3" from the select list.
    And   Assert that the selected value has changed to "Option 3".
    And   Close the page

  Scenario: Test04
    Given Navigate to the home page
    When  In the "Test 4" div, assert that the first button is enabled.
    Then  Assert that the second button is disabled.
    And   Close the page

  Scenario: Test05
    Given Navigate to the home page
    When  In the "Test 5" div, wait for a button to be displayed (with a random delay).
    Then  Click the displayed button.
    And   Assert that a success message is displayed.
    And   Assert that the button is now disabled.
    And   Close the page

  Scenario: Test06
    Given Navigate to the home page
    When  Write a method to find the value of a cell on the grid.
    Then  Use the method to find the value of the cell at coordinates (2, 2).
    And   Assert that the value of the cell is "Ventosanzap".
    And   Close the page