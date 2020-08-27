import locators.BaseLoc;
import locators.Locator;
import locators.MainPageLoc;
import org.junit.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import page_objects.BasePO;

public class MainPageTests extends TestRunner {

    @Test(dataProvider = "getMainPageLocators")
    public void mainPageSmoke(Locator locator) {
        mainPO();
        Assert.assertTrue(driver.findElements(locator).size() == 1);
    }

    @DataProvider
    public Object[] getMainPageLocators() {

        return Locator.getAllLocators(
                        MainPageLoc.MenuLink.values(),
                        MainPageLoc.values(),
                        BaseLoc.values()
                );
    }
}
