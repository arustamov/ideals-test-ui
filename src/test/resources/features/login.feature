@log_in
Feature: Log in

  As an admin
  I want a user to log in
  In order to access registered user specific features

  Scenario: User should be able to log in with his email and password

    Given there is a registered user

    When I act as the "user"
    And I navigate to the site
    And I go to log in
    And I log in

    Then I should see my account
