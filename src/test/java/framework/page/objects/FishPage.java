package framework.page.objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FishPage {

    private WebDriver driver;

    @FindBy(css= "tr:nth-child(2) a")
    private WebElement angelfishIdlink;





    public FishPage(WebDriver driver){
        this.driver= driver;
        PageFactory.initElements(driver, this);
    }

    public void clickOnAngelfishId(){
        angelfishIdlink.click();
    }


}
