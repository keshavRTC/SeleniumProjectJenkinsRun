package pages;

import org.openqa.selenium.WebDriver;

import locators.Page1_LoginLocators;
import testdata.Page1_LoginData;

public class Page1_Login {
    WebDriver driver;

    public Page1_Login(WebDriver driver) {
        this.driver = driver;
    }

    public void enterEmail() {
        driver.findElement(Page1_LoginLocators.emailField).sendKeys(Page1_LoginData.email);
    }

    public void enterPassword() {
        driver.findElement(Page1_LoginLocators.passwordField).sendKeys(Page1_LoginData.password);
    }

    public void enterCompany() {
        driver.findElement(Page1_LoginLocators.companyField).sendKeys(Page1_LoginData.company);
    }

    public void enterMobile() {
        driver.findElement(Page1_LoginLocators.mobileField).sendKeys(Page1_LoginData.mobile);
    }

    public void clickSubmit() {
        driver.findElement(Page1_LoginLocators.submitButton).click();
    }

    public void clickNext() {
        driver.findElement(Page1_LoginLocators.nextButton).click();
    }
}
