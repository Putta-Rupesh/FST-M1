@Activity1
Feature: Basic Syntax

Scenario: test the TSO home page
  Given the user is on TS homepage
  When they click on the about us link
  Then they are redirected to the about us page
 