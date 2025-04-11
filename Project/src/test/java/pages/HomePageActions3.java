package pages;
 
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
 
import uistore.HomePageNavBarLocators3;
import utils.Base;
import utils.LoggerHandler;
import utils.WebDriverHelper;
 
public class HomePageActions3 {
 
     WebDriverHelper helper = new WebDriverHelper(Base.driver);
 
    // Method to navigate to Avon from the homepage
    public void navigateToAvon(ExtentTest test) {
        try {
            helper.hoverAction(HomePageNavBarLocators3.hoverCycleByBrand);
            test.log(Status.INFO,"Hovered on cycle by brand");
            LoggerHandler.info("Hovered on cycle by brand");
 
            helper.clickAction(HomePageNavBarLocators3.clickAvon);
            test.log(Status.INFO,"clicked on avon");
            LoggerHandler.info("clicked on avon");
           
           
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
 
    public void navigateToInternationalBusiness(ExtentTest test){
        try {
            helper.clickAction(HomePageNavBarLocators3.clickInternationalBusiness);
            test.log(Status.INFO,"clicked international business");
            LoggerHandler.info("clicked international business");  
           
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
 
}