package locators;

import org.openqa.selenium.By;

public class ModalPopupPageLocators {
    public static final By openModalButton = By.xpath("//button[@class='modal-btn !bg-blue-500']");
    public static final By closeModalButton = By.xpath("//span[@class='close']");
    public static final By nextButton = By.xpath("//button[normalize-space()='Next']");
}
