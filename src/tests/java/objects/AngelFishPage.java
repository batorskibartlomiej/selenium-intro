package objects;

import driver.manager.DriverManager;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import waits.WaitForElement;

public class AngelFishPage {

    private Logger logger= LogManager.getRootLogger();



    @FindBy(css= "a.Button[href$='EST-2']")
    private WebElement smallAngelfishAddToCartButton;



    public AngelFishPage(){

        PageFactory.initElements(DriverManager.getWebDriver(),this);

    }


    public ShoppingCartPage clickOnAddToCartSmallAngelFish(){

        WaitForElement.waitUntilElementIsVisible(smallAngelfishAddToCartButton);
        smallAngelfishAddToCartButton.click();
        return  new ShoppingCartPage();
    }




}
