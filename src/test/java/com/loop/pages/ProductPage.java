package com.loop.pages;

import com.loop.utilitues.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductPage {

     public void clickCategory(String category){
         Driver.getDriver().findElement(By.xpath("//a[contains(.,'"+category+"')]")).click();
     }

     public String getProductPrice(String product){
         String actualPrice = Driver.getDriver().findElement(By.xpath("//a[normalize-space(.)='"+product+"']/../../h5")).getText();
         return actualPrice.substring(1);
     }

    public ProductPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }
}
