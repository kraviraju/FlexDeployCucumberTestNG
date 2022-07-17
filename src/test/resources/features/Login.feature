@regression
Feature: Login Action 
    Description: This feature will test a LogIn and LogOut functionality of various scenarios

  @validlogin
  Scenario Outline: Login with valid Credentials 
    Given user navigate to url
    When user enter username "<username>" and password "<password>"
    And click login button
    Then The user redirect to Dashboard page
    And Logout
    Examples:
      | username     | password |
      | automation   | Welcome1$   |
      
  @invalidlogin
  Scenario Outline: Login with Invalid Credentials 
    Given user navigate to url
    When user enter username "<username>" and password "<password>"
    And click login button
    Then The user redirect to Dashboard page
    
    Examples:
      | username | password  |
      | sfuddd   | Welcome1 |      