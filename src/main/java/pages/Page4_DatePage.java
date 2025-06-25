package pages;

import org.openqa.selenium.WebDriver;
import locators.Page4_DateLocators;
import testdata.Page4_DateData;

public class Page4_DatePage {
    WebDriver driver;

    public Page4_DatePage(WebDriver driver) {
        this.driver = driver;
    }

    public void enterDate() {
        driver.findElement(Page4_DateLocators.dateInput).sendKeys(Page4_DateData.date);
    }

    public void clickNext() {
        driver.findElement(Page4_DateLocators.nextButton).click();
    }
}
