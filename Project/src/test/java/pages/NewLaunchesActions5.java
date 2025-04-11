
package pages;

import org.testng.Assert;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import uistore.NewLaunchesLocator5;
import utils.Base;
import utils.ExcelReader;
import utils.LoggerHandler;
import utils.WebDriverHelper;

public class NewLaunchesActions5 {

    public static void verifyURL(ExtentTest test){
        try {  String actual = Base.driver.getCurrentUrl();
            String expected = ExcelReader.readCellValue("Raj", "14", "value");
            // Assert.assertEquals(actual, expected);
            
        } catch (Exception e) {
            // TODO: handle exception
        } catch(AssertionError e){
            LoggerHandler.error(e.getMessage());
            test.log(Status.FAIL, e.getMessage());

        }
        
    }
    
   
    public static void clickOnHeart(ExtentTest test){
        WebDriverHelper wb = new WebDriverHelper(Base.driver);
        wb.clickAction(NewLaunchesLocator5.heartIcon);
        LoggerHandler.info("Clicked on heart icon");
        test.log(Status.INFO, "Clicked on heart icon");
        wb.switchWindow();
    }



}
