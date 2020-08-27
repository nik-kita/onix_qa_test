package engine_layer;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.List;

public class OnixWebDriver {
    private WebDriver driver;

    public OnixWebDriver() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }

    public void get(String url) {
        driver.get(url);
    }

    public void quit() {
        driver.quit();
    }

    public List<OnixWebElement> findElements(By path) {
        List<OnixWebElement> onixElements = new ArrayList<>();
        for(WebElement e : driver.findElements(path)) {
            onixElements.add(new OnixWebElement(e));
        }
        return onixElements;
    }
}
