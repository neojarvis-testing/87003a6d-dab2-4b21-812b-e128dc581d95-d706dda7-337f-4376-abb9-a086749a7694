package pages;

import org.testng.Assert;

import uistore.AccountRegister5;
import utils.Base;
import utils.WebDriverHelper;

public class AccountRegisterActions5 {

    public static void verifyAccountRegisterUrl(){
        WebDriverHelper wb = new WebDriverHelper(Base.driver);
        String actual = wb.getCurrenURL();
        String expected = "https://avoncycles.com/customer/register.html";
        Assert.assertEquals(actual, expected);
    }

    public static void verifyFirstName(){
        WebDriverHelper wb = new WebDriverHelper(Base.driver);
        String actual = wb.getDOMAttribute(AccountRegister5.firstName, "placeholder");
        String expected = "First name";
        Assert.assertEquals(actual, expected);
    }

    public static void inputLatName(){
        WebDriverHelper wb = new WebDriverHelper(Base.driver);
        wb.clickAction(AccountRegister5.lastName);
        wb.sendKeys(AccountRegister5.lastName, "Lastname");

    }

    public static void inputEmail(){
        WebDriverHelper wb = new WebDriverHelper(Base.driver);
        wb.clickAction(AccountRegister5.email);
        wb.sendKeys(AccountRegister5.email, "Email");

    }

    public static void inputPhone(){
        WebDriverHelper wb = new WebDriverHelper(Base.driver);
        wb.clickAction(AccountRegister5.phone);
        wb.sendKeys(AccountRegister5.phone, "9876543210");
    }

    public static void inputPassword(){
        WebDriverHelper wb = new WebDriverHelper(Base.driver);
        wb.clickAction(AccountRegister5.password);
        wb.sendKeys(AccountRegister5.password , "password");
    }

    public static void clickOnSignup(){
        WebDriverHelper wb = new WebDriverHelper(Base.driver);
        wb.clickAction(AccountRegister5.signup);

    }

  
    
}
