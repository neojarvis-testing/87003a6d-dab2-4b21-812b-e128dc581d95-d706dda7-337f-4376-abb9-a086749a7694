package runner;
 
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
 
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
 
import pages.AvonPageActions6;
import pages.CambioCartPageActions6;
import pages.CambioPageActions6;
import pages.CambioProductPageActions6;
import pages.HomePageActions6;
import utils.Base;
import utils.Reporter;
 
public class TestRunner6 extends Base{
    public ExtentReports reports;
    public ExtentTest test;
 
    @BeforeClass
    public void generateReport(){
        reports = Reporter.createReporter("Avon Cycle");
    }
    @BeforeMethod
    public void launchBrowser(){
        openBrowser();
    }
    @Test
    public void avon(){
        test = reports.createTest("Test Case 9");
        HomePageActions6 homePageActions=new HomePageActions6();
        AvonPageActions6 avonpageactions6=new AvonPageActions6();
        homePageActions.avonactions();
        avonpageactions6.avonpageActions6();
    }
    @Test
    public void cambio(){
        test = reports.createTest("Test Case 10");
        HomePageActions6 homePageActions=new HomePageActions6();
        CambioPageActions6 cambioPageActions=new CambioPageActions6();
        CambioProductPageActions6 cambioProductPageActions6=new CambioProductPageActions6();
        CambioCartPageActions6 cambiocartpageActions6=new CambioCartPageActions6();
        homePageActions.Cambioactions();
        cambioPageActions.cambiopageactions();
        cambioProductPageActions6.cambioproductpageactions6();
        cambiocartpageActions6.cambiocartpageactions6();
    }
    @AfterMethod
    public void closeBrowser(){
        driver.quit();
    }
    @AfterClass
    public void closeReport(){
        reports.flush();
    }
 
}