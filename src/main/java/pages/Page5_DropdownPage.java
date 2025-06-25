package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import locators.Page5_DropdownLocators;
import testdata.DropdownData;

public class Page5_DropdownPage {
    WebDriver driver;

    public Page5_DropdownPage(WebDriver driver) {
        this.driver = driver;
    }

    public void selectCar() {
        WebElement dropdown = driver.findElement(Page5_DropdownLocators.dropdown);
        Select select = new Select(dropdown);
        select.selectByVisibleText(DropdownData.car);
    }

    public void clickNext() {
        driver.findElement(Page5_DropdownLocators.next).click();
    }
}
