package runner;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;


import pages.AvonPageActions3;
import pages.BusinessPageActions3;
import pages.CartPageActions3;
import pages.CheckOutPageActions3;
import pages.HomePageActions3;
import utils.Base;
import utils.Reporter;

public class TestRunner3 extends Base{
    
    public ExtentReports reports;
    public ExtentTest test;

    @BeforeClass
    public void createRep(){
        reports = Reporter.createReporter("AvoncyclesTest_Report");
    }

    @BeforeMethod
    public void browserConfig(){
        openBrowser();
        
    }

    @Test(enabled = true)
    public void testcase3(){
        test = reports.createTest("Testcase 3");
        HomePageActions3 homePageActions = new HomePageActions3();
        AvonPageActions3 avonPageActions = new AvonPageActions3();
        CartPageActions3 cartPageActions = new CartPageActions3();
        CheckOutPageActions3 checkOutActions = new CheckOutPageActions3();
        
        homePageActions.navigateToAvon(test);

        avonPageActions.sortItemsByPriceAscending(test);
        avonPageActions.compareItems(test);
        avonPageActions.addItemToCart(test);

        cartPageActions.increaseItemQuantity(test);
        cartPageActions.deleteItemFromCart(test);

        checkOutActions.checkout(test);


        

    }

    @Test(enabled = true)
    public void testcase4(){
        try {
            test = reports.createTest("Testcase 4");
            HomePageActions3 homePageActions = new HomePageActions3();
            BusinessPageActions3 businessActions = new BusinessPageActions3();
    
            homePageActions.navigateToInternationalBusiness(test);
    
            businessActions.contactForm(test);
            
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    @AfterMethod
    public void closeBrowser(){
        driver.quit();
    }

    @AfterClass
    public void closeRep(){
        reports.flush();

    }

}
