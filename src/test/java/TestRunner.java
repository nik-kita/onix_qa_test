import engine_layer.OnixWebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import page_objects.MainPO;

public class TestRunner {
    OnixWebDriver driver;

    @BeforeClass
    public void driverSetup() {
        driver = new OnixWebDriver();
    }

    @AfterClass
    public void driverQuit() {
        driver.quit();
    }

    protected MainPO mainPO() {
        driver.get("http://the-internet.herokuapp.com/");
        return new MainPO(driver);
    }
}
