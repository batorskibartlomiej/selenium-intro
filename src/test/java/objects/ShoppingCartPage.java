package objects;

import driver.manager.DriverManager;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import waits.WaitForElement;

public class ShoppingCartPage {

    private Logger logger= LogManager.getRootLogger();


    //@FindBy(xpath= "//*[@id='Cart']/a")
    @FindBy(css="a.Button[href$='newOrderForm=']")
    private WebElement proceedToCheckoutButton;


    public ShoppingCartPage(){

        PageFactory.initElements(DriverManager.getWebDriver(), this);
    }


    public CheckoutPage clickProceedCheckoutButton(){
        WaitForElement.waitUntilElementIsVisible(proceedToCheckoutButton);
        proceedToCheckoutButton.click();
        logger.info("Clicked on Proceed to checkout Button");
        return new CheckoutPage();
    }





}
