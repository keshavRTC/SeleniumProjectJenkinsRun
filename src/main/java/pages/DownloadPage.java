package pages;

import org.openqa.selenium.WebDriver;
import locators.DownloadPageLocators;

public class DownloadPage {
    WebDriver driver;

    public DownloadPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickDownload() {
        driver.findElement(DownloadPageLocators.downloadButton).click();
    }

    public void clickNext() {
        driver.findElement(DownloadPageLocators.nextButton).click();
    }
}
