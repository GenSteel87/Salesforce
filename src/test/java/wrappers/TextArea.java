package wrappers;

import org.openqa.selenium.WebDriver;

public class TextArea {

    WebDriver driver;
    String label;

    public TextArea(WebDriver driver, String label) {
        this.driver = driver;
        this.label = label;
    }


}

