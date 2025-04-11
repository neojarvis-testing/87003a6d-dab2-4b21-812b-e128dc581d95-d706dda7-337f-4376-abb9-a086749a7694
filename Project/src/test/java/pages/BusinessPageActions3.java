package pages;
 
import org.testng.Assert;
 
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
 
import uistore.BusinessPageLocators3;
import utils.Base;
import utils.ExcelReader;
import utils.LoggerHandler;
import utils.Reporter;
import utils.Screenshot;
import utils.WebDriverHelper;
 
public class BusinessPageActions3 {
 
    WebDriverHelper helper = new WebDriverHelper(Base.driver);
 
    public void verify() {
        try {
 
            helper.getDOMAttribute(BusinessPageLocators3.verifyAvonLogo, "src");
           
           
            Assert.assertEquals(helper.getText(BusinessPageLocators3.verifyCertifications),
                     ExcelReader.readCellValue("Avinash", "9", "value"), "msg");
 
            helper.getText(BusinessPageLocators3.verifyEmailField);
 
            helper.getText(BusinessPageLocators3.verifyPhNo);
           
            helper.getText(BusinessPageLocators3.verifyCountryLabel);
 
 
        } catch (Exception e) {
            e.printStackTrace();
        }catch(AssertionError e){
            e.printStackTrace();
        }
 
    }
 
    public void contactForm(ExtentTest test) {
        try {
            test.log(Status.INFO,"Browser opened");
            LoggerHandler.info("browser opened");
            helper.scrollwindow(10500);
 
            helper.clickAction(BusinessPageLocators3.clickEmailField);
            test.log(Status.INFO, "clicked email field");
            LoggerHandler.info("clicked email field");
 
            helper.sendKeys(BusinessPageLocators3.clickEmailField, ExcelReader.readCellValue("Avinash", "2", "value"));
            test.log(Status.INFO, "entered value in email field");
            LoggerHandler.info("entered value in email field");
           
        } catch (Exception e) {
            e.printStackTrace();
        }
 
    }
    public void inputPhno(ExtentTest test){
        try {
            helper.clickAction(BusinessPageLocators3.inputPhNoField);
            test.log(Status.INFO, "clicked phone field");
            LoggerHandler.info("clicked phone field");
 
            helper.sendKeys(BusinessPageLocators3.inputPhNoField, ExcelReader.readCellValue("Avinash","3","value"));
            test.log(Status.INFO, "entered value in phone field");
            LoggerHandler.info("entered value in phone field");
           
        } catch (Exception e) {
            e.printStackTrace();
        }
 
    }
    public void inputCountry(ExtentTest test){
        try {
            helper.clickAction(BusinessPageLocators3.inputCountryField);
            test.log(Status.INFO, "clicked country field");
            LoggerHandler.info("clicked country field");
 
            helper.sendKeys(BusinessPageLocators3.inputCountryField, ExcelReader.readCellValue("Avinash","4","value"));
            test.log(Status.INFO, "entered value in country field");
            LoggerHandler.info("entered value in country field");
           
        } catch (Exception e) {
            e.printStackTrace();
           
        }
 
 
    }
    public void inputCompany(ExtentTest test){
        try {
            helper.clickAction(BusinessPageLocators3.inputCompanyName);
            test.log(Status.INFO, "clicked on company field");
            LoggerHandler.info("clicked on company field");
           
            helper.sendKeys(BusinessPageLocators3.inputCompanyName, ExcelReader.readCellValue("Avinash", "5", "value"));
            test.log(Status.INFO, "entered value in company field");
            LoggerHandler.info("entered value in company field");
           
        } catch (Exception e) {
            e.printStackTrace();
        }
 
    }
    public void inputAddressField(ExtentTest test){
        try {
            helper.scrollwindow(500);
   
            helper.clickAction(BusinessPageLocators3.inputAddress);
            test.log(Status.INFO, "clicked on address field");
            LoggerHandler.info("clicked on address field");
 
            helper.sendKeys(BusinessPageLocators3.inputAddress, ExcelReader.readCellValue("Avinash", "6", "value"));
            test.log(Status.INFO, "entered value in address field");
            LoggerHandler.info("entered value in address field");
 
           
        } catch (Exception e) {
            e.printStackTrace();
        }
 
 
    }
    public void inputSubjectField(ExtentTest test){
        try {
            helper.clickAction(BusinessPageLocators3.inputSubject);
            test.log(Status.INFO, "clicked on subject field");
            LoggerHandler.info("clicked on subject field");
 
            helper.sendKeys(BusinessPageLocators3.inputSubject, ExcelReader.readCellValue("Avinash", "7", "value"));
            test.log(Status.INFO, "entered value in subject field");
            LoggerHandler.info("entered value in subject field");
           
        } catch (Exception e) {
            e.printStackTrace();
        }
 
    }
    public void inputMsg(ExtentTest test){
        try {
            helper.clickAction(BusinessPageLocators3.inputYourMsg);
            test.log(Status.INFO, "clicked on message field");
            LoggerHandler.info("clicked on message field");
 
            helper.sendKeys(BusinessPageLocators3.inputYourMsg, ExcelReader.readCellValue("Avinash", "8", "value"));
   
            helper.clickAction(BusinessPageLocators3.clickSendButton);
            test.log(Status.INFO,"clicked on send button");
            LoggerHandler.info("clicked on send button");
 
            Screenshot.captureScreenShot("Contact Forms");
            Reporter.attachScreenshotToReport("Contact Message Forms",test,"SS attached to report");
           
        } catch (Exception e) {
            e.printStackTrace();
        }
 
    }
 
}