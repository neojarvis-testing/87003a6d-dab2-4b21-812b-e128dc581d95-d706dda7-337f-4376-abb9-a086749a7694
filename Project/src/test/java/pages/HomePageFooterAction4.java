package pages;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import uistore.HomePageFooterLocator4;
import utils.Base;
import utils.LoggerHandler;
import utils.WebDriverHelper;

public class HomePageFooterAction4 {

    WebDriverHelper driverHelper = new WebDriverHelper(Base.driver);
    public void methodAwards(ExtentTest test){
        try{
            driverHelper.waitForElementToBeClickable(HomePageFooterLocator4.clickAwards, 5);
            driverHelper.clickAction(HomePageFooterLocator4.clickAwards);
            LoggerHandler.info("clicked on Awards");
            test.log(Status.INFO, "Clicked on Awards");
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    public void methodBlogs(ExtentTest test){
        try{
            Base.driver.navigate().back();
            driverHelper.scrollwindow(200);
            driverHelper.waitForElementToBeClickable(HomePageFooterLocator4.clickBlogs, 10);
            driverHelper.clickAction(HomePageFooterLocator4.clickBlogs);
            LoggerHandler.info("clicked on Blogs");
            test.log(Status.INFO, "clicked on Blogs");
             
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    public void methodWarrantyPolicy(ExtentTest test){
        try{
            Base.driver.navigate().back();
            driverHelper.scrollwindow(200);
            driverHelper.waitForElementToBeClickable(HomePageFooterLocator4.clickWarrantyPolicy,10);
            driverHelper.clickAction(HomePageFooterLocator4.clickWarrantyPolicy);
            LoggerHandler.info("clicked on Warrenty Policy");
            test.log(Status.INFO, "clicked on Warrenty Policy");
            
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    public void methodTermsandConditions(ExtentTest test){
        try{
            Base.driver.navigate().back();
            driverHelper.scrollwindow(200);
            driverHelper.waitForElementToBeClickable(HomePageFooterLocator4.clickTermsandConditions,10);
            driverHelper.clickAction(HomePageFooterLocator4.clickTermsandConditions);
            LoggerHandler.info("clicked on Terms and Conditions");
            test.log(Status.INFO, "clicked on Terms and Conditions");
            
        }catch(Exception e){
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
            LoggerHandler.info("clicked on Production");
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
            LoggerHandler.info("clicked on Life At Avon");
            test.log(Status.INFO, "clicked on Live At Avon");  
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
}