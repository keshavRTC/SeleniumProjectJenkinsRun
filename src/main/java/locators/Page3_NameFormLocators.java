package locators;

import org.openqa.selenium.By;

public class Page3_NameFormLocators {
    public static final By svgIcon = By.xpath("//*[local-name()='svg']");
    public static final By firstNameInput = By.name("firstName");
    public static final By lastNameInput = By.xpath("//input[@name='lastName']");
    public static final By nextButton = By.xpath("//button[normalize-space()='Next']");
}
