import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

public class Lab {
    WebDriver driver;
    @Test
    public void test() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://google.com");
    }

    @Test
    public void test2() {
        System.out.println("test");
    }

    @AfterClass
    public void driverKaput() {
        driver.quit();
    }
}
