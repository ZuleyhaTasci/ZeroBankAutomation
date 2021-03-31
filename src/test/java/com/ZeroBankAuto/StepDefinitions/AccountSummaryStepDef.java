package com.ZeroBankAuto.StepDefinitions;

import com.pages.AccountSummaryPage;
import com.pages.BasePage;
import com.utilities.BrowserUtils;
import com.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.ArrayList;
import java.util.List;

public class AccountSummaryStepDef {

    AccountSummaryPage accountSummaryPage = new AccountSummaryPage();

    @Then("the title supposed to be {string}")
    public void the_title_supposed_to_be(String expectedTitle) {
        String title = Driver.get().getTitle();
        System.out.println(title);

        BrowserUtils.waitFor(2);
        Assert.assertEquals(expectedTitle, title);
    }

    @Then("following account types")
    public void following_account_types(List<String> expectedtype) {

        List<String> accuatype = BrowserUtils.getElementsText(accountSummaryPage.Tabletitle);

        for (int i = 0; i < accountSummaryPage.creditAccountTitles.size(); i++) {

        }
        Assert.assertEquals(expectedtype, accuatype);
        System.out.println(expectedtype);
    }

    @Then("Account table must have")
    public void account_table_must_have(List<String> expectedtable) {

        List<String> accualtable = BrowserUtils.getElementsText((accountSummaryPage.creditAccountTitles));
        for (int i = 0; i < accountSummaryPage.Tabletitle.size(); i++) {

        }
        Assert.assertEquals(expectedtable, accualtable);
        System.out.println(expectedtable);
    }

}
