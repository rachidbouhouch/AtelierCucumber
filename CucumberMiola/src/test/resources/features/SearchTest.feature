Feature: Search on Wikipedia
  Scenario: Search direct on Wiki
    Given Enter search term 'Cucumber'
    When Do search
    Then Single result is shown for 'Cucumber'