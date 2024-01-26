package com.loop.step_definitions;

import com.loop.pages.ProductPage;
import com.loop.utilitues.ConfigurationReader;
import com.loop.utilitues.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;

import java.util.List;
import java.util.Map;

public class ProductStepDefs {

    ProductPage productPage = new ProductPage();

    @Given("User is on the HomePage")
    public void user_is_on_the_home_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("product.url"));

    }
    @Then("User should be able to see expected prices in following products")
    public void user_should_be_able_to_see_expected_prices_in_following_products(List<Map<String, String>> productDetails) {
        for (Map<String,String> productDetail : productDetails){
            productPage.clickCategory(productDetail.get("Category"));
            String actual = productPage.getProductPrice(productDetail.get("Product"));
            String expectedPrice = productDetail.get("expectedPrice");
            Assert.assertEquals(expectedPrice,actual);
        }
    }

    @Then("User should be able to see expected prices in following products with listOflist")
    public void user_should_be_able_to_see_expected_prices_in_following_products_with_list_oflist(List<List<String>> productDetails) {
        for (List<String> productDetail : productDetails){
            productPage.clickCategory(productDetail.get(0));
            String actualPrice = productPage.getProductPrice(productDetail.get(1)); // name of product by index  (Samsung galaxy s6)
            String expectedPrice = productDetail.get(2);
            Assert.assertEquals(expectedPrice,actualPrice);
        }
    }

    @Then("User should be able to see the following names in their groups")
    public void user_should_be_able_to_see_the_following_names_in_their_groups(Map<String,List<String>> student) {
        List<String> group1 = student.get("Group1");
        System.out.println(group1);
        List<String> group2 = student.get("Group2");
        System.out.println(group2);
        List<String> group3 = student.get("Group3");
        System.out.println(group3);

    }



}
