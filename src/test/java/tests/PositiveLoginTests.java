package tests;

import driver.manager.DriverUtils;
import objects.LoginPage;
import org.testng.annotations.Test;

import static navigation.ApplicationURLs.LOGIN_URL;
import static org.testng.AssertJUnit.assertTrue;

public class PositiveLoginTests extends TestBase{

    @Test
    public void asUserLoginUsingValidLoginAndPassword() {
        DriverUtils.navigateToPage(LOGIN_URL);

        LoginPage loginPage = new LoginPage();
        boolean isBannerAfterLoginDisplayed=loginPage
                .typeIntoUserNameField("j2ee")
                .typeIntoPasswordField("j2ee")
                .clickOnLoginButton()
                .isBannerAfterLoginDisplayed();

        assertTrue(isBannerAfterLoginDisplayed);
    }
}
