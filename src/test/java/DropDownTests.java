import locators.BaseLoc;
import locators.DropDownLoc;
import locators.Locator;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DropDownTests extends TestRunner {

    @BeforeClass
    public void goDropDownPage() {
        mainPO().goDropDownPage();
    }

    @Test(dataProvider = "getDropDownLocators")
    public void dropDownSmoke(Locator locator) {
        Assert.assertTrue(driver.findElements(locator).size() == 1);
    }

    @DataProvider
    public Object[] getDropDownLocators() {
        return Locator.getAllLocators(
                DropDownLoc.values(),
                BaseLoc.values()
        );
    }
}
