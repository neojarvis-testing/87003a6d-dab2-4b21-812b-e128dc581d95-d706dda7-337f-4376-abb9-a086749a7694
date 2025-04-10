package runner;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pages.CambioPageActions6;
import pages.HomePageActions6;
import utils.Base;

public class TestRunner6 extends Base{
    @BeforeMethod
    public void launchBrowser(){
        openBrowser();
    }
    @Test
    public void avon(){
        HomePageActions6 homePageActions=new HomePageActions6();
        homePageActions.avonactions();
    }
    @Test
    public void cambio(){
        CambioPageActions6 cambioPageActions=new CambioPageActions6();
        cambioPageActions.Cambioactions();
    }
    @AfterMethod
    public void closeBrowser(){
        driver.quit();
    }

}
