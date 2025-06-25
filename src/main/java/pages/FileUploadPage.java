package pages;

import org.openqa.selenium.WebDriver;
import locators.FileUploadPageLocators;
import testdata.FileUploadPageData;

public class FileUploadPage {
    WebDriver driver;

    public FileUploadPage(WebDriver driver) {
        this.driver = driver;
    }

    public void uploadFile() {
        driver.findElement(FileUploadPageLocators.fileInput)
              .sendKeys(FileUploadPageData.filePath);
    }

    public void clickNext() {
        driver.findElement(FileUploadPageLocators.nextButton).click();
    }
}
