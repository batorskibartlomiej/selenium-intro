package framework.driver.manager;

import framework.driver.BrowserFactory;
import framework.driver.BrowserType;
import org.openqa.selenium.WebDriver;

import static framework.driver.BrowserType.*;

public class DriverManager {

    private static final BrowserType BROWSER_TYPE = CHROME;
    private static WebDriver driver;

    private DriverManager(){

    }

    public static WebDriver getWebDriver(){

        if(driver == null){
            driver= BrowserFactory.getBrowser(CHROME);
        }
        return driver;
    }


    public static void disposeDriver(){
        driver.close();
        if (!BROWSER_TYPE.equals(BrowserType.FIREFOX)){
            driver.quit();
        }
        driver= null;
    }
}
