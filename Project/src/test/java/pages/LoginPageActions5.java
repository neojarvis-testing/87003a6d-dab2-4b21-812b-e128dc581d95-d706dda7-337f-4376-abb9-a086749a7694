package pages;

import org.testng.Assert;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import uistore.LoginPageLocator5;
import utils.Base;
import utils.ExcelReader;
import utils.LoggerHandler;
import utils.Screenshot;
import utils.WebDriverHelper;

public class LoginPageActions5 {

    public static void verifyUrlLogin(ExtentTest test){
        try {String actual = Base.driver.getCurrentUrl();
            String expected = ExcelReader.readCellValue("Raj", "13", "value");
            // Assert.assertEquals(actual, expected);
        } catch (Exception e) {
            // TODO: handle exception
        }catch(AssertionError e){
            LoggerHandler.error(e.getMessage());
            test.log(Status.FAIL, e.getMessage());

        }
        

    }

    public static void verifyTitleLoginAccount(ExtentTest test){
        try { String actual = Base.driver.getTitle();
            String expected = ExcelReader.readCellValue("Raj", "12", "value");
            // Assert.assertEquals(actual, expected);
            
        } catch (Exception e) {
            // TODO: handle exception
        }catch(AssertionError e){
            LoggerHandler.error(e.getMessage());
            test.log(Status.FAIL, e.getMessage());

        }
        
    }

    public static void loginAccountCreds(ExtentTest test){
          WebDriverHelper wb = new WebDriverHelper(Base.driver);
          wb.clickAction(LoginPageLocator5.emailLogin);
          LoggerHandler.info("Clicked on email Login");
          test.log(Status.INFO, "Clicked on email Login");
          wb.sendKeys(LoginPageLocator5.emailLogin, ExcelReader.readCellValue("Raj", "7", "value")); 
          LoggerHandler.info("Sent value of email id");
          test.log(Status.INFO, "Sent value of email id");
          wb.EnterAction(LoginPageLocator5.emailLogin);

    }

    public static void passwordEnter(ExtentTest test){
        WebDriverHelper wb = new WebDriverHelper(Base.driver);
        wb.clickAction(LoginPageLocator5.passwordLogin);
        LoggerHandler.info("Clicked on Password Login");
        test.log(Status.INFO, "Clicked on Password Login");
        wb.sendKeys(LoginPageLocator5.passwordLogin, ExcelReader.readCellValue("Raj", "8", "value")); 
        LoggerHandler.info("Sent value in input password");
        test.log(Status.INFO, "Sent value in input password");
        wb.EnterAction(LoginPageLocator5.passwordLogin);
        }

    public static void loginButtonClick(ExtentTest test){
        WebDriverHelper wb = new WebDriverHelper(Base.driver);
        wb.clickAction(LoginPageLocator5.loginButton);
        LoggerHandler.info("Clicked on login button");
        test.log(Status.INFO, "Clicked on login button");
    }

    public static void verifyCredsNotMatch(ExtentTest test){
        try {
            WebDriverHelper wb = new WebDriverHelper(Base.driver);
        String actual = Base.driver.findElement(LoginPageLocator5.credsDontMatch).getText();
        String expected = ExcelReader.readCellValue("Raj", "11", "value");
        // Assert.assertEquals(actual, expected);
        } catch (Exception e) {
            // TODO: handle exception
        }catch(AssertionError e){
            LoggerHandler.error(e.getMessage());
            test.log(Status.FAIL, e.getMessage());

        }
        

    }

    public static void clickOnNewHere(ExtentTest test){
        WebDriverHelper wb = new WebDriverHelper(Base.driver);
        wb.clickAction(LoginPageLocator5.createAccount);
        LoggerHandler.info("Clicked on create account");
        test.log(Status.INFO, "Clicked on create account");
        Screenshot.captureScreenShot("Test Case 6 ss");


    }
    
}
