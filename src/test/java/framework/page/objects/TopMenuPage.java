package framework.page.objects;

import framework.driver.manager.DriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TopMenuPage {

    @FindBy(css="#MenuContent a[href*='signonForm']")
    WebElement signOnLink;




    public TopMenuPage(){


        PageFactory.initElements(DriverManager.getWebDriver(), this);
    }

    public void clickOnSignInLink(){
        signOnLink .click();
    }
}
