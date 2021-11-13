Feature: Login page scenarios

  Background:
    Given  I navigate to Login page

  Scenario: When I sign in with user credentials it should take me to user page
    And I enter username as  "user" and password as "user123" and click on Sign in button
    Then I should see the WELCOME USER!

  Scenario: When I sign in with admin credentials it should take me to admin page
    And I enter username as  "admin" and password as "admin123" and click on Sign in button
    Then I should see the WELCOME ADMIN!

  Scenario: When I try to sign in with wrong credentials it should give me error
    And I enter username as  "admin" and password as "user123" and click on Sign in button
    Then I should see the Incorrect password error

  Scenario: When I try to sign in with wrong credentials it should give me error
    And I enter username as  "QA" and password as "user123" and click on Sign in button
    Then I should see the Incorrect Invalid username error






