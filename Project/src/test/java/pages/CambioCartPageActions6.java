package pages;
 
import org.openqa.selenium.WebDriver;
 
import uistore.CambioCartPageLocators6;
import uistore.CambioPageLocators6;
import utils.Base;
import utils.Screenshot;
import utils.WebDriverHelper;
 
public class CambioCartPageActions6 {
    WebDriver driver=Base.driver;
    WebDriverHelper helper=new WebDriverHelper(driver);
    public void cambiocartpageactions6(){
        clickCart();
        ViewCart();
    }
    public void clickCart(){
        helper.clickAction(CambioCartPageLocators6.addtocart);
    }
    public void ViewCart(){
        helper.clickAction(CambioCartPageLocators6.viewcart);
        Screenshot.captureScreenShot("cambiocart");
    }
}
