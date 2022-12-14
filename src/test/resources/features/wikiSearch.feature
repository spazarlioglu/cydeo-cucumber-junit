@steve_jobs
Feature: Wikipedia search functionality and verifications

  Scenario: Wikipedia Search Functionality Title Verification
    Given User is on Wikipedia home page
    When User types "Bill Gates" in the wiki search box
    And User clicks wiki search button
    Then User sees "Bill Gates" is in the wiki title

  Scenario: Wikipedia Search Functionality Header Verification
    Given User is on Wikipedia home page
    When  User types "Steve Jobs" in the wiki search box
    And User clicks wiki search button
    Then User sees "Steve Jobs" is in the main header

  @wip
  Scenario Outline: Wikipedia Search Functionality Header Verification
    Given User is on Wikipedia home page
    When  User types "<searchValue>" in the wiki search box
    And User clicks wiki search button
    Then User sees "<expectedTitle>" is in the main header
    Then User sees "<expectedMainHeader>" is in the wiki title

    Examples: search values we are going to be using in this scenario is as below
      | searchValue       | expectedTitle     | expectedMainHeader |
      | Steve Jobs        | Steve Jobs        | Steve Jobs         |
      | Cristiano Ronaldo | Cristiano Ronaldo | Cristiano Ronaldo  |
      | Bob Marley        | Bob Marley        | Bob Marley         |
      | Lady Gaga         | Lady Gaga         | Lady Gaga          |

