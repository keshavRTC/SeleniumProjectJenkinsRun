package locators;

import org.openqa.selenium.By;

public class ShadowIframePageLocators {
    public static final By shadowHost = By.cssSelector(".shadow-container");
    public static final By iframeInsideShadow = By.cssSelector("iframe");

    public static final By inputInsideIframe = By.id("testInput");
    public static final By submitButtonInsideIframe = By.id("testButton");

    public static final By nextButton = By.xpath("//button[normalize-space()='Next']");
}
