package framework.page.objects;

import framework.driver.manager.DriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FishPage {



    @FindBy(css= "tr:nth-child(2) a")
    private WebElement angelfishIdlink;





    public FishPage(){

        PageFactory.initElements(DriverManager.getWebDriver(), this);
    }

    public void clickOnAngelfishId(){
        angelfishIdlink.click();
    }


}
