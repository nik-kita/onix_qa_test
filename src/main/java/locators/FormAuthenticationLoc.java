package locators;

import org.openqa.selenium.By;
import page_objects.BasePO;

public enum FormAuthenticationLoc implements Locator, GeneralLocators {
    TITLE_LOGIN_PAGE(By.cssSelector("h2")),
    DESCRIPTION_UNDER_TITLE(By.cssSelector("h4")),
    USERNAME_INPUT(By.cssSelector("#username")),
    PASSWORD_INPUT(By.cssSelector("#password")),
    LOGIN_BUTTON(By.cssSelector("button"))
    ;

    private By path;

    FormAuthenticationLoc(By path) {
        this.path = path;
    }
    @Override
    public By getPath() {
        return path;
    }
}
