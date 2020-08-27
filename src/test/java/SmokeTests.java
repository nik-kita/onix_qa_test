import locators.Locator;
import locators.MainPageLoc;
import org.junit.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SmokeTests extends TestRunner {

    @Test(dataProvider = "getMainPageLocators")
    public void mainPageSmoke(Locator locator) {
        onixWebDriver.get("http://the-internet.herokuapp.com/");
        Assert.assertTrue(onixWebDriver.findElements(locator.getPath()).size() == 1);
    }

    @DataProvider
    public Object[] getMainPageLocators() {
        int mainPageLocLen = MainPageLoc.values().length;
        int menuLinksLocLen = MainPageLoc.MenuLinkLoc.values().length;
        Locator[] locators = new Locator[mainPageLocLen + menuLinksLocLen];
        int j = 0;
        for(int i = 0; i < mainPageLocLen; i++, j++) {
            locators[j] = MainPageLoc.values()[i];
        }
        for(int i = 0; i < menuLinksLocLen; i++, j++) {
            locators[j] = MainPageLoc.MenuLinkLoc.values()[i];
        }
        return locators;
    }
}
