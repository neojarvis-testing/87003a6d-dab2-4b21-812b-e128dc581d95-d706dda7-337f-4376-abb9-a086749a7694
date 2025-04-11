package pages;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import uistore.HomePageLocator5;
import utils.Base;
import utils.LoggerHandler;
import utils.WebDriverHelper;

public class HomePageActions5 {
    
      public static void clickOnNewLaunches(ExtentTest test){
        WebDriverHelper wb = new WebDriverHelper(Base.driver);
        LoggerHandler.info("Browser Opened");
        wb.clickAction(HomePageLocator5.newLaunches);
        LoggerHandler.info("Clicked on New Launches");
        test.log(Status.INFO, "Clicked on New Launches");
    }

   //TEST CASE 6 STARTS FROM BELOW

    public static void clickAvonFitnessMachine(ExtentTest test){
      WebDriverHelper wb = new WebDriverHelper(Base.driver);
      wb.clickAction(HomePageLocator5.avonFitnessMachine);
      LoggerHandler.info("Clicked on Avon Fitness Machine");
      test.log(Status.INFO, "Clicked on Avon Fitness Machine");
      wb.switchWindow();
       
      
    }

    

}
