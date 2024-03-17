import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;

public class FirstTest {

    private WebDriver driver;

    @BeforeTest
    public void beforeTest(){
        System.setProperty("webdriver.chrome.driver", "C:/drivers/chromedriver.exe");
        driver= new ChromeDriver();


    }

    @Test
    public void myTest(){

        driver.navigate().to("https://selenium.dev/");
        String pageTitle= driver.getTitle();
        Assert.assertEquals(pageTitle, "Selenium");

    }


    @AfterTest
    public void close(){
        driver.close();
        driver.quit();
    }
}
