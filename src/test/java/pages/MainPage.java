package pages;

import org.openqa.selenium.WebDriver;

public class MainPage extends BasePage {

    MainPage(WebDriver driver) {
        super(driver);
    }

    public MainPage isPageOpened() {
       return this;
    }
}
