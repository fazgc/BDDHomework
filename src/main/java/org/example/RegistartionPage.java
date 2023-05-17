package org.example;

import org.openqa.selenium.By;

import java.sql.Timestamp;

//import static jdk.jfr.internal.handlers.EventHandler.timestamp;

public class RegistartionPage extends Utils {
    private By _firstName = (By.xpath("//input[@id=\"FirstName\"]"));
    private By _lastName =( By.xpath("//input[@id=\"LastName\"]"));
    private By _email = By.xpath("//input[@name=\"Email\"]");
    private By _password =By.xpath("//button[contains(@fdprocessedid,\"7m36z5\")]");
    private By _confirmPassword = (By.xpath("//button[contains(@fdprocessedid,\"3890gh\")]"));
    private By _registerButton = By.xpath("//div[contains(@class,\"buttons\")]");
    private By _dayOfBirth = By.name("DateOfBirthDay");
    private By _monthOfBirthday = By.xpath("");
    private By _yearOfBirthday = By.xpath("");


    LoadProp loadProp = new LoadProp();


    public void registerDetails(){
        // Enter first name
        typeText(_firstName ,loadProp.getProperty("firstname"));
        //enter last name
        typeText(_lastName, loadProp.getProperty("lastname"));
        selectOptionIndex(_dayOfBirth, loadProp.getProperty("dayOfBirth"));
        selectOptionText(_monthOfBirthday, loadProp.getProperty("monthOfBirthday"));
        selectOptionValue(_yearOfBirthday, loadProp.getProperty("yearOfBirthday"));
        //enter email
        typeText(_email, loadProp.getProperty("email"));
        //enter password
        typeText(_password, loadProp.getProperty("password"));
        //confirm password
        typeText(_confirmPassword, loadProp.getProperty("confirmPassword"));
        //click on register submit button
        clickOnElement(_registerButton);
    }
}
