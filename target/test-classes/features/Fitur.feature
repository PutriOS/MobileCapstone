@Login
Feature: Login

  Scenario Outline: Validasi Login Function
    Given I am on Login Page
    When I input Email "<email>" and Password "<password>"
    And I click login button
    Then I validate elements "<elements>"
    Examples:
      |email|password|elements|
      |                            |password|email null|
      |priscillahalim@holyhos.co.id|        |password null|
      |priscillahalim@holyhos.co.id|pass    |password digit invalid|
      |priscillahalim@holyhos.co.id|password|login|

  @LogReport
  Scenario: see log report
    Given I am on home Page
    When I click menu log report
    Then I validate elements elements

