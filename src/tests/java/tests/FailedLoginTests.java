package tests;

import driver.manager.DriverUtils;
import objects.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

import static navigation.ApplicationURLs.LOGIN_URL;
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
