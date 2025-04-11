package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;


import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import uistore.HomePageHeaderLocator4;
import utils.Base;
import utils.LoggerHandler;
import utils.Reporter;
import utils.Screenshot;
import utils.WebDriverHelper;

public class HomePageHeaderAction4 {

    WebDriverHelper driverHelper = new WebDriverHelper(Base.driver);

    public void methodDealerLocator(ExtentTest test){
        try{
            Base.driver.navigate().back();
            driverHelper.clickAction(HomePageHeaderLocator4.clickDealerLocator);
            LoggerHandler.info("clicked on "+ driverHelper.getText(HomePageHeaderLocator4.clickDealerLocator));
            Select select = new Select(Base.driver.findElement(By.name("stateFilter")));
            select.selectByValue("4");
            Thread.sleep(1000);
            Select selectone = new
            Select(Base.driver.findElement(By.name("cityFilter")));
            selectone.selectByValue("327");
            Thread.sleep(1000);
            driverHelper.clickAction(HomePageHeaderLocator4.clickSearchIcon);
            Screenshot.captureScreenShot("citypage");
            Reporter.attachScreenshotToReport("CityPage", test, "screenshot clicked");
            LoggerHandler.info("Captured Screenshot");
            test.log(Status.INFO, "Screenshot Captured");
        }catch(AssertionError |Exception e){
            e.printStackTrace();
        }
    }


}
