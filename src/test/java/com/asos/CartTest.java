package com.asos;

import com.asos.Pages.SignInPage;
import org.testng.annotations.Test;
import com.asos.Pages.MainPage;

public class CartTest extends WebDriverSettings{

    @Test
    public void ProductInTheCartTest() throws InterruptedException {
        MainPage mainPage = new MainPage(driver);
        mainPage.openAccountDropdown();
        Thread.sleep(3000);
        mainPage.openSignInPage();
        SignInPage signInPage = new SignInPage(driver);
        signInPage.enterEmail("testmailbox2000@mail.ru");
        signInPage.enterPassword("Le$Pau10");
        signInPage.clickSubmitButton();







    }
}
