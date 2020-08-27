package locators;

public interface GeneralLocators {
    default Locator getGeneralLocator(BaseLoc locator) {
        return locator;
    }
}
