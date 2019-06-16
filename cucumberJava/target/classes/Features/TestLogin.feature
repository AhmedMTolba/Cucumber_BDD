Feature: Login Action.
  Scenario: Successful Login with Valid creditanls.
    Given User in Login Page
    When User view LoginPage Successfuly
    And User enters "Ahmed" and "pass"
    Then Message displayed Login Sucessfuly

  