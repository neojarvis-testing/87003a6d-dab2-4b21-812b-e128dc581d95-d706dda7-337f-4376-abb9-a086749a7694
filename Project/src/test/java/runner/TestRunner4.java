package runner;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import pages.CareerPageAction4;
import pages.CorporateAnnualReportAction4;
import pages.HistoryPageAction4;
import pages.HomePageFooterAction4;
import pages.HomePageHeaderAction4;
import utils.Base;
import utils.Reporter;

public class TestRunner4 extends Base{

    public ExtentReports reports;
    public ExtentTest test;

    @BeforeClass
    public void generateReport(){
        reports = Reporter.createReporter("Avon Cycle");
    }

    @BeforeMethod
    public void browserSetUp(){
        openBrowser();
    }

    @Test(priority = 1, enabled = true)
    public void testCaseSeven(){
        test = reports.createTest("Test Case 7");
        HomePageHeaderAction4 action = new HomePageHeaderAction4();
        HomePageFooterAction4 action1 = new HomePageFooterAction4();

        action1.methodAwards(test);
        action1.methodBlogs(test);
        action1.methodWarrantyPolicy(test);
        action1.methodTermsandConditions(test);
        action.methodDealerLocator(test);
    }

    @Test(priority = 2, enabled = true)
    public void testCaseEight(){
        test = reports.createTest("Test Case 8");
        CareerPageAction4 action = new CareerPageAction4();
        HomePageFooterAction4 action1 = new HomePageFooterAction4();
        HistoryPageAction4 action2 = new HistoryPageAction4();
        CorporateAnnualReportAction4 action3 = new CorporateAnnualReportAction4();

        action2.methodAboutUs(test);
        action1.methodProduction(test);
        action.methodCareer(test);
        action1.methodLiveAtAvon(test);
        action3.methodCorporate(test);
    }

    @AfterMethod
    public void closeSetUp(){
        driver.quit();
    }

    @AfterClass
    public void closeReport(){
        reports.flush();
    }
    
}
