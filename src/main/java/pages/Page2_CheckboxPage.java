package pages;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import locators.Page2_CheckboxLocators;

public class Page2_CheckboxPage {
    WebDriver driver;

    public Page2_CheckboxPage(WebDriver driver) {
        this.driver = driver;
    }

    public void selectFirstTwoCheckboxes() {
        List<WebElement> checkboxes = driver.findElements(Page2_CheckboxLocators.allCheckboxes);
        for (int i = 0; i < 2 && i < checkboxes.size(); i++) {
            checkboxes.get(i).click();
        }
    }

    public void clickNext() {
        driver.findElement(Page2_CheckboxLocators.nextButton).click();
    }
}
