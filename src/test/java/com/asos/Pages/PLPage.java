package com.asos.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PLPage {

    private WebDriver driver;

    public PLPage(WebDriver driver) {
        this.driver = driver;
    }

    By productLocator = By.id("product-9415180");

    public void openPDPage() {
        driver.findElement(productLocator).click();
    }

}
