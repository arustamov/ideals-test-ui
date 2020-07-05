@log_out
Feature: Log out

  As a user
  I want to log out
  In order to prevent access to my account

  Scenario: User should be able to log out by UI

    Given there is a registered user

    When I act as the "user"
    And I navigate to the site
    And I go to log in
    And I log in
    And I log out

    Then I should see authentication page

  Scenario: User should be able to log out by controller

    Given there is a registered user

    When I act as the "user"
    And I navigate to the site
    And I go to log in
    And I log in
    And I navigate to log out

    Then I should see start page
