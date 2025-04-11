package runner;
 
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
 
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
 
import pages.CheckoutPageAction2;
import pages.HomePageAction2;
import pages.ProductListPageAction2;
import utils.Base;
import utils.LoggerHandler;
import utils.Reporter;
 
public class TestAvoncycles2 extends Base {
 
    private ExtentReports reports;
    private ExtentTest test;
 
    @BeforeClass
    public void configReport()
    {
        reports = Reporter.createReporter("Avon Cycle");
    }
 
    @BeforeMethod
    public void configBrowser()
    {
        openBrowser();
    }
 
    @Test
    public void TestCaseOne()
    {
        try{
            test = reports.createTest("checkOutPage");
            HomePageAction2 homepage = new HomePageAction2(driver);
            ProductListPageAction2 productlistpage = new ProductListPageAction2(driver);
            CheckoutPageAction2 checkoutpage = new CheckoutPageAction2(driver);
 
            homepage.clickOnsearchIcon(test);
            homepage.SearchForValue(test);
 
            productlistpage.clickOnProduct(test);
            productlistpage.clickOnBuy(test);
 
            checkoutpage.enterFirstName(test);
            checkoutpage.enterLastName(test);
            checkoutpage.enterEmail(test);
            checkoutpage.enterPhone(test);
            checkoutpage.enterPostCode(test);
            checkoutpage.enterState(test);
            checkoutpage.enterCity(test);
            checkoutpage.enterAddress(test);
           
            checkoutpage.applyCoupon(test);
            checkoutpage.clickOnPaymentGateway(test);
            checkoutpage.clickOnConfirmCheckout(test);
        }
        catch(Exception e)
        {
            test.log(Status.FAIL, e.getMessage());
            LoggerHandler.error(e.getMessage());
 
        }
    }
 
    @AfterMethod
    public void freeResources()
    {
        driver.quit();
    }
 
    @AfterClass
    public void flushReport()
    {
        reports.flush();
    }
}