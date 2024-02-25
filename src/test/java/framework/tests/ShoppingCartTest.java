package framework.tests;

import framework.page.objects.*;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class ShoppingCartTest extends TestBase{

    @Test
    public void asNotLoggedInUserIShallNotProceedToCheckout(){
        LandingPage landingPage = new LandingPage();
        landingPage.clickOnEnterStoreLink();

        LoginPage loginPage = new LoginPage();
        loginPage.clickOnFishPage();

        FishPage fishPage = new FishPage();
        fishPage.clickOnAngelfishId();

        AngelFishPage angelFishPage = new AngelFishPage();
        angelFishPage.clickOnAddToCartSmallAngelFish();

        ShoppingCartPage shoppingCartPage = new ShoppingCartPage();
        shoppingCartPage.clickProceedCheckoutButton();

        loginPage = new LoginPage();
        String warningMessage = loginPage.getWarningMessage();
        assertEquals(warningMessage, "You must sign on before attempting to check out. Please sign on and try checking out again.");



    }
}
