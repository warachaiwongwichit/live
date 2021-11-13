Feature: User page

  Background:
    Given I navigate to Login page
    And I enter username as  "user" and password as "user123" and click on Sign in button

  Scenario: Verify employee data table
    Then  I should be able to see table field id
    And I should be able to see table field first name
    And I should be able to see table field last name
    And I should be able to see table field role
    And I should be able to see table field department