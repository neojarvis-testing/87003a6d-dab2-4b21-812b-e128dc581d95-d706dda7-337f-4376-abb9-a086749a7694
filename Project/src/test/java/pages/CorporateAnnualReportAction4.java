package pages;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import uistore.CorporateAnnualReportLocator4;
import uistore.HomePageFooterLocator4;
import utils.Base;
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
            LoggerHandler.info("clicked on Corporate");
            test.log(Status.INFO, "clicked on Corporate");
            driverHelper.waitForElementToBeVisible(HomePageFooterLocator4.clickCorporate, 5);
            driverHelper.clickAction(CorporateAnnualReportLocator4.clickFirstImage);
            driverHelper.switchWindow();
            test.log(Status.PASS, "switch to new tab");
            Reporter.attachScreenshotToReport("annual_reports", test, "ss captured");
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}