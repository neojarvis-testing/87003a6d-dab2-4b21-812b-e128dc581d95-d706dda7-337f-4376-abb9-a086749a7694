package runner;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pages.HomePageAction1;
import utils.Base;

public class TestRunner1 extends Base{

    @BeforeMethod
    public void initConfig(){
        openBrowser();
    }

    @Test
    public void testCase(){
        HomePageAction1 hpa = new HomePageAction1();
        hpa.hmpageAction();
    }

    @AfterMethod
    public void endConfig(){
    driver.quit();
    }


}
