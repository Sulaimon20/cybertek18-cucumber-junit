package com.cybertek.step_defenitions;

import com.cybertek.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class GoogleStepDefinitions {

    @Given("User is in the google search page")
    public void user_is_in_the_google_search_page() {
        Driver.getDriver().get("https://www.google.com");

        Assert.fail("MY CUSTOM MESSAGE FROM MY ASSERT.FAIL() !!!");


    }

    @Then("User should see title is Google")
    public void user_should_see_title_is_google() {

        String actualTitle=Driver.getDriver().getTitle();
        String expectedTitle="Google";
        //We need only one, Just for the example's sake

        //Assert.fail("MY CUSTOM MESSAGE FROM MY ASSERT.FAIL() !!!");

        Assert.assertTrue("Actual title does not match expected title!",actualTitle.equals(expectedTitle));
        Assert.assertEquals("Actual title does not match expected title!",actualTitle,expectedTitle);

    }
}
