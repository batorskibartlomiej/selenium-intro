package framework.page.objects;

import framework.driver.manager.DriverManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AngelFishPage {





    @FindBy(css= "a.Button[href$='EST-2']")
    private WebElement smallAngelfishAddToCartButton;



    public AngelFishPage(){

        PageFactory.initElements(DriverManager.getWebDriver(),this);

    }


    public void clickOnAddToCartSmallAngelFish(){
        smallAngelfishAddToCartButton.click();
    }




}
