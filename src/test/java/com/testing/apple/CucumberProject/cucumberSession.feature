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

Feature: Purchase IPad

Scenario: Select Ipad

Given User launch the application
When User Click On Ipad Link
Then Click On Buy Link
Then Click On Silver Color
Then Click On 32GB Storage
Then Click On WiFI+Cellular Connectivity
Then Click On AppleCare
Then Click On Add
Then Click On Continue
Then Click On AddToBag
Then Click On ReviewBag Button
Then Click On CheckOut
Then Click On ContinueasGuest
Then Select ContinueToShipping Address
Then Enter Address Details
Then Click On ContinueToPayment 
Then Select Credit/Debit
Then Enter CreditCard Details
Then Click On Order
Then Verify Error Message
Then Close Browser


