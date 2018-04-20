package com.asos;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

public class WebDriverSettings{

    public WebDriver driver;
    protected String userEmail = "testmailbox2000@mail.ru";
    protected String userPassword = "Le$Pau10";

    @BeforeTest
    public void setupTest() {
        System.setProperty("webdriver.chrome.driver", "C://QA/Automation/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.asos.com");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.manage().timeouts().setScriptTimeout(30, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
    }

    @AfterTest
    public void teardown() {
        driver.quit();
    }

}
