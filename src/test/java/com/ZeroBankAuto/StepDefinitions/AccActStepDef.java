package com.ZeroBankAuto.StepDefinitions;

import com.pages.AccActPage;
import com.utilities.BrowserUtils;
import com.utilities.Driver;
import io.cucumber.java.en.Then;
import org.junit.Assert;

import java.util.List;

public class AccActStepDef {

    AccActPage accActPage = new AccActPage();

    @Then("click Account Activity button")
    public void click_Account_Activity_button() {


    }

    @Then("the title supposed to  {string}")
    public void the_title_supposed_to_be(String expectedTitle) {
        String title = Driver.get().getTitle();
        System.out.println(title);
        BrowserUtils.waitFor(2);
        Assert.assertEquals(expectedTitle, title);
    }

    @Then("Account drop down should  {string}")
    public void account_drop_down_should_be(String string) {

        String accsaving = accActPage.Savig.getText();

        Assert.assertEquals(accActPage, accsaving);
        System.out.println(accsaving);

    }

    @Then("Account drop down should have following")
    public void account_drop_down_should_have_following(List<String> expectedDropDown) {

        List<String> accuatype = BrowserUtils.getElementsText(accActPage.AccountDropDown);

        for (int i = 0; i < accActPage.AccountDropDown.size(); i++) {

        }
        Assert.assertEquals(expectedDropDown, accuatype);
        System.out.println(expectedDropDown);

    }

    @Then("Transactions table should have column names")
    public void transactions_table_should_have_column_names(List<String> expectedTransactionsTable) {

        List<String> accoualtable = BrowserUtils.getElementsText(accActPage.TransactionsTable);
        for (int i = 0; i < accActPage.TransactionsTable.size(); i++) {

        }
        Assert.assertEquals(expectedTransactionsTable, accoualtable);
    }


}
