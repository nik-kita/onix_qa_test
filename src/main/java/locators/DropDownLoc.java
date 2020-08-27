package locators;

import org.openqa.selenium.By;

public enum DropDownLoc implements Locator, GeneralLocators {
    TITLE_DROPDOWN_LIST(By.cssSelector("h3")),
    DROPDOWN(By.cssSelector("#dropdown")),
    DROPDOWN_DEFAULT_OPTION(By.cssSelector("option[value='']")),
    DROPDOWN_1_OPTION(By.cssSelector("option[value='1']")),
    DROPDOWN_2_OPTION(By.cssSelector("option[value='2']"));

    private By path;

    DropDownLoc(By path) {
        this.path = path;
    }

    @Override
    public By getPath() {
        return path;
    }
}
