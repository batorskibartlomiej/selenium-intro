package framework.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class TestBase {

    public WebDriver driver;


    @BeforeMethod
    public void Test(){
        System.setProperty("chromedriver", "C:/drivers/chromedriver.exe");
        driver= new ChromeDriver();
        driver.navigate().to("https://przyklady.javastart.pl/jpetstore/");
    }

    @AfterMethod
    public void afterTest() {

        //Zamknięcie okna przeglądarki
        driver.close();

        //Zabicie procesu WebDrivera
        driver.quit();
    }
}
