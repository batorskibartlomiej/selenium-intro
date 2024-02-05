import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;

public class Zad8_1 {

    private WebDriver driver;

    @BeforeTest
    public void beforeTest(){
        System.setProperty("webdriver.chrome.driver", "C:/drivers/chromedriver.exe");
        driver= new ChromeDriver();
        driver.navigate().to("https://theinternet.przyklady.javastart.pl/dynamic_controls");
    }


    @Test
    public void ExplicitWaitTests(){

        WebElement checkbox = driver.findElement(By.id("checkbox"));
        Assert.assertFalse(checkbox.isSelected());
        Assert.assertTrue(checkbox.isDisplayed());

        WebElement removeButton = driver.findElement(By.xpath("//*[@id='checkbox-example']/button"));
        removeButton.click();

        WebDriverWait webDriverWait= new WebDriverWait(driver, Duration.ofSeconds(15));
        webDriverWait.until(ExpectedConditions.invisibilityOf(checkbox));
        WebElement message= driver.findElement(By.id("message"));
        Assert.assertEquals(message.getText(), "It's gone!");

        WebElement addButton = driver.findElement(By.xpath("//*[@id='checkbox-example']/button"));
        addButton.click();

        WaitUntil waitUntil = new WaitUntil(driver);
        checkbox = waitUntil.waitUntilPresenceOfElementLocated(By.id("checkbox"));
        Assert.assertFalse(checkbox.isSelected());
        Assert.assertTrue(checkbox.isDisplayed());

    }


    @AfterTest
    public void close(){
        driver.close();
        driver.quit();
    }

}
