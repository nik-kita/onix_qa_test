package page_objects;

import engine_layer.OnixWebDriver;
import locators.MainPageLoc;

public class BasePO {
    protected OnixWebDriver driver;
    private String baseUrl = "http://the-internet.herokuapp.com/";

    public BasePO(OnixWebDriver driver) {
        this.driver = driver;
    }

    public MainPO goMainPage() {
        driver.get(baseUrl);
        return new MainPO(driver);
    }


}
