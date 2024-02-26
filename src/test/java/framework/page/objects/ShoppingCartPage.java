package framework.page.objects;

import framework.driver.manager.DriverManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShoppingCartPage {




    //@FindBy(xpath= "//*[@id='Cart']/a")
    @FindBy(css="a.Button[href$='newOrderForm=']")
    private WebElement proceedToCheckoutButton;


    public ShoppingCartPage(){

        PageFactory.initElements(DriverManager.getWebDriver(), this);
    }


    public void clickProceedCheckoutButton(){
        proceedToCheckoutButton.click();
    }





}
