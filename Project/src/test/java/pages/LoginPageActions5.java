package pages;

import org.testng.Assert;

import uistore.LoginPageLocator5;
import utils.Base;
import utils.WebDriverHelper;

public class LoginPageActions5 {

    public static void verifyUrlLogin(){
        String actual = Base.driver.getCurrentUrl();
        String expected = "https://avoncycles.com/customer/login.html";

    }

    public static void verifyTitleLoginAccount(){
        String actual = Base.driver.getTitle();
        String expected = "Login page";
    }

    public static void loginAccountCreds(){
          WebDriverHelper wb = new WebDriverHelper(Base.driver);
          wb.clickAction(LoginPageLocator5.emailLogin);
          wb.sendKeys(LoginPageLocator5.emailLogin, "Demo@email.com");
          wb.EnterAction(LoginPageLocator5.emailLogin);

    }

    public static void passwordEnter(){
        WebDriverHelper wb = new WebDriverHelper(Base.driver);
        wb.clickAction(LoginPageLocator5.passwordLogin);
        wb.sendKeys(LoginPageLocator5.passwordLogin, "Password");
        wb.EnterAction(LoginPageLocator5.passwordLogin);
        }

    public static void loginButtonClick(){
        WebDriverHelper wb = new WebDriverHelper(Base.driver);
        wb.clickAction(LoginPageLocator5.loginButton);
    }

    public static void verifyCredsNotMatch(){
        WebDriverHelper wb = new WebDriverHelper(Base.driver);
        String actual = Base.driver.findElement(LoginPageLocator5.credsDontMatch).getText();
        String expected = "These credentials do not match our records.";
        Assert.assertEquals(actual, expected);

    }

    public static void clickOnNewHere(){
        WebDriverHelper wb = new WebDriverHelper(Base.driver);
        wb.clickAction(LoginPageLocator5.createAccount);
    }
    
}
