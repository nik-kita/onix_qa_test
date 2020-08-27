package locators;

import org.openqa.selenium.By;

public enum FormAuthenticationLoc implements Locator, GeneralLocators {
    ;

    private By path;

    FormAuthenticationLoc(By path) {
        this.path = path;
    }
    @Override
    public By getPath() {
        return null;
    }
}
