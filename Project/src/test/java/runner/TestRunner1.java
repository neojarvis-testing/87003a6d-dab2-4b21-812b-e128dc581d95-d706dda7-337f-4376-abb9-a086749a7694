package runner;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import pages.CategoryPageAction1;
import pages.ElectricCyclePageAction1;
import pages.HomePageAction1;
import utils.Base;
import utils.Reporter;

public class TestRunner1 extends Base{

    public ExtentReports reports;
    public ExtentTest test;

    @BeforeClass
    public void reportConfig(){
        reports = Reporter.createReporter("Avon Cycle");
    }

    @BeforeMethod
    public void initConfig(){
        openBrowser();
    }

    @Test
    public void testCase(){
        test = reports.createTest("Test Case 02");
        HomePageAction1 hpa = new HomePageAction1();
        ElectricCyclePageAction1 ecp = new ElectricCyclePageAction1();
        CategoryPageAction1 cpa = new CategoryPageAction1();
        hpa.hoverOnBicycleAndClickOnElectric(test);


        ecp.clickOnPriceAndReview(test);
        ecp.clickOnFirstReviewAndClickOnSize(test);
        ecp.clickOnFirstSizeAndClickOnSize(test);
        ecp.clickOnAcceptCookiesAndFirstHeight(test);
        ecp.clickOnAgeAndFirstAge(test);
        ecp.clickOnColorSwatchAndFirstPrice(test);
        ecp.scrollAndClickClearFilter(test);
        ecp.clickOnCategories(test);


        cpa.categorySelection(test);
    }

    @AfterMethod
    public void endConfig(){
    driver.quit();
    }

    @AfterClass
    public void flushReport(){

        reports.flush();
    }
}
