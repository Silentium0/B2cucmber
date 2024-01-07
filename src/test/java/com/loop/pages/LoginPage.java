package com.loop.pages;

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

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement continueBunnton;

    @FindBy(xpath = "//img[@src='/img/logo.d7557277.svg']")
    public WebElement title;




    public LoginPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
}
