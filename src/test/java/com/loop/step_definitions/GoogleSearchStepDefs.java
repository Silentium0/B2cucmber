package com.loop.step_definitions;

import com.loop.pages.GoogleSearchPage;
import com.loop.utilitues.BrowserUtils;
import com.loop.utilitues.ConfigurationReader;
import com.loop.utilitues.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class GoogleSearchStepDefs {

    GoogleSearchPage googleSearchPage = new GoogleSearchPage();
    @Given("user  is Google search page")
    public void user_is_google_search_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("google.url"));


    }
    @When("user types loop Academy in the google search box and click enter")
    public void user_types_loop_academy_in_the_google_search_box_and_click_enter() {
        googleSearchPage.serchBox.sendKeys("Loop Academy"+ Keys.ENTER);
        BrowserUtils.takeScreenshot();
    }
    @Then("user should see Loop  Academy  - Google search in the google title")
    public void user_should_see_loop_academy_google_search_in_the_google_title() {
        String actualTitle = Driver.getDriver().getTitle();
        assertEquals("expected does not match the acti=uaal","loop Academy - Google Search",actualTitle);
    }

    @When("user types {string} in the google search box and click enter")
    public void user_types_in_the_google_search_box_and_click_enter(String input) {
       googleSearchPage.serchBox.sendKeys(input + Keys.ENTER);

    }
    @Then("user should see {string} in the google title")
    public void user_should_see_in_the_google_title(String title) {
        assertEquals("expected title: " + title + "does not match actual title"+Driver.getDriver().getTitle(),title, Driver.getDriver().getTitle());

    }

    @Given("user is on Google search page")
    public void user_is_on_google_search_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("google.url"));

    }

    @Then("user searchs the following item")
    public void user_searchs_the_following_item(List<String> item) {
//        item.forEach(p -> {
//            googleSearchPage.serchBox.clear();
//            googleSearchPage.serchBox.sendKeys(p+Keys.ENTER);
//            assertEquals(p + " - Google Search",Driver.getDriver().getTitle());
//        });

        for (String s : item){
            googleSearchPage.serchBox.clear();
            googleSearchPage.serchBox.sendKeys(s + Keys.ENTER);
            assertEquals(s + " - Google Search", Driver.getDriver().getTitle());
        }
    }




}
