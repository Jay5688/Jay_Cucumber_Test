#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template

Feature: Login Page
  I want to use this feature for Hotel app login

 
  Scenario: Succesfull Login with valid credentials
    Given User is on the login page 
    And User name and Userid feilds are displayed 
    When User enters username and password
    And User clicks on Login button 
    Then Login is successfull
    And Search Hotel page is displayed

  