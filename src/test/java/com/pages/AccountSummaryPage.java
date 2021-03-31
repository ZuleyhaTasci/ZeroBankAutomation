package com.pages;

import com.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class AccountSummaryPage extends BasePage {

    @FindBy(xpath = "//h2[@class='board-header']")
    public List<WebElement> Tabletitle;


    @FindBy(xpath = "(//div[@class='board-content']/table/thead)[3]/tr/th")
    public List<WebElement> creditAccountTitles;


    public AccountSummaryPage() {
        PageFactory.initElements(Driver.get(), this);
    }
}
