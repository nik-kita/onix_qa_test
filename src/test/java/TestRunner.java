import engine_layer.OnixWebDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class TestRunner {
    OnixWebDriver onixWebDriver;

    @BeforeClass
    public void driverSetup() {
        onixWebDriver = new OnixWebDriver();
    }

    @AfterClass
    public void driverQuit() {
        onixWebDriver.quit();
    }
}
