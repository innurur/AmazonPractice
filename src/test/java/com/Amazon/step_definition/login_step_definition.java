package com.Amazon.step_definition;

import com.Amazon.Pages.loginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class login_step_definition {

    loginPage lp = new loginPage();

    @Given("User is on {string} page")
    public void user_is_on_page(String string) {


    }


    @When("User navigate to sign in button and click")
    public void userNavigateToSignInButtonAndClick() {

        lp.signInBtn.click();
    }


    @And("User enter username or phone number or email address")
    public void userEnterUsernameOrPhoneNumberOrEmailAddress() {

        lp.loginButton.sendKeys();
    }


    @When("User click continue button")
    public void user_click_continue_button() {

    }


    @When("User enter the {string} in password box")
    public void user_enter_the_in_password_box(String string) {

    }


    @When("User click Sign-in button")
    public void user_click_sign_in_button() {

    }


    @Then("User should able to see homepage with the {string} message")
    public void user_should_able_to_see_homepage_with_the_message(String string) {

    }



}
