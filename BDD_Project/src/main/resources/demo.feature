@tag
Feature: working amazon dashboard correctly
  
  @tag2
  Scenario Outline: Title of your scenario outline
    Given I want to login to amazon
    When once login to home page
    Then validate the home page right corner button

    Examples: 
      | name  | value | status  |
      | name1 |     5 | success |
      | name2 |     7 | Fail    |
