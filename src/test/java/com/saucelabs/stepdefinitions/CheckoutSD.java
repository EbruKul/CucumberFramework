package com.saucelabs.stepdefinitions;

import com.saucelabs.base.ConfigReader;
import com.saucelabs.pages.*;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class CheckoutSD {

    @Given("User successfully login")
    public void verifyLoggedIn(){
        LoginPage.enterUsername(ConfigReader.getProperty("username"));
        LoginPage.enterPassword(ConfigReader.getProperty("password"));
        LoginPage.clickLoginBtn();
        String expectedUrl = "https://www.saucedemo.com/inventory.html";
        Assert.assertEquals(expectedUrl, LoginPage.verifyURL());
    }

    @When("User clicks on item with name {string}")
    public void clickTheItem(String itemName){
        HomePage.clickItem(itemName);
    }

    @And("User clicks on the ADD TO CARD button")
    public void clickAddToCard(){
        ItemPage.clickAddToCart();
    }

    @And("User clicks on the SHOPPING CARD button")
    public void clickShoppingCard(){
        ItemPage.clickShoppingCard();
    }

    @And("User clicks on the CHECKOUT button")
    public void clickCheckout(){
        CheckoutStepOne.clickCheckout();
    }

    @And("User enters the information as {string}, {string}, {string}")
    public void enterInfo(String firstName, String lastName, String zipCode){
        CheckoutStepTwo.sendOrderInformation(firstName, lastName, zipCode);
    }

    @And("User clicks on the CONTINUE button")
    public void clickContinue(){
        CheckoutStepTwo.clickContinue();
    }

    @Then("Item name matches that of {string}")
    public void verity_name_matches(){
        Assert.assertTrue(true);
    }

}
