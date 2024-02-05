import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.sql.Driver;

public class Zad7b {

    private WebDriver driver;

    @BeforeTest
    public void beforeTest(){
        System.setProperty("webdriver.chrome.driver", "C:/drivers/chromedriver.exe");
        driver= new ChromeDriver();


    }


    @Test
    public void dropDownTest(){
        driver.navigate().to("https://theinternet.przyklady.javastart.pl/dropdown");
        WebElement dropDown= driver.findElement(By.id("dropdown"));
        Select select = new Select(dropDown);

        String selectedText= select.getFirstSelectedOption().getText();
        Assert.assertEquals(selectedText, "Please select an option");

        select.selectByValue("1");
        String selectedOption = select.getFirstSelectedOption().getText();
        Assert.assertEquals(selectedOption, "Option 1");


        select.selectByValue("2");
        selectedOption = select.getFirstSelectedOption().getText();
        Assert.assertEquals(selectedOption, "Option 2");







    }


    @AfterTest
    public void afterTest() {
        driver.close();
        driver.quit();
    }
}
