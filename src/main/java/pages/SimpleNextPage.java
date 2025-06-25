package pages;

import org.openqa.selenium.WebDriver;
import locators.SimpleNextPageLocators;

public class SimpleNextPage {
    WebDriver driver;

    public SimpleNextPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickNext() {
        driver.findElement(SimpleNextPageLocators.nextButton).click();
    }
}
