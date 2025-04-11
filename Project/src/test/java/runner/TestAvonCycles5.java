
package runner;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import pages.AccountRegisterActions5;
import pages.AvonFitnessMachineActions5;
import pages.HomePageActions5;
import pages.LoginPageActions5;
import pages.NewLaunchesActions5;
import pages.TreadMillFirstProductActions5;
import pages.TreadMillsActions5;
import utils.Base;
import utils.Reporter;

public class TestAvonCycles5 extends Base {

    public ExtentTest test;
    public ExtentReports report;

    @BeforeMethod
    public void openBr(){
        openBrowser();
    }

    @BeforeClass
    public void reportConfig(){
        report = Reporter.createReporter("Avon Cycle");
    }

    @Test(enabled = true)
    public void testCase5(){
        test = report.createTest("Test Case 05");
        HomePageActions5.clickOnNewLaunches(test);
        
        NewLaunchesActions5.verifyURL(test);
        
        NewLaunchesActions5.clickOnHeart(test);
        
        LoginPageActions5.verifyUrlLogin(test);
        
        LoginPageActions5.verifyTitleLoginAccount(test);
        
        LoginPageActions5.loginAccountCreds(test);
        
        LoginPageActions5.passwordEnter(test);
        
        LoginPageActions5.loginButtonClick(test);
        
        LoginPageActions5.verifyCredsNotMatch(test);

        LoginPageActions5.passwordEnter(test);
        
        LoginPageActions5.clickOnNewHere(test);
        
        AccountRegisterActions5.verifyAccountRegisterUrl(test);
        
        AccountRegisterActions5.verifyFirstName(test);
        
        AccountRegisterActions5.inputLatName(test);
        
        AccountRegisterActions5.inputEmail(test);
        
        AccountRegisterActions5.inputPhone(test);
        
        AccountRegisterActions5.inputPassword(test);
        
        AccountRegisterActions5.clickOnSignup(test);
        
    }
    
    
    @Test(enabled = true)
    public void testCase6(){

        
        test = report.createTest("Test Case 06");
        HomePageActions5.clickAvonFitnessMachine(test);

        AvonFitnessMachineActions5.verifyAFMurl(test);

        AvonFitnessMachineActions5.closePopUP(test);

        AvonFitnessMachineActions5.domesticGymHover(test);

        AvonFitnessMachineActions5.cardioLineHover(test);

        AvonFitnessMachineActions5.clickTreadmills(test);

        TreadMillsActions5.verifyTreadMillUrl(test);

        TreadMillsActions5.clickOnFirstProduct(test);

        TreadMillFirstProductActions5.clickEnquireNow(test);

        TreadMillFirstProductActions5.inputName(test);

        TreadMillFirstProductActions5.inputEmail(test);

        TreadMillFirstProductActions5.inputNumber(test);

        TreadMillFirstProductActions5.inputCity(test);

        TreadMillFirstProductActions5.clickSubmit(test);
    }

   @AfterClass
   public void repF(){
    report.flush();
   }


    @AfterMethod
    public void killBrowser(){
       driver.quit();
    }
    
}