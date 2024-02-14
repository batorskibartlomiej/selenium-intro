package framework.page.objects;

import org.openqa.selenium.By;
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



    private WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver= driver;
        PageFactory.initElements(driver,this);
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

}
