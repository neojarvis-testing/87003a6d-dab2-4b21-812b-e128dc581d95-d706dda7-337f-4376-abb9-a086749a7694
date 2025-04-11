package pages;
import org.openqa.selenium.JavascriptExecutor;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import uistore.ElectricCyclePageLocators1;
import utils.Base;
import utils.LoggerHandler;
import utils.WebDriverHelper;

public class ElectricCyclePageAction1 {
    

    WebDriverHelper wdh = new WebDriverHelper(Base.driver);

    public void electricCycleFiltering(ExtentTest test){
   wdh.clickAction(ElectricCyclePageLocators1.price);
            LoggerHandler.info("clicked on price");
            test.log(Status.INFO, "clicked on price");

            wdh.clickAction(ElectricCyclePageLocators1.priceClosed);
            wdh.clickAction(ElectricCyclePageLocators1.review);
            LoggerHandler.info("clicked on review");
            test.log(Status.INFO, "clicked on review");
            
            wdh.clickAction(ElectricCyclePageLocators1.firstoptionReview);
            LoggerHandler.info("clicked on first review option");
            test.log(Status.INFO, "clicked on first review option");

            wdh.waitForElementToBeClickable(ElectricCyclePageLocators1.size, 3);
            wdh.clickAction(ElectricCyclePageLocators1.size);
            LoggerHandler.info("clicked on size");
            test.log(Status.INFO, "clicked on size");

            wdh.clickAction(ElectricCyclePageLocators1.firstOptionSize);
            LoggerHandler.info("clicked on first size");
            test.log(Status.INFO, "clicked on first size");
            wdh.waitForElementToBeClickable(ElectricCyclePageLocators1.height, 3);
            
            wdh.clickAction(ElectricCyclePageLocators1.height);
            LoggerHandler.info("clicked on height");
            test.log(Status.INFO, "clicked on height");
            wdh.clickAction(ElectricCyclePageLocators1.acceptCookies);
            LoggerHandler.info("clicked on accept cookies");
            test.log(Status.INFO, "clicked on accept cookies");
            wdh.waitForElementToBeClickable(ElectricCyclePageLocators1.firstHeight, 3);
            wdh.clickAction(ElectricCyclePageLocators1.firstHeight);
            LoggerHandler.info("clicked on first height option");
            test.log(Status.INFO, "clicked on first height option");
            wdh.waitForElementToBeClickable(ElectricCyclePageLocators1.age, 3);
            LoggerHandler.info("clicked on age");
            test.log(Status.INFO, "clicked on age");
            wdh.clickAction(ElectricCyclePageLocators1.age);
            wdh.clickAction(ElectricCyclePageLocators1.firstAge);
            LoggerHandler.info("clicked on first age");
            test.log(Status.INFO, "clicked on first age");
            wdh.waitForElementToBeClickable(ElectricCyclePageLocators1.colorSwatch, 3);
            wdh.clickAction(ElectricCyclePageLocators1.colorSwatch);
            LoggerHandler.info("clicked on color swatch");
            test.log(Status.INFO, "clicked on color swatch");
            wdh.clickAction(ElectricCyclePageLocators1.firstValuePrice);
            LoggerHandler.info("clicked on first price value");
            test.log(Status.INFO, "clicked on first price value");
            JavascriptExecutor js = (JavascriptExecutor) Base.driver;
            js.executeScript("window.scrollBy(0,-500)", "");
            
            wdh.waitForElementToBeClickable(ElectricCyclePageLocators1.clearFilter, 3);
            wdh.hoverAction(ElectricCyclePageLocators1.clearFilter);
            wdh.clickAction(ElectricCyclePageLocators1.clearFilter);
            LoggerHandler.info("clicked on clear filter");
            test.log(Status.INFO, "clicked on clear filter");
            wdh.clickAction(ElectricCyclePageLocators1.categories);
            LoggerHandler.info("clicked on categories");
            test.log(Status.INFO, "clicked on categories");

    }
}
