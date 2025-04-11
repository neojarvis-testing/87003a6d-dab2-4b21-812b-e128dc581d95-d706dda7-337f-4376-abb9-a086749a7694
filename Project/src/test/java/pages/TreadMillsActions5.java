package pages;


import org.testng.Assert;

import uistore.TreadmillsLocators5;
import utils.Base;
import utils.LoggerHandler;
import utils.WebDriverHelper;

public class TreadMillsActions5 {
    
    public static void verifyTreadMillUrl(){
        try {
             WebDriverHelper wb = new WebDriverHelper(Base.driver);
             String actual = Base.driver.getCurrentUrl();
             String expected = "https://avonfitnessmachines.com/domestic-treadmills";
             Assert.assertEquals(actual, expected);


        } catch (Exception e) {
        } catch(AssertionError e){
            LoggerHandler.error(e.getMessage());

        }
    }

    public static void clickOnFirstProduct(){
        WebDriverHelper wb = new WebDriverHelper(Base.driver);
        wb.waitForElementToBeVisible(TreadmillsLocators5.firstProduct, 10);
        wb.clickAction(TreadmillsLocators5.firstProduct);

    }




}
