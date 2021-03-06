package com.cybertek.page;

import com.cybertek.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WikipediaSearchPage {

    public WikipediaSearchPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "searchInput")
    public WebElement searchBox;

    @FindBy(id = "firstHeading")
    public WebElement mainHeaderAfterSearch;

    @FindBy(className = "fn")
    public WebElement imageHeaderAfterSearch;

    //BREAK UNTIL 2.06PM EST
}