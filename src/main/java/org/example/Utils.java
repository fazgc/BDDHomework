package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import java.sql.Timestamp;

public class Utils extends BasePage{

    public static void clickOnElement(By by){driver.findElement(by).click();}
    public static void typeText(By by, String text){driver.findElement(by).sendKeys(text);}
    public static String getTextFromElement(By by){return driver.findElement(by).getText();
    }
    public static long timeStamp(){
        Timestamp timestamp = new Timestamp(System.currentTimeMillis());
        return timestamp.getTime();}
    public static void selectOptionText (By by, String text){
      Select select = new Select(driver.findElement(by));
      select.selectByVisibleText(text);}
    public static void selectOptionValue (By by, String value){
        Select select = new Select(driver.findElement(by));
        select.selectByValue(value);}
    public static void selectOptionIndex (By by, String index){
         Select select = new Select(driver.findElement(by));
         select.selectByIndex(Integer.parseInt(index));}

}


