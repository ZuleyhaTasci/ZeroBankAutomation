package com.pages;

import com.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    @FindBy(id = "user_login")
    public WebElement username;

    @FindBy(id = "user_password")
    public WebElement password;

    @FindBy(css = "[name='submit']")
    public WebElement submit;

    @FindBy(xpath = "//div[@class='alert alert-error']")
    public WebElement troublesmassege;


    public LoginPage() {
        PageFactory.initElements(Driver.get(), this);
    }

}
