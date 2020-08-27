import locators.BaseLoc;
import locators.FormAuthenticationLoc;
import locators.Locator;
import org.junit.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import page_objects.BasePO;

public class FormAuthenticationTests extends TestRunner {

    @BeforeClass
    public void goFormAuthenticationPage() {
        mainPO().goFormAuthenticationPage();
    }

    @Test(dataProvider = "getFormAuthenticationLocators")
    public void formAuthenticationSmoke(Locator locator) {
        Assert.assertTrue(driver.findElements(locator).size() == 1);
    }

    @DataProvider
    public Object[] getFormAuthenticationLocators() {
        return Locator.getAllLocators(
                FormAuthenticationLoc.values(),
                BaseLoc.values()
        );
    }
}
