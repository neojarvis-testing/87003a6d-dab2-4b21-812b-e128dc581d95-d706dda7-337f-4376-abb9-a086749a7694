package pages;

import uistore.TreadmillFirstProductLocators5;
import utils.Base;
import utils.WebDriverHelper;

public class TreadMillFirstProductActions5 {

    public static void verifySpecification(){

    }

    public static void clickEnquireNow(){
         WebDriverHelper wb = new WebDriverHelper(Base.driver);
         wb.clickAction(TreadmillFirstProductLocators5.enquireNow);
    }

    public static void inputName(){
        WebDriverHelper wb = new WebDriverHelper(Base.driver);
        wb.clickAction(TreadmillFirstProductLocators5.nameInput);
        wb.sendKeys(TreadmillFirstProductLocators5.nameInput, "Name");

    }

    public static void inputEmail(){
        WebDriverHelper wb = new WebDriverHelper(Base.driver);
        wb.clickAction(TreadmillFirstProductLocators5.emailInput);
        wb.sendKeys(TreadmillFirstProductLocators5.emailInput, "Demo@email.com");
    }

    public static void inputNumber(){
        WebDriverHelper wb = new WebDriverHelper(Base.driver);
        wb.clickAction(TreadmillFirstProductLocators5.numberInput);
        wb.sendKeys(TreadmillFirstProductLocators5.numberInput, "9876543210");
    }

    public static void inputCity(){
        WebDriverHelper wb = new WebDriverHelper(Base.driver);
        wb.clickAction(TreadmillFirstProductLocators5.cityInput);
        wb.sendKeys(TreadmillFirstProductLocators5.cityInput, "city");
        
    }

    public static void clickSubmit(){
        WebDriverHelper wb = new WebDriverHelper(Base.driver);
        wb.clickAction(TreadmillFirstProductLocators5.submitButton);
    }
    
}
