package pages;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import uistore.TreadmillFirstProductLocators5;
import utils.Base;
import utils.ExcelReader;
import utils.LoggerHandler;
import utils.WebDriverHelper;

public class TreadMillFirstProductActions5 {

    public static void verifySpecification(){

    }

    public static void clickEnquireNow(ExtentTest test){
         WebDriverHelper wb = new WebDriverHelper(Base.driver);
         wb.clickAction(TreadmillFirstProductLocators5.enquireNow);
         LoggerHandler.info("Clicked on enquire now");
         test.log(Status.INFO, "Clicked on enquire now");
    }

    public static void inputName(ExtentTest test){
        WebDriverHelper wb = new WebDriverHelper(Base.driver);
        wb.clickAction(TreadmillFirstProductLocators5.nameInput);
        LoggerHandler.info("Clicked on name input");
        test.log(Status.INFO, "Clicked on name input");
        wb.sendKeys(TreadmillFirstProductLocators5.nameInput, ExcelReader.readCellValue("Raj", "10", "value")); //10 "Name"
        LoggerHandler.info("Sent values in name input");
        test.log(Status.INFO, "Sent values in name input");

    }

    public static void inputEmail(ExtentTest test){
        WebDriverHelper wb = new WebDriverHelper(Base.driver);
        wb.clickAction(TreadmillFirstProductLocators5.emailInput);
        LoggerHandler.info("Entered email input");
        test.log(Status.INFO, "Entered email input");
        wb.sendKeys(TreadmillFirstProductLocators5.emailInput, ExcelReader.readCellValue("Raj", "7", "value"));//7 "Demo@email.com"
        LoggerHandler.info("entered value into email input");
        test.log(Status.INFO, "entered value into email input");
    }

    public static void inputNumber(ExtentTest test){
        WebDriverHelper wb = new WebDriverHelper(Base.driver);
        wb.clickAction(TreadmillFirstProductLocators5.numberInput);
        LoggerHandler.info("clicked on input number field");
        test.log(Status.INFO, "clicked on input number field");
        wb.sendKeys(TreadmillFirstProductLocators5.numberInput, ExcelReader.readCellValue("Raj", "5", "value")); //5 "9876543210"
        LoggerHandler.info("sent values into number field");
        test.log(Status.INFO, "sent values into number field");
    }

    public static void inputCity(ExtentTest test){
        WebDriverHelper wb = new WebDriverHelper(Base.driver);
        wb.clickAction(TreadmillFirstProductLocators5.cityInput);
        LoggerHandler.info("clicked on city input");
        test.log(Status.INFO, "clicked on city input");
        wb.sendKeys(TreadmillFirstProductLocators5.cityInput, ExcelReader.readCellValue("Raj", "9", "value")); //9 "city"
        
    }

    public static void clickSubmit(ExtentTest test){
        WebDriverHelper wb = new WebDriverHelper(Base.driver);
        wb.clickAction(TreadmillFirstProductLocators5.submitButton);
        LoggerHandler.info("clicked on submit button");
        test.log(Status.INFO, "clicked on submit button");
    }
    
}
