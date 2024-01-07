package com.loop.step_definitions;

import com.loop.pages.LoginPage;
import com.loop.utilitues.BrowserUtils;
import com.loop.utilitues.ConfigurationReader;
import com.loop.utilitues.DocuportConstants;
import com.loop.utilitues.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.Assert.assertEquals;

public class LoginStepDef {
    LoginPage  loginPage = new LoginPage();
    @Given("user is on Docuport login page")
    public void user_is_on_docuport_login_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("env"));
    }
    @When("user enters username for client")
    public void user_enters_username_for_client()  {
        BrowserUtils.waitForClickable(loginPage.login, DocuportConstants.LARGE);
        loginPage.username.sendKeys(DocuportConstants.USERNAME_CLIENT);
    }
    @When("user enters password for client")
    public void user_enters_password_for_client() {
        loginPage.password.sendKeys(DocuportConstants.PASSWORD_DOCUPORT);
    }
    @When("user clicks login button")
    public void user_clicks_login_button() {
        loginPage.login.click();
    }
    @Then("user should see the home page for client")
    public void user_should_see_the_home_page_for_client() {
        BrowserUtils.justWait(3000);
        loginPage.continueBunnton.click();
        //Assert.assertTrue(loginPage.title.getAttribute("alt").contains("Docuport"));
        assertEquals(loginPage.title.getAttribute("alt"),"Docuport");

    }


    @When("user enters username for Employee")
    public void user_enters_username_for_employee() {

    }

    @When("user enters password for Employee")
    public void user_enters_password_for_employee() {

    }

    @Then("user should see the home page for Employee")
    public void user_should_see_the_home_page_for_employee() {

    }

    @When("user enters username for Advisor")
    public void user_enters_username_for_advisor() {

    }
    @When("user enters password for Advisor")
    public void user_enters_password_for_advisor() {
;
    }
    @Then("user should see the home page for Advisor")
    public void user_should_see_the_home_page_for_advisor() {

    }


    @When("user enters username for supervisor")
    public void user_enters_username_for_supervisor() {

    }
    @When("user enters password for supervisor")
    public void user_enters_password_for_supervisor() {

    }
    @Then("user should see the home page for supervisor")
    public void user_should_see_the_home_page_for_supervisor() {

    }



}
