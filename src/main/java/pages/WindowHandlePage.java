package pages;

import org.openqa.selenium.WebDriver;
import locators.WindowHandlePageLocators;

public class WindowHandlePage {
    WebDriver driver;

    public WindowHandlePage(WebDriver driver) {
        this.driver = driver;
    }

    public void openNewWindowAndReturn() {
        // Store the current window handle
        String originalWindow = driver.getWindowHandle();

        // Click to open a new window/tab
        driver.findElement(WindowHandlePageLocators.openNewWindowButton).click();

        // Switch to newly opened window
        for (String handle : driver.getWindowHandles()) {
            if (!handle.equals(originalWindow)) {
                driver.switchTo().window(handle);
                break;
            }
        }

        // You can perform actions in the new window here if needed

        // Switch back to original window
        driver.switchTo().window(originalWindow);
    }

    public void clickNext() {
        driver.findElement(WindowHandlePageLocators.nextButton).click();
    }
}
