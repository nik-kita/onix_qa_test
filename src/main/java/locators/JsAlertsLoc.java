package locators;

import org.openqa.selenium.By;

public enum JsAlertsLoc implements Locator, GeneralLocators {
    JS_ALERTS_MAIN_TITLE(By.cssSelector("h3")),
    LABEL_UNDER_TITLE(By.cssSelector("h3+p")),
    BUTTON_ALERT(By.cssSelector("[onclick='jsAlert()']")),
    BUTTON_CONFIRM(By.cssSelector("[onclick='jsConfirm()']")),
    BUTTON_PROMPT(By.cssSelector("[onclick='jsPrompt()']")),
    RESULT_TITLE(By.cssSelector("h4")),
    RESULT_INDICATOR(By.cssSelector("#result"));

    private By path;

    JsAlertsLoc(By path) {
        this.path = path;
    }

    @Override
    public By getPath() {
        return path;
    }
}
