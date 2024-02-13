package framework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FailedLoginTests {

    public WebDriver driver;


    @BeforeMethod
    public void Test(){
        System.setProperty("chromedriver", "C:/drivers/chromedriver.exe");
        driver= new ChromeDriver();
        driver.navigate().to("https://przyklady.javastart.pl/jpetstore/");
    }

    @Test
    public void asUserTryToLogInWithIncorrectLoginAndPassword(){
        LandingPage landingPage = new LandingPage(driver);
        landingPage.clickOnEnterStoreLink();

        TopMenuPage topMenuPage = new TopMenuPage(driver);
        topMenuPage.clickOnSignInLink();

        LoginPage loginPage = new LoginPage(driver);
        loginPage.typeIntoUserNameField("NotExistingLogin");
        loginPage.typeIntoPasswordField("NotProperPassword");
        loginPage.clickOnLoginButton();
        String warningMessage = loginPage.getWarningMessage();

        Assert.assertEquals(warningMessage, "Invalid username or password. Signon failed.");
    }

    @AfterMethod
    public void afterTest() {

        //Zamknięcie okna przeglądarki
        driver.close();

        //Zabicie procesu WebDrivera
        driver.quit();
    }



}
