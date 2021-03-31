package com.pages;

import com.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class AccActPage extends BasePage {

    @FindBy(css = "[id='account_activity_tab']")
    public List<WebElement> AccountActivity;

    @FindBy(css = "[id='aa_accountId']")
    public WebElement Savig;

    @FindBy(xpath = "//option[@value]")
    public List<WebElement> AccountDropDown;


    @FindBy(xpath = "//tr")
    public List<WebElement> TransactionsTable;


    public AccActPage() {
        PageFactory.initElements(Driver.get(), this);
    }
}
