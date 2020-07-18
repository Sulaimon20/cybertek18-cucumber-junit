package com.cybertek.page;

import com.cybertek.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EtsySearchPage {

    public EtsySearchPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(name = "search_query")
    public WebElement searchBox;

    @FindBy(xpath = "(//button[@type='submit'])[1]")
    public WebElement submitButton;


}
