package com.asos.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MenPage {

    private WebDriver driver;

    public MenPage(WebDriver driver) {

        this.driver = driver;
    }

    By clothingDropdownLocator = By.xpath("//div[@id='chrome-sticky-header']/div[2]/nav[2]/div/div/button[3]");
    By jeansLinkLocator = By.xpath("(//a[contains(text(),'Jeans')])[5]");

    public void openClothingDropdown() {
                driver.findElement(clothingDropdownLocator).click();
    }

    public void openJeansPage() {
        driver.findElement(jeansLinkLocator).click();
    }

}
