import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Zad7a {

    private WebDriver driver;
    @BeforeTest
    public void beforeTest(){
        System.setProperty("webdriver.chrome.driver", "C:/drivers/chromedriver.exe");
        driver= new ChromeDriver();
    }

    @Test
    public void  checkboxesTest(){
        driver.navigate().to("https://theinternet.przyklady.javastart.pl/checkboxes");
        WebElement checkbox1= driver.findElement(By.xpath("//*[@id='checkboxes']/input[1]"));
        WebElement checkbox2= driver.findElement(By.xpath("//*[@id='checkboxes']/input[2]"));
        Assert.assertFalse(checkbox1.isSelected());
        Assert.assertTrue(checkbox2.isSelected());

        checkbox1.click();
        checkbox2.click();
        Assert.assertTrue(checkbox1.isSelected());
        Assert.assertFalse(checkbox2.isSelected());


    }




    @AfterTest
    public void afterTest(){
        driver.close();
        driver.quit();
    }
}
