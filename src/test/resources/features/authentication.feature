Feature: User Authentication Login

  Background:
	Given user is on the HMS login page
  
  @validloginTest
  Scenario: Login with valid credentials
    When user enters a valid username
    And user enters a valid password
    And user clicks the Sign In button
    Then user should login successfully

  @invalidLoginTest	
  Scenario: invalid Login with valid credentials
    When user enters a invalid username
    And user enters a invalid password
    And user clicks the Sign In button
    Then user should see and error message
    
    
