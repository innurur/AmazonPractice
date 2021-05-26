package com.Amazon.step_definition;

import com.Amazon.Pages.searchPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.Select;

public class search_step_def {

        searchPage sp = new searchPage();

        @When("User click All button and select {dp} and click")
        public void user_click_all_button_and_select_and_click(String string) {
        sp.departmentType.click();
                Select select = new Select(sp.departmentType);
                select.selectByVisibleText("dp");
        }



        @When("User type {string} and click search button")
        public void user_type_and_click_search_button(String item) {
                sp.inputButton.sendKeys("item");
                sp.searchButton.click();

        }



        @Then("User should see the {string} of {string}")
        public void user_should_see_the_of(String w1, String w2) {
                Assert.assertTrue(sp.result.getText().contains(w1) && sp.result.getText().contains(w2));
        }

}
