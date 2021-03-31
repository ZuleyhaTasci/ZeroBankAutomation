package com.ZeroBankAuto.StepDefinitions;

import com.utilities.ConfigurationReader;
import com.utilities.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

public class Hooks {

    @Before
    public void start() {

        String url = ConfigurationReader.get("url");
        Driver.get().get(url);
        Driver.get().manage().window().maximize();
    }

    //    @After
    public void clase() {
        Driver.closeDriver();
    }

}
