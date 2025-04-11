package pages;

import uistore.HomePageLocator5;
import utils.Base;
import utils.LoggerHandler;
import utils.WebDriverHelper;

public class HomePageActions5 {
    
      public static void clickOnNewLaunches(){
        WebDriverHelper wb = new WebDriverHelper(Base.driver);
        LoggerHandler.info("Browser Opened");
        wb.clickAction(HomePageLocator5.newLaunches);
    }

   //TEST CASE 6 STARTS FROM BELOW

    public static void clickAvonFitnessMachine(){
      WebDriverHelper wb = new WebDriverHelper(Base.driver);
      wb.clickAction(HomePageLocator5.avonFitnessMachine);
      wb.switchWindow();
       
      
    }

    

}
