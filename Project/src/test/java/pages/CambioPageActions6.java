package pages;

import org.openqa.selenium.WebDriver;

import uistore.CambioPageLocators6;
import utils.Base;
import utils.WebDriverHelper;

public class CambioPageActions6 {
    WebDriver driver=Base.driver;
    WebDriverHelper helper=new WebDriverHelper(driver);
    public void cambiopageactions(){
        hoverBike();
        clickbestSeller();
    }
    public void hoverBike(){
        helper.waitForElementToBeClickable(CambioPageLocators6.bike_hover,10);
        helper.hoverAction(CambioPageLocators6.bike_hover);
        
    }
    public void clickbestSeller(){
        helper.clickAction(CambioPageLocators6.bestseller);

    }

}


