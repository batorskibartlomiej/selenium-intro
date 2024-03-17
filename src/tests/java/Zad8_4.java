import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class Zad8_4 {

    public WebDriver driver;

    @BeforeMethod
    public void beforeTest(){
        System.setProperty("webdriver.chrome.driver", "C:/drivers/chromedriver.exe");
        driver= new ChromeDriver();
        driver.navigate().to("https://theinternet.przyklady.javastart.pl/dynamic_loading/2");
    }


    @Test
    public void test(){
        WebElement buttonStart= driver.findElement(By.xpath("//*[@id='start']/button"));
        buttonStart.click();



        FluentWait<WebDriver> fluentWait = new FluentWait<>(driver);
        WebElement heloTxt = fluentWait
                .pollingEvery(Duration.ofMillis(250))
                .withTimeout(Duration.ofSeconds(5))
                .ignoring(NoSuchElementException.class)
                .until(ExpectedConditions.visibilityOfElementLocated(By.id("finish")));

    }

    @AfterMethod
    public void afterTest() {
        driver.close();
        driver.quit();
    }
}
