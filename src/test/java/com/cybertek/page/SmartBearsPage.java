package com.cybertek.page;

import com.cybertek.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SmartBearsPage {

    public SmartBearsPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//input[@id='ctl00_MainContent_username']")
    public WebElement loginBox;

    @FindBy(xpath = "//input[@id='ctl00_MainContent_password']")
    public WebElement passwordBox;

    @FindBy(xpath = "//input[@type='submit']")
    public WebElement submitButton;

    @FindBy(xpath = "//a[.='Order']")
    public WebElement orderLink;

    @FindBy(id = "ctl00_MainContent_fmwOrder_ddlProduct")
    public WebElement ProductSelectDropDown;

    @FindBy(id = "ctl00_MainContent_fmwOrder_txtQuantity")
    public WebElement quantityBox;


    @FindBy(id = "ctl00_MainContent_fmwOrder_txtName")
    public WebElement nameValueBox;

    @FindBy(id = "ctl00_MainContent_fmwOrder_TextBox2")
    public WebElement streetBox;

    @FindBy(id = "ctl00_MainContent_fmwOrder_TextBox3")
    public WebElement cityBox;

    @FindBy(id = "ctl00_MainContent_fmwOrder_TextBox4")
    public WebElement stateBox;

    @FindBy(id = "ctl00_MainContent_fmwOrder_TextBox5")
    public WebElement zipBox;

    //Payment Information
    @FindBy(id = "ctl00_MainContent_fmwOrder_TextBox6")
    public WebElement cardNumber;
    @FindBy(id = "ctl00_MainContent_fmwOrder_TextBox1")
    public WebElement expirationDate;

    @FindBy(id = "ctl00_MainContent_fmwOrder_InsertButton")
    //  //a[@id='ctl00_MainContent_fmwOrder_InsertButton']
    public WebElement processButton;
    @FindBy(xpath = "//a[.='View all orders']")
    public WebElement ordersList;

    @FindBy(xpath = "//table[@class='SampleTable']//td[2]")
    public WebElement namesList;




}
