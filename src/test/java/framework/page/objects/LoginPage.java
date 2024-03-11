package framework.page.objects;

import framework.driver.manager.DriverManager;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import waits.WaitForElement;

public class LoginPage {

    private Logger logger= LogManager.getRootLogger();



    @FindBy(name="username")//page factory
    WebElement usernameField;

    @FindBy(name="password")
    WebElement passwordField;

    @FindBy(name="signon")
    WebElement signOnButton;

    @FindBy(css="#Content ul[class='messages'] li")
    WebElement messageLabel;

    @FindBy(xpath="//*[@id='SidebarContent']/a[1]/img")
    private WebElement fishPage;





    public LoginPage() {

        PageFactory.initElements(DriverManager.getWebDriver(),this);
    }

    public LoginPage typeIntoUserNameField(String username){
        WaitForElement.waitUntilElementIsVisible(usernameField);
        usernameField.clear();
        usernameField.sendKeys(username);
        logger.info("Typed into User Name Field {}", username);
        return this;
    }

    public LoginPage typeIntoPasswordField(String password){
        passwordField.clear();
        passwordField.sendKeys(password);
        logger.info("Typed into Password Field {}", password);
        return this;
    }

    public FooterPage clickOnLoginButton(){

        signOnButton.click();
        logger.info("Clicked on Login Button");
        return new FooterPage();

    }

    public String getWarningMessage(){
        WaitForElement.waitUntilElementIsVisible(messageLabel);
        String warningText = messageLabel.getText();
        logger.info("Returned warning message was: {}", warningText);
        return warningText;
    }

    public FishPage clickOnFishPage(){
        WaitForElement.waitUntilElementIsVisible(fishPage);
        fishPage.click();
        logger.info("Clicked on fish image");
        return new FishPage();
    }

}
