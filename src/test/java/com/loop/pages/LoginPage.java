package com.loop.pages;

import com.loop.utilitues.BrowserUtils;
import com.loop.utilitues.DocuportConstants;
import com.loop.utilitues.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    @FindBy(xpath = "//input[@id='input-14']")
    public WebElement username;

    @FindBy(xpath = "//input[@id='input-15']")
    public WebElement password;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement login;

    @FindBy(xpath = "//button[@type='submit']/span")
    public WebElement continueBunnton;

    @FindBy(xpath = "//img[@src='/img/logo.d7557277.svg']")
    public WebElement title;

    public void loginDocuport(String username1, String password1){
        BrowserUtils.waitForVisibility(username, DocuportConstants.SMALL);
        username.clear();
        username.sendKeys(username1);
        password.clear();
        password.sendKeys(password1);
        BrowserUtils.justWait(DocuportConstants.SMALL);
        if (continueBunnton.isDisplayed()){
            continueBunnton.click();
        }
    }






    public LoginPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
}
