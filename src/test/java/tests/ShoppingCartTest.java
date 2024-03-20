package tests;

import objects.*;
import objects.LandingPage;
import objects.LoginPage;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class ShoppingCartTest extends TestBase{

    @Test
    public void asNotLoggedInUserIShallNotProceedToCheckout(){
        LandingPage landingPage = new LandingPage();
        landingPage.clickOnEnterStoreLink();

        LoginPage loginPage = new LoginPage();
        loginPage.clickOnFishPage()
                .clickOnAngelfishId()
                .clickOnAddToCartSmallAngelFish()
                .clickProceedCheckoutButton();


        String warningMessage = loginPage.getWarningMessage();
        assertEquals(warningMessage, "You must sign on before attempting to check out. Please sign on and try checking out again.");



    }
}
