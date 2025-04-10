package pages;
import org.testng.Assert;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import uistore.CareerPageLocator4;
import uistore.HomePageFooterLocator4;
import utils.Base;
import utils.ExcelReader;
import utils.LoggerHandler;
import utils.WebDriverHelper;

public class CareerPageAction4 {

    WebDriverHelper driverHelper = new WebDriverHelper(Base.driver);

    public void methodCareer(ExtentTest test){
        try{
            Base.driver.navigate().back();
            driverHelper.scrollwindow(200);
            driverHelper.waitForElementToBeClickable(HomePageFooterLocator4.clickCareer, 5);
            driverHelper.clickAction(HomePageFooterLocator4.clickCareer);
            LoggerHandler.info("clicked on "+ driverHelper.getText(HomePageFooterLocator4.clickCareer));
            driverHelper.clickAction(CareerPageLocator4.clickApplyNow);
            Thread.sleep(1000);
            driverHelper.clickAction(CareerPageLocator4.clickCloseform);
            
            String actualHeading = driverHelper.getText(CareerPageLocator4.uploadProfile);
            String expextedHeading = ExcelReader.readCellValue("Sheet1", "6", "value");
            Assert.assertEquals(actualHeading, expextedHeading);
            LoggerHandler.info("Heading Verified");
            test.log(Status.INFO, "clicked on Career");

        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
}
