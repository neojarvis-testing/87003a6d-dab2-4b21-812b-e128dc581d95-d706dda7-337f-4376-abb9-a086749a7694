package runner;

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

public class TestAvonCycles5 extends Base {

    ExtentTest test;
    ExtentReports report;

    @BeforeMethod
    public void openBr(){
        openBrowser();
    }

    @Test(enabled = true)
    public void testCase5(){
        HomePageActions5.clickOnNewLaunches();

        NewLaunchesActions5.verifyURL();

        NewLaunchesActions5.clickOnHeart();

        LoginPageActions5.verifyUrlLogin();

        LoginPageActions5.verifyTitleLoginAccount();

        LoginPageActions5.loginAccountCreds();

        LoginPageActions5.passwordEnter();

        LoginPageActions5.loginButtonClick();

        LoginPageActions5.verifyCredsNotMatch();

        LoginPageActions5.passwordEnter();

        LoginPageActions5.clickOnNewHere();

        AccountRegisterActions5.verifyAccountRegisterUrl();

        AccountRegisterActions5.verifyFirstName();

        AccountRegisterActions5.inputLatName();

        AccountRegisterActions5.inputEmail();

        AccountRegisterActions5.inputPhone();

        AccountRegisterActions5.inputPassword();

        AccountRegisterActions5.clickOnSignup();
        
    }


    @Test(enabled = true)
    public void testCase6(){
        HomePageActions5.clickAvonFitnessMachine();

        // AvonFitnessMachineActions.verifyAFMurl();

        AvonFitnessMachineActions5.closePopUP();

        AvonFitnessMachineActions5.domesticGymHover();

        AvonFitnessMachineActions5.cardioLineHover();

        AvonFitnessMachineActions5.clickTreadmills();

        TreadMillsActions5.verifyTreadMillUrl();

        TreadMillsActions5.clickOnFirstProduct();

        TreadMillFirstProductActions5.clickEnquireNow();

        TreadMillFirstProductActions5.inputName();

        TreadMillFirstProductActions5.inputEmail();

        TreadMillFirstProductActions5.inputNumber();

        TreadMillFirstProductActions5.inputCity();

        TreadMillFirstProductActions5.clickSubmit();
    }

    @AfterMethod
    public void killBrowser(){
       driver.quit();
    }
    
}
