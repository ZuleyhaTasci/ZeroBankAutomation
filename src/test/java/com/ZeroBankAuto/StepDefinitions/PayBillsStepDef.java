package com.ZeroBankAuto.StepDefinitions;

import com.pages.PayBillsPage;
import com.utilities.BrowserUtils;
import com.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class PayBillsStepDef {

    PayBillsPage payBillsPage = new PayBillsPage();


    @Then("click Pay Bills button")
    public void click_Pay_Bills_button() {

        payBillsPage.PayBills.click();
    }


    @Then("Activity page should have the title {string}")
    public void activity_page_should_have_the_title(String expectedTitle) {

        String title = Driver.get().getTitle();
        BrowserUtils.waitFor(2);
        Assert.assertEquals(expectedTitle, title);

    }

    @When("the user enters valid credentials on pays bills page")
    public void the_user_enters_valid_credentials_on_pays_bills_page() {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }


    @Then("the user successful Pay operation, {string}")
    public void the_user_successful_Pay_operation(String string) {


    }

    @Then("without entering the amount or date, {string}")
    public void without_entering_the_amount_or_date(String string) {

    }

}
