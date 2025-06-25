package Assignment1;

import base.BaseTest;
import org.testng.annotations.Test;
import pages.Page1_Login;
import pages.Page2_CheckboxPage;
import pages.Page3_NameFormPage;
import pages.Page4_DatePage;
import pages.Page5_DropdownPage;
import pages.FileUploadPage;
import pages.ModalPopupPage;
import pages.AlertPopupPage;
import pages.PromptPopupPage;
import pages.WindowHandlePage;
import pages.DownloadPage;
import pages.SimpleNextPage;
import pages.ShadowIframePage;

public class AssignmentTest extends BaseTest {
	@Test
	 public void runAssignment() throws InterruptedException {
//        AssignmentTest test = new AssignmentTest();
//        test.setUp();

        Page1_Login page1 = new Page1_Login(driver);
        Thread.sleep(2000) ; 
        page1.enterEmail();
        page1.enterPassword();
        Thread.sleep(2000) ; 
        page1.enterCompany();
        page1.enterMobile();
        Thread.sleep(2000) ; 
        page1.clickSubmit();
        Thread.sleep(2000) ; 
        page1.clickNext();
        Thread.sleep(2000) ; 
        
        
        
        
        Page2_CheckboxPage page2 = new Page2_CheckboxPage(driver);
        page2.selectFirstTwoCheckboxes();
        Thread.sleep(2000) ; 
        page2.clickNext();
        Thread.sleep(2000) ; 
        
        
        Page3_NameFormPage page3 = new Page3_NameFormPage(driver);
        page3.clickSvgIcon();
        Thread.sleep(2000) ; 
        page3.enterFirstName();
        page3.enterLastName();
        Thread.sleep(2000) ; 
        page3.clickNext();
        Thread.sleep(2000) ; 
        
        
        Page4_DatePage page4 = new Page4_DatePage(driver);
        page4.enterDate();
        Thread.sleep(2000) ; 
        page4.clickNext();
        
        Page5_DropdownPage dropdownPage = new Page5_DropdownPage(driver);
        dropdownPage.selectCar();
        Thread.sleep(2000) ; 
        dropdownPage.clickNext();
        
        FileUploadPage page6 = new FileUploadPage(driver);
        page6.uploadFile();
        Thread.sleep(2000) ; 
        page6.clickNext();
        
        ModalPopupPage page7 = new ModalPopupPage(driver);
        page7.openModal();
        Thread.sleep(2000) ; 
        page7.closeModal();
        Thread.sleep(2000) ; 
        page7.clickNext();
        
        
        AlertPopupPage page8 = new AlertPopupPage(driver);
        page8.handleDoubleAlert();
        Thread.sleep(2000) ; 
        page8.clickNext();
        Thread.sleep(2000) ; 
        
        
        PromptPopupPage page9 = new PromptPopupPage(driver);
        page9.handlePromptAlert();
        Thread.sleep(2000) ; 
        page9.clickNext();
        
        WindowHandlePage page10 = new WindowHandlePage(driver);
        page10.openNewWindowAndReturn();
        Thread.sleep(2000) ; 
        page10.clickNext();
        
        DownloadPage page11 = new DownloadPage(driver);
        page11.clickDownload();
        Thread.sleep(2000) ; 
        page11.clickNext();
        
        SimpleNextPage page12 = new SimpleNextPage(driver);
        Thread.sleep(2000) ; 
        page12.clickNext();
        
        
        ShadowIframePage page13 = new ShadowIframePage(driver);
        Thread.sleep(2000) ; 
        page13.enterDataInShadowIframe();
        Thread.sleep(2000) ; 
        page13.clickNext();
        Thread.sleep(2000) ; 
        
        
        
        
        
        

        
    }
}
