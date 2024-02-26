package framework.page.objects;

import framework.driver.manager.DriverManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import waits.WaitForElement;

public class FooterPage {



    @FindBy(xpath= "//*[@id='Banner']/img")
    WebElement bannerAfterLoginLogo;

    public FooterPage(){

        PageFactory.initElements(DriverManager.getWebDriver(), this);

    }

    public boolean isBannerAfterLoginDisplayed(){
        WaitForElement.waitUntilElementIsVisible(bannerAfterLoginLogo);
        boolean isDisplayed= bannerAfterLoginLogo.isDisplayed();
        return isDisplayed;
    }
}
