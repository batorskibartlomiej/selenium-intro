package framework.page.objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShoppingCartPage {

    private WebDriver driver;


    //@FindBy(xpath= "//*[@id='Cart']/a")
    @FindBy(css="a.Button[href$='newOrderForm=']")
    private WebElement proceedToCheckoutButton;


    public ShoppingCartPage(WebDriver driver){
        this.driver= driver;
        PageFactory.initElements(driver, this);
    }


    public void clickProceedCheckoutButton(){
        proceedToCheckoutButton.click();
    }





}
