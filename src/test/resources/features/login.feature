Feature: Login
  As a user
  I'd like to log in Sauce Lab app
  to get access to all app features

  Background: pre-conditions
    Given He has the app open

  Scenario Outline: Login successful
    When He logs into the app with her credentials
      | username   | password   |
      | <username> | <password> |
    Then He should be able to see the title <title>
    Examples:
      | username      | password     |title |
      | standard_user | secret_sauce |PRODUCTS|




