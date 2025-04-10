package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;

import uistore.HomePageLocators1;
import utils.Base;
import utils.LoggerHandler;
import utils.Screenshot;
import utils.WebDriverHelper;

public class HomePageAction1 {
    WebDriverHelper wdh = new WebDriverHelper(Base.driver);

    public void hmpageAction() {
        try {
            wdh.hoverAction(HomePageLocators1.bicycleCategory);
            LoggerHandler.info("hovered on bicycle category");
            wdh.clickAction(HomePageLocators1.electricCycles);
            LoggerHandler.info("clicked on electric cycles");
            wdh.clickAction(HomePageLocators1.price);
            LoggerHandler.info("clicked on price");
            wdh.clickAction(HomePageLocators1.priceClosed);
            wdh.clickAction(HomePageLocators1.review);
            LoggerHandler.info("clicked on review");
            
            wdh.clickAction(HomePageLocators1.firstoptionReview);
            LoggerHandler.info("clicked on first review option");
            wdh.waitForElementToBeClickable(HomePageLocators1.size, 3);
            wdh.clickAction(HomePageLocators1.size);
            LoggerHandler.info("clicked on size");
            wdh.clickAction(HomePageLocators1.firstOptionSize);
            LoggerHandler.info("clicked on first size");
            wdh.waitForElementToBeClickable(HomePageLocators1.height, 3);
            
            wdh.clickAction(HomePageLocators1.height);
            LoggerHandler.info("clicked on height");
            wdh.clickAction(HomePageLocators1.acceptCookies);
            LoggerHandler.info("clicked on accept cookies");
            wdh.waitForElementToBeClickable(HomePageLocators1.firstHeight, 3);
            wdh.clickAction(HomePageLocators1.firstHeight);
            LoggerHandler.info("clicked on first height option");
            wdh.waitForElementToBeClickable(HomePageLocators1.age, 3);
            LoggerHandler.info("clicked on age");
            wdh.clickAction(HomePageLocators1.age);
            wdh.clickAction(HomePageLocators1.firstAge);
            LoggerHandler.info("clicked on first age");
            wdh.waitForElementToBeClickable(HomePageLocators1.colorSwatch, 3);
            wdh.clickAction(HomePageLocators1.colorSwatch);
            LoggerHandler.info("clicked on color swatch");
            wdh.clickAction(HomePageLocators1.firstValuePrice);
            LoggerHandler.info("clicked on first price value");
            JavascriptExecutor js = (JavascriptExecutor) Base.driver;
            js.executeScript("window.scrollBy(0,-500)", "");
            
            wdh.waitForElementToBeClickable(HomePageLocators1.clearFilter, 3);
            wdh.hoverAction(HomePageLocators1.clearFilter);
            wdh.clickAction(HomePageLocators1.clearFilter);
            LoggerHandler.info("clicked on clear filter");
            wdh.clickAction(HomePageLocators1.categories);
            LoggerHandler.info("clicked on categories");
            wdh.clickAction(HomePageLocators1.bicycleCategoryOnPage);
            LoggerHandler.info("clicked on bicycle category");
            wdh.waitForElementToBeVisible(HomePageLocators1.biCycleCatLabel, 3);
            Assert.assertEquals(wdh.getText(HomePageLocators1.biCycleCatLabel), "Bicycle Category");
            LoggerHandler.info("verified the label bicycle category");
            Screenshot.captureScreenShot("screenshot");
            LoggerHandler.info("captured screenshot");

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

}
