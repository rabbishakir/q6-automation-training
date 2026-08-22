Feature: Staff Registration

  Background:
    Given user is on the HMS login page
    When user enters a valid username
    And user enters a valid password
    And user clicks the Sign In button
    Then user should login successfully

  @staffRegistrationTest
  Scenario Outline: Fill staff registration form with different staff roles
    When user clicks the Register New Staff link
    Then user should see the staff registration page title "Register New Staff"
    When user enters staff full name "<fullName>"
    And user enters staff email "<email>"
    And user enters staff temporary password "<password>"
    And user enters staff username "<username>"
    And user selects staff role "<role>"
    And user enters staff confirm password "<confirmPassword>"

    Examples:
      | fullName             | email                      | password    | username      | role         | confirmPassword |
      | Automation Doctor    | auto.doctor@example.com    | Student@123 | autodoctor    | Doctor       | Student@123     |
      | Automation Nurse     | auto.nurse@example.com     | Student@123 | autonurse     | Nurse        | Student@123     |
      | Automation Reception | auto.reception@example.com | Student@123 | autoreception | Receptionist | Student@123     |
