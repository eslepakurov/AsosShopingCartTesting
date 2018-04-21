package com.asos.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class PDPage {

    private WebDriver driver;

    public PDPage(WebDriver driver) {
        this.driver = driver;
    }

    By sizeDropdownLocator = By.xpath("//div[@id='product-size']/section/div/div/div[2]/select");
    By addToBagButtonLocator = By.className("add-button");


    public void openSizeDropdown() {
        driver.findElement(sizeDropdownLocator).click();
        Select selectSize = new Select(driver.findElement(sizeDropdownLocator));
        selectSize.selectByVisibleText("W30in L32in");
    }

    public void addToBag() {
        driver.findElement(addToBagButtonLocator).click();
    }

}

