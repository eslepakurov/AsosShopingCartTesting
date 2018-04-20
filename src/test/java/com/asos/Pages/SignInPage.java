package com.asos.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SignInPage {

    private WebDriver driver;

    public SignInPage (WebDriver driver) {
        this.driver = driver;
    }

    By emailInputLocator = By.name("Username");
    By passwordInputLocator = By.name("Password");
    By submitButtonLocator = By.id("signin");

    public void enterEmail(String email) {
        WebElement emailInput = driver.findElement(emailInputLocator);
                emailInput.click();
                emailInput.sendKeys(email);
    }

    public void enterPassword(String password) {
        WebElement passwordInput = driver.findElement(passwordInputLocator);
            passwordInput.click();
            passwordInput.sendKeys(password);
    }

    public void clickSubmitButton() {
        driver.findElement(submitButtonLocator).submit();
    }

}
