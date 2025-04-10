package pages;
import org.testng.Assert;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import uistore.CorporateAnnualReportLocator4;
import uistore.HomePageFooterLocator4;
import utils.Base;
import utils.ExcelReader;
import utils.LoggerHandler;
import utils.Reporter;
import utils.WebDriverHelper;

public class CorporateAnnualReportAction4 {

    WebDriverHelper driverHelper = new WebDriverHelper(Base.driver);

    public void methodCorporate(ExtentTest test){
        try{
            Base.driver.navigate().back();
            driverHelper.scrollwindow(200);
            driverHelper.waitForElementToBeClickable(HomePageFooterLocator4.clickCorporate, 5);
            driverHelper.clickAction(HomePageFooterLocator4.clickCorporate);
            LoggerHandler.info("clicked on "+ driverHelper.getText(HomePageFooterLocator4.clickCorporate));
          
            driverHelper.waitForElementToBeVisible(HomePageFooterLocator4.clickCorporate, 5);
            driverHelper.clickAction(CorporateAnnualReportLocator4.clickFirstImage);
            driverHelper.switchWindow();
            Reporter.attachScreenshotToReport("annual_reports", test, "ss captured");
            test.log(Status.PASS, "switch to new tab");

            String actualurl = Base.driver.getCurrentUrl();
            String expectedUrl = ExcelReader.readCellValue("Sheet1", "8", "value");
            Assert.assertEquals(actualurl, expectedUrl); 
            LoggerHandler.info("Url is Verified"); 
            test.log(Status.INFO, "clicked on Corporate");
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
}
