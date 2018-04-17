package com.asos.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SignInPage {

    private WebDriver driver;

    public SignInPage (WebDriver driver) {
        this.driver = driver;
    }

    By emailInputLocator = By.name("Username");
    By passwordInputLocator = By.name("Password");
    By submitButtonLocator = By.id("signin");

    public void enterEmail(String email) {
        driver.findElement(emailInputLocator).sendKeys(email);
    }

    public void enterPassword(String password) {
        driver.findElement(passwordInputLocator).sendKeys(password);
    }

    public void clickSubmitButton() {
        driver.findElement(submitButtonLocator).submit();
    }

}
