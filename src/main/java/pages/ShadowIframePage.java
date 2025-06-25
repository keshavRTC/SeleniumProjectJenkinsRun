package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import locators.ShadowIframePageLocators;
import testdata.ShadowIframePageData;

public class ShadowIframePage {
    WebDriver driver;

    public ShadowIframePage(WebDriver driver) {
        this.driver = driver;
    }

    public void enterDataInShadowIframe() {
        // Find shadow host
        WebElement shadowHost = driver.findElement(ShadowIframePageLocators.shadowHost);
        SearchContext shadowRoot = shadowHost.getShadowRoot();

        // Find iframe inside shadow DOM
        WebElement iframe = shadowRoot.findElement(ShadowIframePageLocators.iframeInsideShadow);

        // Switch to iframe
        driver.switchTo().frame(iframe);

        // Enter input and submit
        driver.findElement(ShadowIframePageLocators.inputInsideIframe)
              .sendKeys(ShadowIframePageData.inputText);

        driver.findElement(ShadowIframePageLocators.submitButtonInsideIframe)
              .click();

        // Exit iframe back to default page
        driver.switchTo().defaultContent();
    }

    public void clickNext() {
        driver.findElement(ShadowIframePageLocators.nextButton).click();
    }
}
