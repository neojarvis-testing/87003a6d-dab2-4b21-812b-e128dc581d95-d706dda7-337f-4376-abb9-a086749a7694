package pages;

import org.testng.Assert;

import com.aventstack.extentreports.ExtentTest;

import uistore.BusinessPageLocators3;
import utils.Base;
import utils.ExcelReader;
import utils.Reporter;
import utils.Screenshot;
import utils.WebDriverHelper;

public class BusinessPageActions3 {

    WebDriverHelper helper = new WebDriverHelper(Base.driver);

    public void verify() {
        try {

            helper.getDOMAttribute(BusinessPageLocators3.verifyAvonLogo, "src");
            // System.out.println("src");
            

            Assert.assertEquals(helper.getText(BusinessPageLocators3.verifyCertifications),
                     ExcelReader.readCellValue("Sheet1", "9", "value"), "msg");

            helper.getText(BusinessPageLocators3.verifyEmailField);

            helper.getText(BusinessPageLocators3.verifyCountryLabel);

            helper.getText(BusinessPageLocators3.verifyPhNo);

        } catch (Exception e) {
            e.printStackTrace();
        }catch(AssertionError e){
            e.printStackTrace();
        }

    }

    public void contactForm(ExtentTest test) {
        try {

            helper.scrollwindow(10500);

            helper.clickAction(BusinessPageLocators3.clickEmailField);
            helper.sendKeys(BusinessPageLocators3.clickEmailField, ExcelReader.readCellValue("Sheet1", "2", "value"));

            helper.clickAction(BusinessPageLocators3.inputPhNoField);
            helper.sendKeys(BusinessPageLocators3.inputPhNoField, ExcelReader.readCellValue("Sheet1","3","value"));

            helper.clickAction(BusinessPageLocators3.inputCountryField);
            helper.sendKeys(BusinessPageLocators3.inputCountryField, ExcelReader.readCellValue("Sheet1","4","value"));

            helper.clickAction(BusinessPageLocators3.inputCompanyName);
            helper.sendKeys(BusinessPageLocators3.inputCompanyName, ExcelReader.readCellValue("Sheet1", "5", "value"));

            helper.scrollwindow(500);

            helper.clickAction(BusinessPageLocators3.inputAddress);
            helper.sendKeys(BusinessPageLocators3.inputAddress, ExcelReader.readCellValue("Sheet1", "6", "value"));

            helper.clickAction(BusinessPageLocators3.inputSubject);
            helper.sendKeys(BusinessPageLocators3.inputSubject, ExcelReader.readCellValue("Sheet1", "7", "value"));

            helper.clickAction(BusinessPageLocators3.inputYourMsg);
            helper.sendKeys(BusinessPageLocators3.inputYourMsg, ExcelReader.readCellValue("Sheet1", "8", "value"));

            helper.clickAction(BusinessPageLocators3.clickSendButton);
            Screenshot.captureScreenShot("Contact Forms");
            Reporter.attachScreenshotToReport("Contact Message Forms",test,"SS attached to report");

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
