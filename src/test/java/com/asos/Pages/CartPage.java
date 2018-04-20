package com.asos.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class CartPage {

    private WebDriver driver;

    public CartPage(WebDriver driver) {
        this.driver = driver;
    }

    By verifyElementLocator = By.cssSelector("p[class='bag-expiry-warning bag-expiry-warning--desktop']");

    public void assertElement() {
        WebElement source = driver.findElement(verifyElementLocator);
        Assert.assertEquals(source.getText(), "Items are reserved for 60 minutes");
    }

}


