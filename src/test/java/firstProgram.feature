Feature: Application login
  Background:
    When launch the browser from config variables
    And hit the home page url of banking site

  @RegressionTest
  Scenario: Admin Page default login
    Given User is on NetBanking landing page
    When User login into application with "admin" and password "1234"
    Then Home Page is displayed
    And Cards are displayed

  @RegressionTest @NetBanking
  Scenario: User Page default login
    Given User is on NetBanking landing page
    When User login into application with user and password "0953"
    Then Home Page is displayed
    And Cards are displayed

  @SmokeTest @RegressionTest @Mortgage
  Scenario Outline: Mortgage Username Page default login
    Given User is on NetBanking landing page
    When User login into application with "<username>" and password "<password>"
    Then Home Page is displayed
    And Cards are displayed

    Examples:
      | username   | password |
      | debitUser  | hello123 |
      | creditUser | asd345   |

  @SmokeTest
  Scenario: User Page default Sign up
    Given User is on Practice landing page
    When User login into application
      | edwin          |  |
      | vega           |  |
      | email@mail.com |  |
      | 5533323423     |  |
    Then Home Page is displayed
    And Cards are displayed
