package pages;

import org.openqa.selenium.WebDriver;

import locators.Page3_NameFormLocators;
import testdata.Page3_NameFormData;

public class Page3_NameFormPage {
    WebDriver driver;

    public Page3_NameFormPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickSvgIcon() {
        driver.findElement(Page3_NameFormLocators.svgIcon).click();
    }

    public void enterFirstName() {
        driver.findElement(Page3_NameFormLocators.firstNameInput).sendKeys(Page3_NameFormData.firstName);
    }

    public void enterLastName() {
        driver.findElement(Page3_NameFormLocators.lastNameInput).sendKeys(Page3_NameFormData.lastName);
    }

    public void clickNext() {
        driver.findElement(Page3_NameFormLocators.nextButton).click();
    }
}
