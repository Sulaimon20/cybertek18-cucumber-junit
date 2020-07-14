package com.cybertek.page;

import com.cybertek.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WikipediaSearchPage {

    public WikipediaSearchPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(name = "search")
    public WebElement searchBox;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement submitButton;

    @FindBy(xpath = "//h1[@id='firstHeading']")
    public WebElement mainHeader;

    @FindBy(xpath = "(//img)[2]")
    public WebElement steveJobsPics;

}
