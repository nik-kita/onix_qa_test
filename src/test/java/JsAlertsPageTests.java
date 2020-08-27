import locators.BaseLoc;
import locators.JsAlertsLoc;
import locators.Locator;
import org.junit.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class JsAlertsPageTests extends TestRunner {

    @BeforeClass
    public void goToJsAlertsPage() {
        mainPO().goJsAlertsPage();
    }
    @Test(dataProvider = "getJsAlertsPageLocators")
    public void jsAlertsSmoke(Locator locator) {
        Assert.assertTrue(driver.findElements(locator).size() == 1);
    }

    @DataProvider
    public Object[] getJsAlertsPageLocators() {
        return Locator.getAllLocators(
                JsAlertsLoc.values(),
                BaseLoc.values()
        );
    }
}
