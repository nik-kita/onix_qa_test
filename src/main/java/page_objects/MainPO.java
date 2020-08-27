package page_objects;

import engine_layer.OnixWebDriver;
import locators.MainPageLoc;

public class MainPO extends BasePO {

    public MainPO(OnixWebDriver driver) {
        super(driver);
    }

    public JavaScriptAlertsPO goJavaScriptAlertsPage() {
        driver.findElement(MainPageLoc.MenuLink.JAVASCRIPT_ALERTS).click();
        return new JavaScriptAlertsPO(driver);
    }
}
