package framework.page.objects;

import framework.driver.manager.DriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

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

    public void typeIntoUserNameField(String username){
        usernameField.clear();
        usernameField.sendKeys(username);
    }

    public void typeIntoPasswordField(String password){
        passwordField.clear();
        passwordField.sendKeys(password);
    }

    public void clickOnLoginButton(){
        signOnButton.click();
    }

    public String getWarningMessage(){
        String warningText = messageLabel.getText();
        return warningText;
    }

    public void clickOnFishPage(){
        fishPage.click();
    }

}
