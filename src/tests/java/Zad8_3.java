import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.concurrent.Flow;

import static org.testng.Assert.assertTrue;

public class Zad8_3 {

    public WebDriver driver;

    @BeforeMethod
    public void beforeTest(){
        System.setProperty("webdriver.chrome.driver", "C:/drivers/chromedriver.exe");
        driver= new ChromeDriver();
        driver.navigate().to("https://theinternet.przyklady.javastart.pl/dynamic_loading/1");
    }


    @Test
    public void fluentWaitTest(){

        WebElement heloTxt = driver.findElement(By.id("finish"));
        Assert.assertFalse(heloTxt.isDisplayed());

        WebElement startButton = driver.findElement(By.xpath("//*[@id='start']/button"));
        startButton.click();

        FluentWait<WebDriver> fluentWait= new FluentWait<>(driver);
        fluentWait
                .pollingEvery(Duration.ofMillis(250))
                .withTimeout(Duration.ofSeconds(5))
                .until(ExpectedConditions.visibilityOf(heloTxt));

        assertTrue(heloTxt.isDisplayed());
    }

    @AfterMethod
    public void afterTest() {
        driver.close();
        driver.quit();
    }


}
