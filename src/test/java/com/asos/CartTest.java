package com.asos;

import com.asos.Pages.*;
import org.testng.annotations.Test;

public class CartTest extends WebDriverSettings{

    @Test
    public void ProductInTheCartTest() throws InterruptedException {
        MainPage mainPage = new MainPage(driver);
        SignInPage signInPage = new SignInPage(driver);
        MenPage menPage = new MenPage(driver);
        PLPage plPage = new PLPage(driver);
        PDPage pdPage = new PDPage(driver);
        CartPage cartPage = new CartPage(driver);

        mainPage.openAccountDropdown();
        Thread.sleep(1000);
        mainPage.openSignInPage();
        signInPage.enterEmail(userEmail);
        signInPage.enterPassword(userPassword);
        signInPage.clickSubmitButton();
        mainPage.openMenSection();
        menPage.openClothingDropdown();
        menPage.openJeansPage();
        plPage.openPDPage();
        pdPage.openSizeDropdown();
        pdPage.addToBag();
        mainPage.openCartPage();
        cartPage.assertElement();
    }

}
