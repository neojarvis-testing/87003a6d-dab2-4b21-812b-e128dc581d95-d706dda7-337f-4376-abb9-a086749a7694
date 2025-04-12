package pages;
 
import org.openqa.selenium.WebDriver;
 
import uistore.CambioProductPageLocators6;
import utils.Base;
import utils.WebDriverHelper;
 
public class CambioProductPageActions6 {
    WebDriver driver=Base.driver;
    WebDriverHelper helper=new WebDriverHelper(driver);
    public void cambioproductpageactions6(){
       
        clickSize();
        hoverProductandClickselect();
    }
    public void clickSize(){
        helper.scrollwindow(1500);
        helper.clickAction(CambioProductPageLocators6.size_26t);
       
    }
    public void hoverProductandClickselect(){
        helper.hoverAction(CambioProductPageLocators6.firstproducthover);
        helper.clickAction(CambioProductPageLocators6.selectoption);
       
    }
}
