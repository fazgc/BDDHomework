package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

import static org.example.BasePage.driver;

public class HomePage extends Utils{

    private By _registerButton = By.className("ico-register");


    public void verifyUserOnHomepage(){
        String actualUrl = "url";
        String expextedUrl = driver.getCurrentUrl();
        Assert.assertEquals(actualUrl,expextedUrl);
    }
    public void clickOnRegisterButton(){
      clickOnElement(_registerButton);
    }
}
