import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Zad7c {

    private WebDriver driver;


    @BeforeTest
    public  void beforeTest(){
        System.setProperty("chromedriver","C:/drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.navigate().to("https://theinternet.przyklady.javastart.pl/upload");
    }

    @Test
    public void fileUploadTest(){
        WebElement upload = driver.findElement(By.id("file-upload"));
        upload.sendKeys("C:/text.txt");

        WebElement uploadButton = driver.findElement(By.id("file-submit"));
        uploadButton.click();

        WebElement uploadedFiles = driver.findElement(By.id("uploaded-files"));

        Assert.assertEquals(uploadedFiles.getText(), "text.txt");




    }
}
