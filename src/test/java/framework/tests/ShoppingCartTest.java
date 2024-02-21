package framework.tests;

import framework.page.objects.*;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class ShoppingCartTest extends TestBase{

    @Test
    public void asNotLoggedInUserIShallNotProceedToCheckout(){
        LandingPage landingPage = new LandingPage(driver);
        landingPage.clickOnEnterStoreLink();

        LoginPage loginPage = new LoginPage(driver);
        loginPage.clickOnFishPage();

        FishPage fishPage = new FishPage(driver);
        fishPage.clickOnAngelfishId();

        AngelFishPage angelFishPage = new AngelFishPage(driver);
        angelFishPage.clickOnAddToCartSmallAngelFish();

        ShoppingCartPage shoppingCartPage = new ShoppingCartPage(driver);
        shoppingCartPage.clickProceedCheckoutButton();

        loginPage = new LoginPage(driver);
        String warningMessage = loginPage.getWarningMessage();
        assertEquals(warningMessage, "You must sign on before attempting to check out. Please sign on and try checking out again.");



    }
}
