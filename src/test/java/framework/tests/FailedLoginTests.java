package framework.tests;

import framework.driver.manager.DriverUtils;
import framework.page.objects.FooterPage;
import framework.page.objects.LandingPage;
import framework.page.objects.LoginPage;
import framework.page.objects.TopMenuPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static framework.navigation.ApplicationURLs.LOGIN_URL;
import static org.testng.AssertJUnit.assertTrue;

public class FailedLoginTests extends TestBase{



    @Test
    public void asUserTryToLogInWithIncorrectLoginAndPassword(){

        DriverUtils.navigateToPage(LOGIN_URL);

        LoginPage loginPage = new LoginPage();
        loginPage
                .typeIntoUserNameField("NotExistingLogin")
                .typeIntoPasswordField("NotProperPassword")
                .clickOnLoginButton();

        String warningMessage = loginPage.getWarningMessage();

        Assert.assertEquals(warningMessage, "Invalid username or password. Signon failed.");
    }









}
