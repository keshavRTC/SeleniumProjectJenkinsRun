package locators;


import org.openqa.selenium.By;

public class Page1_LoginLocators {
    public static final By emailField = By.id("shub99");
    public static final By passwordField = By.id("pass");
    public static final By companyField = By.name("company");
    public static final By mobileField = By.xpath("(//input[@class='form-control'])[2]");
    public static final By submitButton = By.xpath("//button[@type='submit']");
    public static final By nextButton = By.xpath("//button[normalize-space()='Next']");
}