package framework.page.objects;

import framework.driver.manager.DriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FooterPage {



    @FindBy(xpath= "//*[@id='Banner']/img")
    WebElement bannerAfterLoginLogo;

    public FooterPage(){

        PageFactory.initElements(DriverManager.getWebDriver(), this);

    }

    public boolean isBannerAfterLoginDisplayed(){
        boolean isDisplayed= bannerAfterLoginLogo.isDisplayed();
        return isDisplayed;
    }
}
