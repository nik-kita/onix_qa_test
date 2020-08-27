package page_objects;

import engine_layer.OnixWebDriver;

public class BasePO {
    private OnixWebDriver driver;
    private String baseUrl = "http://the-internet.herokuapp.com/";

    public BasePO(OnixWebDriver driver) {
        this.driver = driver;
    }

    public MainPO goMainPage() {
        return new MainPO(driver);
    }
}
