package com.loop.step_definitions;

import com.loop.pages.GoogleSearchPage;
import com.loop.utilitues.BrowserUtils;
import com.loop.utilitues.ConfigurationReader;
import com.loop.utilitues.DocuportConstants;
import com.loop.utilitues.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;

import java.util.List;
import java.util.Map;

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
        assertEquals("expected does not match the acti=uaal","Loop Academy - Google Search",actualTitle);
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
    public void user_searchs_the_following_item(List<Map<String, String>> item) {

        for (Map<String,String> list : item){
            System.out.println(list.get("items"));
            googleSearchPage.serchBox.clear();
            googleSearchPage.serchBox.sendKeys(list.get("item")+Keys.ENTER);


        }
//

//        for (String s : item){
//            googleSearchPage.serchBox.clear();
//            googleSearchPage.serchBox.sendKeys(s + Keys.ENTER);
//            assertEquals(s + " - Google Search", Driver.getDriver().getTitle());
//        }
    }

    @When("user search for the {string}")
    public void user_search_for_the(String country) {
             googleSearchPage.serchBox.sendKeys("What is Capital is : "+country+ Keys.ENTER);
             BrowserUtils.justWait(DocuportConstants.EXTRASMALL);
    }
    @Then("user should see the {string} in the result")
    public void user_chould_see_the_in_the_result(String capital) {
        assertEquals("expected Capital city: "+capital+" does NOT match with actual: "+googleSearchPage.capital.getText(),googleSearchPage.capital.getText(),capital);

    }




}
