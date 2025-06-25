//package base;
//
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//public class BaseTest {
//    protected WebDriver driver;
//    
//    public void setUp() {
//        driver = new ChromeDriver();
//        driver.get("https://rtc-automation.netlify.app/");
//        waitFor(3000);
//    }
//
//    public void tearDown() {
//        driver.quit();
//    }
//
//    public void waitFor(int millis) {
//        try { Thread.sleep(millis); } 
//        catch (InterruptedException e) { e.printStackTrace(); }
//    }
//}


package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {
    protected WebDriver driver;

    @BeforeMethod
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();  // Optional but good UX
        driver.get("https://rtc-automation.netlify.app/");
        waitFor(3000);
    }

    @AfterMethod
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }

    public void waitFor(int millis) {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

