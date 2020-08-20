@datatable01 @third
Feature: scenario outline example
  Scenario: testing the data tables web page
    Given User is on the datatables homepage
    When User clicks on new button
    And User enters first name "Numan"
    And User enters last name "Salim"
    And User enters position "DEV"
    And User enters office "Leipzig"
    And User enters extension "222"
    And User enters start date "2020-08-26"
    And User enters salary "90000"
    And User clicks Create button
    And User enters first name "Numan" to the searchbox
    Then verify that user see the first name "Numan" in the searchbox