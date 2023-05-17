package org.example;

import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;
//import java.sql.DriverManager;


import static org.example.BasePage.driver;

public class DriverManager extends Utils {
    LoadProp loadProp = new LoadProp();

   public void openBrowser(){
       //open chrome browser
       driver = new ChromeDriver();
       driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
       // open url
       driver.get(loadProp.getProperty("url"));
       driver.manage().window().maximize();
   }
   public void closeBrowser(){driver.close();}
}
