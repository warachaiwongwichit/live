Feature: Admin page scenarios

  Background:
    Given  I navigate to Login page
    And I enter username as  "admin" and password as "admin123" and click on Sign in button


  Scenario: I should see a number for each role and department
    Then I should see a number for each role and department

  Scenario: I should not be able to delete Role or Department if it is assigned to an employee
    Then I should not be able to delete Role or Department if it is assigned to an employee

  Scenario:  Verify Employee is populate
    When I input "ID" as "1010"
    And I input "firstname" as "Games"
    And I input "lastname" as "Wong"
    And  I input "Selecrole" as "QA"
    And  I input "Selecdepartment" as "HR"
    Then I click Enter button
    Then Employee is populate in the data table




