package pages;

// import org.testng.Assert;

import uistore.AvonFitnessMachineLocators5;
import utils.Base;
import utils.WebDriverHelper;

public class AvonFitnessMachineActions5 {

    // public static void verifyAFMurl(){
    //      WebDriverHelper wb = new WebDriverHelper(Base.driver);
    //     String actual = wb.getCurrenURL();
    //     String expected = "https://avonfitnessmachines.com/";
    //     Assert.assertEquals(actual, expected);

    // }

    public static void closePopUP(){
        WebDriverHelper wb = new WebDriverHelper(Base.driver);
        wb.waitForElementToBeVisible(AvonFitnessMachineLocators5.closePopUp, 8);
        wb.clickAction(AvonFitnessMachineLocators5.closePopUp);
    }
    
    public static void domesticGymHover(){
        WebDriverHelper wb = new WebDriverHelper(Base.driver);
        wb.waitForElementToBeVisible(AvonFitnessMachineLocators5.domesticGym, 5);
        wb.hoverAction(AvonFitnessMachineLocators5.domesticGym);
        
    }

    public static void cardioLineHover(){
        WebDriverHelper wb = new WebDriverHelper(Base.driver);
        wb.waitForElementToBeVisible(AvonFitnessMachineLocators5.cardioLine, 5);
        wb.hoverAction(AvonFitnessMachineLocators5.cardioLine);
       
    }

    public static void clickTreadmills(){
        WebDriverHelper wb = new WebDriverHelper(Base.driver);
        wb.waitForElementToBeVisible(AvonFitnessMachineLocators5.treadmills, 5);
        wb.clickAction(AvonFitnessMachineLocators5.treadmills);


    }


    
}
