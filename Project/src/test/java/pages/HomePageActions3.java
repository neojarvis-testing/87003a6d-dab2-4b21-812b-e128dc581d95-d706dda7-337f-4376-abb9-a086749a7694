package pages;

import com.aventstack.extentreports.ExtentTest;

import uistore.HomePageNavBarLocators3;
import utils.Base;
import utils.WebDriverHelper;

public class HomePageActions3 {

     WebDriverHelper helper = new WebDriverHelper(Base.driver);

    // Method to navigate to Avon from the homepage
    public void navigateToAvon(ExtentTest test) {
        helper.hoverAction(HomePageNavBarLocators3.hoverCycleByBrand);
        helper.clickAction(HomePageNavBarLocators3.clickAvon);
    }

    public void navigateToInternationalBusiness(ExtentTest test){
        helper.clickAction(HomePageNavBarLocators3.clickInternationalBusiness);
    }

}
