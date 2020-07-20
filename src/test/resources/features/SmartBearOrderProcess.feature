Feature: SmartBear modules functionality

  @smartbears
  Scenario Outline: SmartBear Tester account and order module functionality verification

    When User is on the SmartBear and logged into SmartBear Tester account and on Order page

    And User should be able to see "<BrowserTitle>"
    Then User fills out the form as followed:
    And User selects "<Product>" from product dropdown
    And User enters "<quantity>" to quantity
    And User enters "<name>" to costumer name
    And User enters "<Street>" to street
    And User enters "<City>" to city
    And User enters "<State>" to state
    And User enters "<Zip>"
    And User selects "<Card>" as card type
    And User enters "<Card Nr>" to card number
    And User enters "<Expire date>" to expiration date
    And User clicks process button
    When  User see "<name>" is in the list
    Then User verifies "<expected>" is in the list
    Examples:
      | Product     | quantity | Street     | City    | State | Zip   | Card | Card Nr          | Expire date | name      | expected  | BrowserTitle |
      | FamilyAlbum | 4        | Kinzie Ave | Chicago | IL    | 60056 | Visa | 1111222233334444 | 12/22       | John Wick | John Wick | Web Order    |










