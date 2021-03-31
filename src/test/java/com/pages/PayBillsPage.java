package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PayBillsPage {


    @FindBy(xpath = "//li[@class='active']")
    public WebElement PayBills;

}
