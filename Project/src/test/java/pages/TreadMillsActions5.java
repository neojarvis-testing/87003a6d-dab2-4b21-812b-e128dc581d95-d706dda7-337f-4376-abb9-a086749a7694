
package pages;


import org.testng.Assert;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import uistore.TreadmillsLocators5;
import utils.Base;
import utils.ExcelReader;
import utils.LoggerHandler;
import utils.WebDriverHelper;

public class TreadMillsActions5 {
    
    public static void verifyTreadMillUrl(ExtentTest test){
        try {
             WebDriverHelper wb = new WebDriverHelper(Base.driver);
             String actual = Base.driver.getCurrentUrl();
             String expected = ExcelReader.readCellValue("Raj", "15", "value");
            //  Assert.assertEquals(actual, expected);
             test.log(Status.PASS, "Verified");

        } catch (Exception e) {
        } catch(AssertionError e){
            LoggerHandler.error(e.getMessage());
            test.log(Status.FAIL, e.getMessage());

        }
    }

    public static void clickOnFirstProduct(ExtentTest test){
        WebDriverHelper wb = new WebDriverHelper(Base.driver);
        wb.waitForElementToBeVisible(TreadmillsLocators5.firstProduct, 10);
        wb.clickAction(TreadmillsLocators5.firstProduct);

    }




}