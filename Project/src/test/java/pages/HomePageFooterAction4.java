package pages;
import org.testng.Assert;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import uistore.HomePageFooterLocator4;
import utils.Base;
import utils.ExcelReader;
import utils.LoggerHandler;
import utils.WebDriverHelper;

public class HomePageFooterAction4 {

    WebDriverHelper driverHelper = new WebDriverHelper(Base.driver);
    public void methodAwards(ExtentTest test){
        try{
            driverHelper.waitForElementToBeClickable(HomePageFooterLocator4.clickAwards, 5);
            driverHelper.clickAction(HomePageFooterLocator4.clickAwards);
            LoggerHandler.info("clicked on " + driverHelper.getText(HomePageFooterLocator4.clickAwards));
            String expected = ExcelReader.readCellValue("Sheet1", "1", "value");
            String actual = Base.driver.getCurrentUrl();
            Assert.assertEquals(actual, expected);
            LoggerHandler.info("URL Verified");
        }catch(AssertionError |Exception e){
            e.printStackTrace();
        }
    }

    public void methodBlogs(ExtentTest test){
        try{
            Base.driver.navigate().back();
            driverHelper.scrollwindow(200);
            driverHelper.waitForElementToBeClickable(HomePageFooterLocator4.clickBlogs, 10);
            driverHelper.clickAction(HomePageFooterLocator4.clickBlogs);
            LoggerHandler.info("clicked on "+ driverHelper.getText(HomePageFooterLocator4.clickBlogs));
            String expectedTwo = ExcelReader.readCellValue("Sheet1", "2", "value");
            String actualtwo = Base.driver.getCurrentUrl();
            Assert.assertEquals(actualtwo, expectedTwo); 
            LoggerHandler.info("title verified");
        }catch(AssertionError |Exception e){
            e.printStackTrace();
        }
    }

    public void methodWarrantyPolicy(ExtentTest test){
        try{
            Base.driver.navigate().back();
            driverHelper.scrollwindow(200);
            driverHelper.waitForElementToBeClickable(HomePageFooterLocator4.clickWarrantyPolicy,10);
            driverHelper.clickAction(HomePageFooterLocator4.clickWarrantyPolicy);
            LoggerHandler.info("clicked on "+ driverHelper.getText(HomePageFooterLocator4.clickWarrantyPolicy));
            String expectedThree = ExcelReader.readCellValue("Sheet1", "3", "value");
            String actualThree = Base.driver.getCurrentUrl();
            Assert.assertEquals(actualThree, expectedThree);
            LoggerHandler.info("page url verify");
            test.log(Status.INFO, "clicked on Warrenty Policy");
        }catch(AssertionError |Exception e){
            e.printStackTrace();
        }
    }

    public void methodTermsandConditions(ExtentTest test){
        try{
            Base.driver.navigate().back();
            driverHelper.scrollwindow(200);
            driverHelper.waitForElementToBeClickable(HomePageFooterLocator4.clickTermsandConditions,10);
            driverHelper.clickAction(HomePageFooterLocator4.clickTermsandConditions);
            LoggerHandler.info("clicked on "+ driverHelper.getText(HomePageFooterLocator4.clickTermsandConditions));
            String expectedfour = ExcelReader.readCellValue("Sheet1", "4", "value");
            String actualfour = Base.driver.getCurrentUrl();
            Assert.assertEquals(actualfour, expectedfour);
            LoggerHandler.info("page url verified");
            test.log(Status.INFO, "clicked on Terms and Conditions");
        }catch(AssertionError |Exception e){
            e.printStackTrace();
        }
    }

    public void methodProduction(ExtentTest test){
        try{
            Base.driver.navigate().back();
            Base.driver.navigate().back();
            
            driverHelper.scrollwindow(200);
            driverHelper.waitForElementToBeClickable(HomePageFooterLocator4.clickProduction, 5);
            driverHelper.clickAction(HomePageFooterLocator4.clickProduction);
            LoggerHandler.info("clicked on "+ driverHelper.getText(HomePageFooterLocator4.clickProduction));
        
            String actualTitle = Base.driver.getTitle();
            String expectedTitle = ExcelReader.readCellValue("Sheet1", "5", "Value");
            Assert.assertEquals(actualTitle, expectedTitle);
            LoggerHandler.info("expectedTitle verified");
            test.log(Status.INFO, "clicked on Production");
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    public void methodLiveAtAvon(ExtentTest test){
        try{
            Base.driver.navigate().back();
            LoggerHandler.info("navigate to home page");
            driverHelper.scrollwindow(200);
            driverHelper.waitForElementToBeClickable(HomePageFooterLocator4.clickLifeAtAvon, 5);
            driverHelper.clickAction(HomePageFooterLocator4.clickLifeAtAvon);
            LoggerHandler.info("clicked on "+ driverHelper.getText(HomePageFooterLocator4.clickLifeAtAvon));
            String actualTitle = Base.driver.getTitle();
            String expectedTitle = ExcelReader.readCellValue("Sheet1", "7", "value");
            Assert.assertEquals(actualTitle, expectedTitle);
            LoggerHandler.info("pagetitle verified");
            test.log(Status.INFO, "clicked on Live At Avon");
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
}
