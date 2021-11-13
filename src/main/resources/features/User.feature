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

  Scenario:  Verify Employee is populate as User
    When I input "ID" as "1010"
    And I input "firstname" as "GamesUser"
    And I input "lastname" as "WongUser"
    And  I input "Selecrole" as "QA"
    And  I input "Selecdepartment" as "HR"
    Then I click Enter button
    Then Employee is populate in the data table