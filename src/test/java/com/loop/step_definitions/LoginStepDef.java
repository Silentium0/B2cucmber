package com.loop.step_definitions;

import com.loop.pages.LoginPage;
import com.loop.utilitues.BrowserUtils;
import com.loop.utilitues.ConfigurationReader;
import com.loop.utilitues.DocuportConstants;
import com.loop.utilitues.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.it.Ma;

import java.sql.DriverManager;
import java.util.Map;
import java.util.concurrent.TimeUnit;

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
        BrowserUtils.waitForClickable(loginPage.continueBunnton,DocuportConstants.LARGE);
        loginPage.continueBunnton.click();
        assertEquals(loginPage.title.getAttribute("alt"),"Docuport");

    }


    @When("user enters username for Employee")
    public void user_enters_username_for_employee() {
        BrowserUtils.waitForClickable(loginPage.login, DocuportConstants.LARGE);
        loginPage.username.sendKeys(DocuportConstants.USERNAME_EMPLOYEE);

    }

    @When("user enters password for Employee")
    public void user_enters_password_for_employee() {
        loginPage.password.sendKeys(DocuportConstants.PASSWORD_DOCUPORT);

    }

    @Then("user should see the home page for Employee")
    public void user_should_see_the_home_page_for_employee() {
        assertEquals(loginPage.title.getAttribute("alt"),"Docuport");
    }

    @When("user enters username for Advisor")
    public void user_enters_username_for_advisor() {
        BrowserUtils.waitForClickable(loginPage.login, DocuportConstants.LARGE);
        loginPage.username.sendKeys(DocuportConstants.USERNAME_ADVISOR);
    }
    @When("user enters password for Advisor")
    public void user_enters_password_for_advisor() {
        loginPage.password.sendKeys(DocuportConstants.PASSWORD_DOCUPORT);


    }
    @Then("user should see the home page for Advisor")
    public void user_should_see_the_home_page_for_advisor() {
        assertEquals(loginPage.title.getAttribute("alt"),"Docuport");

    }


    @When("user enters username for supervisor")
    public void user_enters_username_for_supervisor() {
        BrowserUtils.waitForClickable(loginPage.login, DocuportConstants.LARGE);
        loginPage.username.sendKeys(DocuportConstants.USERNAME_SUPERVISOR);

    }
    @When("user enters password for supervisor")
    public void user_enters_password_for_supervisor() {
        loginPage.password.sendKeys(DocuportConstants.PASSWORD_DOCUPORT);

    }
    @Then("user should see the home page for supervisor")
    public void user_should_see_the_home_page_for_supervisor() {
        assertEquals(loginPage.title.getAttribute("alt"),"Docuport");

    }
    @When("user enter credentials")
    public void user_enter_credentials(Map<String , String> credentials) {
        for (Map.Entry<String,String> entry: credentials.entrySet()){
            String key = entry.getKey();
            System.out.println("Key: "+key);
            String value = entry.getValue();
            System.out.println("Value: "+value);

        }
        loginPage.loginDocuport(credentials.get("username"),credentials.get("password"));

    }



}
