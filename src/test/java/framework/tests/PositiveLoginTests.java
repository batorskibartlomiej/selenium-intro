package framework.tests;

import framework.driver.manager.DriverUtils;
import framework.page.objects.FooterPage;
import framework.page.objects.LandingPage;
import framework.page.objects.LoginPage;
import framework.page.objects.TopMenuPage;
import org.testng.Assert;
import org.testng.annotations.Test;

import static framework.navigation.ApplicationURLs.LOGIN_URL;
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
