package pages;
 
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
 
import uistore.CambioPageLocators6;
import utils.Base;
import utils.WebDriverHelper;
 
public class CambioPageActions6 {
    WebDriver driver=Base.driver;
    WebDriverHelper helper=new WebDriverHelper(driver);
    public void cambiopageactions(){
        Verifypagetitle_hoverBike();
        clickbestSeller();
    }
    public void Verifypagetitle_hoverBike(){
        // if(helper.getDOMAttribute(CambioPageLocators6.cambiopageverify,"src").contains("cambio")){
        //     Assert.assertTrue(true);
        // }else{
        //     Assert.fail();
        // }
        helper.hoverAction(CambioPageLocators6.bike_hover);
       
    }
    public void clickbestSeller(){
        helper.clickAction(CambioPageLocators6.bestseller);
 
    }
 
}