package org.example;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MyStepDefs {
    BrowserManager browserManager = new BrowserManager();
    HomePage homePage = new HomePage();
    RegisterPage registerPage = new RegisterPage();
    RegisterResultPage registerResultPage = new RegisterResultPage();
    Category category = new Category();
    @Given("I am on Nopcommerce Homepage")
    public void i_am_on_nopcommerce_homepage() {
    }

    @When("I click on Register button")
    public void i_click_on_register_button() {
        homePage.clickOnRegisterButton();
    }
    @When("I enter all required registration details")
    public void i_enter_all_required_registration_details() {
        registerPage.enterRegistrationDetails();
    }
    @Then("I should able to register successfully")
    public void i_should_able_to_register_successfully() {
        registerResultPage.verifyUserRegisteredSuccessfully();
    }

    @Given("I am on Nopecommerce HomePage")
    public void iAmOnNopecommerceHomePage() {
    }

    @When("I hover on Computers Link")
    public void iHoverOnComputersLink() {
        category.verifyHoverOnComputerCategory();
    }

    @Then("I should able to see sub category successfully")
    public void iShouldAbleToSeeSubCategorySuccessfully() {
        category.verifyLinkTextColour();
    }
}
