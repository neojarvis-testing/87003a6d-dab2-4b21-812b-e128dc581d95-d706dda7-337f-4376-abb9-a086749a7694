package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import uistore.HomePageLocators1;
import utils.Base;
import utils.LoggerHandler;
import utils.WebDriverHelper;

public class HomePageAction1 {
    WebDriverHelper wdh = new WebDriverHelper(Base.driver);

    public void hoverOnBicycleAndClickOnElectric(ExtentTest test) {
        try {
            wdh.hoverAction(HomePageLocators1.bicycleCategory);
            LoggerHandler.info("hovered on bicycle category");
            test.log(Status.INFO, "hovered on bicycle category");
            wdh.clickAction(HomePageLocators1.electricCycles);
            LoggerHandler.info("clicked on electric cycles");
            test.log(Status.INFO, "clicked on electric cycles");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

}
