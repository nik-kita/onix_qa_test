package locators;

import org.openqa.selenium.By;

public interface Locator {
    By getPath();

    static Locator[] getAllLocators(Locator[]...allLocators) {
        int allLen = 0;
        for(Locator[] l : allLocators) {
            allLen += l.length;
        }
        Locator[] result = new Locator[allLen];
        int i = 0;
        for(Locator[] l : allLocators) {
            for(Locator one : l) {
                result[i++] = one;
            }
        }
        return result;
    }
}
