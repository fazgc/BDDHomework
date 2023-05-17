package org.example;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MyStepDefs {
    HomePage homepage = new HomePage();
    RegistartionPage registrationPage = new RegistartionPage();
    RegisterResultPage registerResultPage = new RegisterResultPage();
    @Given("I am on the registration page")
    public void I_am_on_the_registration_page(){
        homepage.verifyUserOnHomepage();
        homepage.clickOnRegisterButton();
    }
    @When("I enter Required registration details")
    public void I_enter_required_registration_details(){
        registrationPage.registerDetails();
    }
    @Then("I should able to register successfully")
    public void I_should_able_to_register_successfully(){
        registerResultPage.verifyUserRegisteredSuccessfully();

    }
}
