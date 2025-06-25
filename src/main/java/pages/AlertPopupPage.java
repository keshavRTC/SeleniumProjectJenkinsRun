package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.Alert;

import locators.AlertPopupPageLocators;

public class AlertPopupPage {
    WebDriver driver;

    public AlertPopupPage(WebDriver driver) {
        this.driver = driver;
    }

    public void handleDoubleAlert() {
        driver.findElement(AlertPopupPageLocators.alertButton).click();

        // Accept first alert
        Alert alert1 = driver.switchTo().alert();
        alert1.accept();

        // Accept second alert (if appears)
        Alert alert2 = driver.switchTo().alert();
        alert2.accept();
    }

    public void clickNext() {
        driver.findElement(AlertPopupPageLocators.nextButton).click();
    }
}
