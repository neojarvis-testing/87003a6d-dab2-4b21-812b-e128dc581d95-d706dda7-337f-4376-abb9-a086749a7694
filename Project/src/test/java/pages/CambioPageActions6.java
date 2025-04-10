package pages;

import org.openqa.selenium.WebDriver;

import uistore.CambioCartPageLocators6;
import uistore.CambioPageLocators6;
import uistore.CambioProductPageLocators6;
import uistore.HomePageLocators6;
import utils.Base;
import utils.Screenshot;
import utils.WebDriverHelper;

public class CambioPageActions6 {
    WebDriver driver=Base.driver;

    WebDriverHelper helper=new WebDriverHelper(driver);
     public void Cambioactions(){
        helper.scrollwindow(10000);
        helper.clickAction(HomePageLocators6.cambio);
        helper.switchWindow();
        helper.waitForElementToBeClickable(CambioPageLocators6.bike_hover,10);
        helper.hoverAction(CambioPageLocators6.bike_hover);
        helper.clickAction(CambioPageLocators6.bestseller);
        helper.scrollwindow(1500);
        helper.clickAction(CambioProductPageLocators6.size_26t);
        helper.hoverAction(CambioProductPageLocators6.firstproducthover);
        helper.clickAction(CambioProductPageLocators6.selectoption);
        helper.clickAction(CambioCartPageLocators6.addtocart);
        helper.clickAction(CambioCartPageLocators6.viewcart);
        Screenshot.captureScreenShot("cambiocart");
    }
}
