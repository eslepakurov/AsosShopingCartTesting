package com.asos.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class MainPage {

    private WebDriver driver;

    public MainPage(WebDriver driver) {
        this.driver = driver;
    }

    By myAccountLocator = By.id("myAccountDropdown");
    By signInPageLinkLocator = By.className("_1k1reGo");
    By menLocator = By.cssSelector("a[href='http://www.asos.com/men/']");
    By cartLocator = By.xpath("//div[@id='chrome-sticky-header']/div/div/ul[2]/li[3]/a/span[2]");

    public void openAccountDropdown() {
        Actions builder = new Actions(driver);
        WebElement hover = driver.findElement(myAccountLocator);
        builder.moveToElement(hover).build().perform();
    }

    public void openSignInPage() {
        driver.findElement(signInPageLinkLocator).click();
    }

    public void openMenSection() {
        driver.findElement(menLocator).click();
    }

    public void openCartPage() {
        driver.findElement(cartLocator).click();
    }

}
