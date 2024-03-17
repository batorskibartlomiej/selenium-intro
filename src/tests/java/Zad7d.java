import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Zad7d {

    private WebDriver driver;

    @BeforeTest
    public void beforeTest(){
        System.setProperty("chromedriver", "C:/drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.navigate().to("https://theinternet.przyklady.javastart.pl/hovers");
    }


    @Test
    public void hoverTest(){
        Actions actions = new Actions(driver);

        WebElement picture1= driver.findElement(By.xpath("//div/div[1]/img"));
        WebElement picture2= driver.findElement(By.xpath("//div/div[2]/img"));
        WebElement picture3= driver.findElement(By.xpath("//div/div[3]/img"));
        actions.moveToElement(picture1).perform();

        Assert.assertEquals(picture1.getText(), "name: user1");
        Assert.assertEquals(picture2.getText(), "");
        Assert.assertEquals(picture3.getText(), "");


    }
}
