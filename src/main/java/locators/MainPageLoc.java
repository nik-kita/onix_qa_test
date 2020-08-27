package locators;

import org.openqa.selenium.By;

public enum MainPageLoc implements Locator {
    WELCOME_TITLE(By.cssSelector("h1")),
    AVAILABLE_EXAMPLES_TITLE(By.cssSelector("h2")),
    FORK_ME_ON_GITHUB_LABEL(By.cssSelector("[alt='Fork me on GitHub']")),
    BOTTOM_ELEMNTALSELENIUM_LINK(By.cssSelector("[href='http://elementalselenium.com/']")),
    ;

    private By path;

    MainPageLoc(By path) {
        this.path = path;
    }

    @Override
    public By getPath() {
        return path;
    }

    public enum MenuLink implements Locator {
        AB_TESTING(By.cssSelector("[href='/abtest']")),
        ADD_REMOVE_ELEMENTS(By.cssSelector("[href='/add_remove_elements/']")),
        BASIC_AUTH(By.cssSelector("[href='/basic_auth']")),
        BROKEN_IMAGES(By.cssSelector("[href='/broken_images']")),
        CHALLENGING_DOM(By.cssSelector("[href='/challenging_dom']")),
        CHECKBOXES(By.cssSelector("[href='/checkboxes']")),
        CONTEXT_MUNU(By.cssSelector("[href='/context_menu']")),
        DIGEST_AUTHENTIACTION(By.cssSelector("[href='/digest_auth']")),
        DISSAPPEAING_ELEMENTS(By.cssSelector("[href='/disappearing_elements']")),
        DRAG_AND_DROP(By.cssSelector("[href='/drag_and_drop']")),
        DROPDOWN(By.cssSelector("[href='/dropdown']")),
        DYNAMIC_CONTENT(By.cssSelector("[href='/dynamic_content']")),
        DYNAMIC_CONTROLS(By.cssSelector("[href='/dynamic_controls']")),
        DYNAMIC_LADING(By.cssSelector("[href='/dynamic_loading']")),
        ENTRY_AD(By.cssSelector("[href='/entry_ad']")),
        EXIT_INTENT(By.cssSelector("[href='/exit_intent']")),
        FILE_DOWNLOAD(By.cssSelector("[href='/download']")),
        FILE_UPLOAD(By.cssSelector("[href='/upload']")),
        FLATING_MENU(By.cssSelector("[href='/floating_menu']")),
        FORGOT_PASSWORD(By.cssSelector("[href='/forgot_password']")),
        FORM_AUTHENTICATION(By.cssSelector("[href='/login']")),
        FRAMES(By.cssSelector("[href='/frames']")),
        GEOLOCATION(By.cssSelector("[href='/geolocation']")),
        HORIZONTAL_SLIDER(By.cssSelector("[href='/horizontal_slider']")),
        HOVERS(By.cssSelector("[href='/hovers']")),
        INFINITE_SCROLL(By.cssSelector("[href='/infinite_scroll']")),
        INPUTS(By.cssSelector("[href='/inputs']")),
        JQUETY_UI_MENUS(By.cssSelector("[href='/jqueryui/menu']")),
        JAVASCRIPT_ALERTS(By.cssSelector("[href='/javascript_alerts']")),
        JAVASCRIPT_ONLOAD_EVENT_ERROR(By.cssSelector("[href='/javascript_error']")),
        KEY_PRESSES(By.cssSelector("[href='/key_presses']")),
        LARHT_AND_DEEP_DOM(By.cssSelector("[href='/large']")),
        MULTIPLT_WINDOWS(By.cssSelector("[href='/windows']")),
        NESTED_FRAMES(By.cssSelector("[href='/nested_frames']")),
        NOTIFICATION_MESSAGES(By.cssSelector("[href='/notification_message']")),
        REDIRECT_LINK(By.cssSelector("[href='/redirector']")),
        SECURE_FILE_DOWNLOAD(By.cssSelector("[href='/download_secure']")),
        SHADOW_DOM(By.cssSelector("[href='/shadowdom']")),
        SHIFTING_CONTENT(By.cssSelector("[href='/shifting_content']")),
        SLOW_RESOURCES(By.cssSelector("[href='/slow']")),
        SORTABLE_DATA_TABLES(By.cssSelector("[href='/tables']")),
        STATUS_CODES(By.cssSelector("[href='/status_codes']")),
        TYPOS(By.cssSelector("[href='/typos']")),
        WYSIWYG_EDITROR(By.cssSelector("[href='/tinymce']"));

        private By path;

        MenuLink(By path) {
            this.path = path;
        }
        @Override
        public By getPath() {
            return path;
        }
    }
}



