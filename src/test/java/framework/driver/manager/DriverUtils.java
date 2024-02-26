package framework.driver.manager;

import framework.driver.manager.DriverManager;

public class DriverUtils {

    public static void setInitialConfiguration(){
        DriverManager.getWebDriver().manage().window().maximize();

    }
    public static void navigateToPage(String pageUrl) {
        DriverManager.getWebDriver().navigate().to(pageUrl);
    }

}
