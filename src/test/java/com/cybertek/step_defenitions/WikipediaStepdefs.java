package com.cybertek.step_defenitions;

import com.cybertek.page.WikipediaSearchPage;
import com.cybertek.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

public class WikipediaStepdefs {

    //creating POM
    WikipediaSearchPage wikisearch=new WikipediaSearchPage();

    @Given("User is on the Wikipedia home search page")
    public void user_is_on_the_wikipedia_home_search_page() {
        Driver.getDriver().get("https://www.wikipedia.org");

    }


    @When("User types Steve Jobs in the wiki search box")
    public void user_types_steve_jobs_in_the_wiki_search_box() {
        wikisearch.searchBox.sendKeys("Steve Jobs");
    }

    @When("User clicks wiki search button")
    public void user_clicks_wiki_search_button() {
        wikisearch.submitButton.click();
    }
    @Then("User sees Steve Jobs is in the wiki title")
    public void user_sees_steve_jobs_is_in_the_wiki_title() {
        String expectedTitle="Steve Jobs - Wikipedia";
        String actualTitle=Driver.getDriver().getTitle();
        Assert.assertEquals(actualTitle,expectedTitle);
    }

    @Then("User sees Steve Jobs is in the main header")
    public void userSeesSteveJobsIsInTheMainHeader() {
    String expectedMainHeader="Steve Jobs";
    String actualMainHeader=wikisearch.mainHeader.getText();
    Assert.assertTrue(actualMainHeader.contains(expectedMainHeader));

    }

    @Then("User sees Steve Jobs  is in the image header")
    public void userSeesSteveJobsIsInTheImageHeader() {
        WebElement image=wikisearch.steveJobsPics;
        Assert.assertTrue(image.isDisplayed());
    }
}
