package pages;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import uistore.AvonPageLocators6;
import uistore.HomePageLocators6;
import utils.Base;
import utils.WebDriverHelper;

public class HomePageActions6 {
    WebDriver driver=Base.driver;
    WebDriverHelper helper=new WebDriverHelper(driver);
    public void avonactions(){
        verifybrandFooter();
        clickcyclux_navigateBack();
        clickavon();
    }
    public void verifybrandFooter(){
        helper.scrollwindow(10000);
        Assert.assertEquals(helper.getText(HomePageLocators6.cyclebrands), "Cycle's By Brand");
    }
    public void clickcyclux_navigateBack(){
        helper.clickAction(HomePageLocators6.cyclux);
        Assert.assertEquals(driver.getCurrentUrl(), "https://avoncycles.com/brand/cyclux.html");
        driver.navigate().back();
    }
    public void clickavon(){
        helper.scrollwindow(10000);
        helper.clickAction(HomePageLocators6.Avon);
        Assert.assertEquals(driver.getCurrentUrl(), "https://avoncycles.com/brand/avon.html");
    }

    public void Cambioactions(){
        helper.scrollwindow(10000);
        helper.clickAction(HomePageLocators6.cambio);
        helper.switchWindow();
    }
}
