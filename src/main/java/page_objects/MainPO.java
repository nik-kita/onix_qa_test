package page_objects;

import engine_layer.OnixWebDriver;
import locators.MainPageLoc;

public class MainPO extends BasePO {

    public MainPO(OnixWebDriver driver) {
        super(driver);
    }

    public JsAlertsPO goJsAlertsPage() {
        driver.findElement(MainPageLoc.MenuLink.JAVASCRIPT_ALERTS).click();
        return new JsAlertsPO(driver);
    }

    public FormAuthenticationPO goFormAuthenticationPage() {
        driver.findElement(MainPageLoc.MenuLink.FORM_AUTHENTICATION).click();
        return new FormAuthenticationPO(driver);
    }
}
