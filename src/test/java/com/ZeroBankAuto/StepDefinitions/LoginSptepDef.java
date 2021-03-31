package com.ZeroBankAuto.StepDefinitions;

import com.pages.LoginPage;
import com.utilities.ConfigurationReader;
import com.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class LoginSptepDef {

    LoginPage loginPage = new LoginPage();

    @Given("the user is on the login page")
    public void the_user_is_on_the_login_page() {
        System.out.println("the user is on the login page");
    }

    @When("the user enters valid credentials")
    public void the_user_enters_valid_credentials() {
        loginPage.username.sendKeys("username");
        loginPage.password.sendKeys(ConfigurationReader.get("password"));

    }

    @When("click on sing in button")
    public void click_on_sing_in_button() {

        loginPage.submit.click();
    }

    @Then("the user shoul be login")
    public void the_user_shoul_be_login() {
        String expectedurl = "http://zero.webappsecurity.com/bank/account-summary.html";
        String accualurl = Driver.get().getCurrentUrl();
        Assert.assertEquals(accualurl, expectedurl);

    }

    @When("the user enter not valid credentials")
    public void the_user_enter_not_valid_credentials() {
        loginPage.username.sendKeys("yasin");
        loginPage.password.sendKeys("");
    }

    @Then("{string} must be appear")
    public void must_be_appear(String expectedtroublemessage) {
        Assert.assertTrue(loginPage.troublesmassege.isDisplayed());
        String actuLMESSAGE = loginPage.troublesmassege.getText();
        Assert.assertEquals(expectedtroublemessage, actuLMESSAGE);
    }


}

