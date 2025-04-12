package pages;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import uistore.HistoryPageLocator4;
import uistore.HomePageFooterLocator4;
import utils.Base;
import utils.LoggerHandler;
import utils.WebDriverHelper;

public class HistoryPageAction4 {

    WebDriverHelper driverHelper = new WebDriverHelper(Base.driver);

    public void methodAboutUs(ExtentTest test){
        try{
            driverHelper.waitForElementToBeClickable(HomePageFooterLocator4.clickAboutUs, 5);
            driverHelper.clickAction(HomePageFooterLocator4.clickAboutUs);
            LoggerHandler.info("clicked on About Us");
            test.log(Status.INFO, "clicked on About Us");
            driverHelper.scrollwindow(500);
            driverHelper.clickAction(HistoryPageLocator4.clickReadMore);
            LoggerHandler.info("clicked on Read More");
            test.log(Status.INFO, "clicked on Read More");
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}