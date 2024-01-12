package com.loop.pages;

import com.loop.utilitues.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GoogleSearchPage {



    @FindBy(name = "q")
    public WebElement serchBox;

    @FindBy(xpath="//input[@id='gbqfbb']/preceding-sibling::input")
    public WebElement searchButton;

    public GoogleSearchPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }
}
