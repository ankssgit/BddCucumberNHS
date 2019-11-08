#Author: Ankit Sagar Singh

@NHSCostChecker
Feature: To verify if will get treatment from NHS as per Inputs provided

  @NHSSurvey
  Scenario: NHS Cost Checker Tool
    Given I am a person from "Wales"
    When I put my circumstances into the checker tool
    Then I should get a result of whether i will get Help or Not
  

  
