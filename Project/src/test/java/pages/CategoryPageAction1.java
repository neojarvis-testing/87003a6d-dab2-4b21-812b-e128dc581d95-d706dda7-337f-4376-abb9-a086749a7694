package pages;

import org.testng.Assert;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import uistore.CategoryPageLocator1;
import utils.Base;
import utils.LoggerHandler;
import utils.Screenshot;
import utils.WebDriverHelper;

public class CategoryPageAction1 {
    WebDriverHelper wdh = new WebDriverHelper(Base.driver);


    public void categorySelection(ExtentTest test){
         wdh.clickAction(CategoryPageLocator1.bicycleCategoryOnPage);
            LoggerHandler.info("clicked on bicycle category");
            test.log(Status.INFO, "clicked on bicycle category");
            wdh.waitForElementToBeVisible(CategoryPageLocator1.biCycleCatLabel, 3);
            Assert.assertEquals(wdh.getText(CategoryPageLocator1.biCycleCatLabel), "Bicycle Category");
            LoggerHandler.info("verified the label bicycle category");
            test.log(Status.INFO, "verified the label bicycle category");
            Screenshot.captureScreenShot("screenshot");
            LoggerHandler.info("captured screenshot");
            test.log(Status.INFO, "captured screenshot");
    }
    
}
