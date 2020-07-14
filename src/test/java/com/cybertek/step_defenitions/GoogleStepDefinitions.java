package com.cybertek.step_defenitions;

import com.cybertek.page.GoogleSearchPage;
import com.cybertek.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;

public class GoogleStepDefinitions {

    //creating the page object
    GoogleSearchPage googleSearchPage = new GoogleSearchPage();

    @Given("User is on the google search page")
    public void user_is_on_the_google_search_page() {
        //Assert.fail("Unpurpose failing here!!!!!!!!");

        //opening browser -> getting google.com
        Driver.getDriver().get("https://www.google.com");

    }


    @Then("User should see title is Google")
    public void user_should_see_title_is_google() {
        //comparing actual title vs expected
        String actualTitle = Driver.getDriver().getTitle();
        String expectedTitle = "Google";

        //THIS LINE WILL FAIL THIS TEST NO MATTER WHAT
        //Assert.fail("MY CUSTOM MESSAGE FROM MY ASSERT FAIL!..");

        //Both assertions is not needed. Just for the example's sake.
        Assert.assertTrue("Actual title does not match expected title!",actualTitle.equals(expectedTitle));
        Assert.assertEquals("Actual title does not match expected title!", actualTitle, expectedTitle);

    }


    @When("User searches apple")
    public void userSearchesApple() {

        //sending value into search box using page object
        googleSearchPage.searchBox.sendKeys("apple" + Keys.ENTER);

    }

    @Then("User should see apple in the title")
    public void userShouldSeeAppleInTheTitle() {

        String expectedTitle = "apple - Google Search";
        String actualTitle = Driver.getDriver().getTitle();

        Assert.assertEquals(actualTitle, expectedTitle);

    }


    @When("User searches {string}")
    public void userSearches(String searchValue) {



        //sending value into search box using page object
        googleSearchPage.searchBox.sendKeys(searchValue + Keys.ENTER);

    }

    @Then("User should see {string} in the title")
    public void userShouldSeeInTheTitle(String expectedInTitle) {

        String expectedTitle = expectedInTitle + " - Google Search";
        String actualTitle = Driver.getDriver().getTitle();

        Assert.assertEquals(actualTitle, expectedTitle);

    }


    @Then("User should see About link")
    public void userShouldSeeAboutLink() {
        //asserting that about link is displayed
        Assert.assertTrue(googleSearchPage.aboutLink.isDisplayed());
    }

    @And("User clicks to About link")
    public void userClicksToAboutLink() {
        //clicking to about link
        googleSearchPage.aboutLink.click();

    }

    @Then("User should see title Google - About Google, Our Culture & Company News")
    public void userShouldSeeTitleGoogleAboutGoogleOurCultureCompanyNews() {

        String expectedTitle = "Google - About Google, Our Culture & Company News";
        String actualTitle = Driver.getDriver().getTitle();

        Assert.assertEquals(actualTitle, expectedTitle);

    }
}