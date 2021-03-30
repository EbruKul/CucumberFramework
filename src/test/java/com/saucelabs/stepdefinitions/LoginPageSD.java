package com.saucelabs.stepdefinitions;

import com.saucelabs.base.ConfigReader;
import com.saucelabs.pages.LoginPage;
import com.saucelabs.utils.HelperMethods;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class LoginPageSD {

    @Given("User is on the Login Page")
    public void verifyLoginPage(){
        String expectedTitle ="Swag Labs";
        Assert.assertEquals(expectedTitle, LoginPage.verifyTitle());
    }

    @When("User enters valid username")
    public void userEntersValidUsername() {
        LoginPage.enterUsername("standard_user");
    }

    @And("User enters valid password")
    public void userEntersValidPassword() {
        LoginPage.enterPassword("secret_sauce");
    }

    @And("User clicks on the login button")
    public void userClicksOnTheLoginButton() {
        LoginPage.clickLoginBtn();
    }

    @Then("User sees the home page")
    public void userSeesTheHomePage() {
        String expectedUrl = "https://www.saucedemo.com/inventory.html";
        Assert.assertEquals(expectedUrl, LoginPage.verifyURL());
    }

    @When("User enters invalid username")
    public void userEntersInvalidUsername() {
        LoginPage.enterUsername(ConfigReader.getProperty("incorrectusername"));
    }

    @And("User enters invalid password")
    public void userEntersInvalidPassword() {
        LoginPage.enterPassword(ConfigReader.getProperty("incorrectpassowrd"));
    }

    @Then("User sees the error message")
    public void userSeesTheErrorMessage() {
        Assert.assertTrue(LoginPage.verifyErrMessage());
    }
}
