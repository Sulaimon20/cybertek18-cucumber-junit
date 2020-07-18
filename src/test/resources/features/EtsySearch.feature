Feature: Etsy search feature
  Agile story: User should be able to enter search terms and see
  relevant results in the page and in the title.

  Background: User is on the Etsy home page
    Given User is on the Etsy home page

@etsyWip1
  Scenario: Title verification
    Then User should see title is as expected
  @etsyWip2
  Scenario: Etsy Search Functionality Title Verification
    When User searches "wooden spoon" in the search box
    And User clicks to search button
    Then User should see "Wooden spoon" is in the Etsy title
