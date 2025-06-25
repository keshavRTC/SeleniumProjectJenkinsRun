package pages;

import org.openqa.selenium.WebDriver;
import locators.ModalPopupPageLocators;

public class ModalPopupPage {
    WebDriver driver;

    public ModalPopupPage(WebDriver driver) {
        this.driver = driver;
    }

    public void openModal() {
        driver.findElement(ModalPopupPageLocators.openModalButton).click();
    }

    public void closeModal() {
        driver.findElement(ModalPopupPageLocators.closeModalButton).click();
    }

    public void clickNext() {
        driver.findElement(ModalPopupPageLocators.nextButton).click();
    }
}
