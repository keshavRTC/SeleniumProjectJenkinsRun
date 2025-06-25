package pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;

import locators.PromptPopupPageLocators;
import testdata.PromptPopupPageData;

public class PromptPopupPage {
    WebDriver driver;

    public PromptPopupPage(WebDriver driver) {
        this.driver = driver;
    }

    public void handlePromptAlert() {
        driver.findElement(PromptPopupPageLocators.promptButton).click();

        Alert prompt = driver.switchTo().alert();
        prompt.sendKeys(PromptPopupPageData.promptText);
        prompt.accept();

        // Second accept if needed
        Alert confirm = driver.switchTo().alert();
        confirm.accept();
    }

    public void clickNext() {
        driver.findElement(PromptPopupPageLocators.nextButton).click();
    }
}
