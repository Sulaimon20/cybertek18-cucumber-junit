Feature: Wikipedia Search
  Agile Story: As a user, I should be able to search when I am on Wikipedia search page.

  Background: User should be on Wikipedia search page
    Given User is on the Wikipedia home search page

@step1
  Scenario: Wikipedia Search Functionality Title Verification
    When User types Steve Jobs in the wiki search box
    And User clicks wiki search button
    Then User sees Steve Jobs is in the wiki title
  @step2
  Scenario: Wikipedia Search Functionality Header Verification
    When User types Steve Jobs in the wiki search box
    And User clicks wiki search button
    Then User sees Steve Jobs is in the main header
  @step3
  Scenario: Wikipedia Search Functionality Image Header Verification
    When User types Steve Jobs in the wiki search box
    And User clicks wiki search button
    Then User sees Steve Jobs  is in the image header





