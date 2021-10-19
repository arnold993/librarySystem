Feature: Is it Friday?
  Everybody want to know when it's Friday

  Scenario: Monday is not Friday
    Given Today is Monday
    When I ask weather it's Friday
    Then I should be told "no"

  Scenario: Friday is Friday
    Given Today is Friday
    When I ask weather it's Friday
    Then I should be told "yes"
