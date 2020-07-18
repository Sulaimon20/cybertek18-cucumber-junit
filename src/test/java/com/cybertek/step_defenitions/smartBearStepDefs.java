package com.cybertek.step_defenitions;

import com.cybertek.page.SmartBearsPage;
import com.cybertek.utilities.ConfigurationReader;
import com.cybertek.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class smartBearStepDefs {

 SmartBearsPage smartBearsPage=new SmartBearsPage();
 protected static WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 20);


 @When("User is on the SmartBear and logged into SmartBear Tester account and on Order page")
 public void user_is_on_the_smart_bear_and_logged_into_smart_bear_tester_account_and_on_order_page() {

  Driver.getDriver().get(ConfigurationReader.getProperty("sbUrl"));
  Driver.getDriver().manage().window().maximize();
  smartBearsPage.loginBox.sendKeys(ConfigurationReader.getProperty("sbLogin"));
  smartBearsPage.passwordBox.sendKeys(ConfigurationReader.getProperty("sbPassword"));
  smartBearsPage.submitButton.click();
   }

    @When("User should be able to see {string}")
    public void user_should_be_able_to_see(String browser) {

   Assert.assertTrue(Driver.getDriver().getTitle().contains(browser));

    }

   @Then("User fills out the form as followed:")
    public void user_fills_out_the_form_as_followed() {
  smartBearsPage.orderLink.click();
    }

    @Then("User selects {string} from product dropdown")
    public void user_selects_from_product_dropdown(String product) {
     Select select=new Select(smartBearsPage.ProductSelectDropDown);
     select.selectByVisibleText(product);

    }

    @Then("User enters {string} to quantity")
    public void user_enters_to_quantity(String num) throws InterruptedException {

     Thread.sleep(1500);
     smartBearsPage.quantityBox.sendKeys(Keys.HOME, Keys.chord(Keys.SHIFT, Keys.END), num);
    }

    @Then("User enters {string} to costumer name")
    public void user_enters_to_costumer_name(String name) {
    smartBearsPage.nameValueBox.sendKeys(name);

    }

    @Then("User enters {string} to street")
    public void user_enters_to_street(String street) {
    smartBearsPage.streetBox.sendKeys(street);
    }

    @Then("User enters {string} to city")
    public void user_enters_to_city(String city) {
    smartBearsPage.cityBox.sendKeys(city);
    }

    @Then("User enters {string} to state")
    public void user_enters_to_state(String state) {
    smartBearsPage.stateBox.sendKeys(state);
    }

    @Then("User enters {string}")
    public void user_enters(String zip ) {
    smartBearsPage.zipBox.sendKeys(zip);

    }

    @Then("User selects {string} as card type")
    public void user_selects_as_card_type(String cardName) {
        String xpath = "//label[text()='" + cardName + "']/preceding-sibling::input";
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(xpath))).click();
    }

    @Then("User enters {string} to card number")
    public void user_enters_to_card_number(String cardNum) {
     smartBearsPage.cardNumber.sendKeys(cardNum);

    }
    @Then("User enters {string} to expiration date")
    public void user_enters_to_expiration_date(String expDate) {
     smartBearsPage.expirationDate.sendKeys(expDate);

    }
    @Then("User clicks process button")
    public void user_clicks_process_button() {
    smartBearsPage.processButton.click();
    }
    @When("User see {string} is in the list")
    public void user_see_is_in_the_list(String string) {
    smartBearsPage.ordersList.click();
    }
    @Then("User verifies {string} is in the list")
    public void user_verifies_is_in_the_list(String name) {
        List<WebElement> names =Driver.getDriver().findElements(By.xpath("//table[@class='SampleTable']//td[2]"));
        for (WebElement each:names) {
            if ( each.getText().contains(name)){
            Assert.assertTrue(true);
            }
        }


    }



}


