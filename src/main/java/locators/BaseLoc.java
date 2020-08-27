package locators;

import org.openqa.selenium.By;

public enum BaseLoc implements Locator {
    FORK_ME_ON_GITHUB_LABEL(By.cssSelector("[alt='Fork me on GitHub']")),
    BOTTOM_ELEMNTALSELENIUM_LINK(By.cssSelector("[href='http://elementalselenium.com/']")),
    ;

    private By path;

    BaseLoc(By path) {
        this.path = path;
    }

    @Override
    public By getPath() {
        return path;
    }
}
