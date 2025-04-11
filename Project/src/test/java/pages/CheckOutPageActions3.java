package pages;
 
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
 
import uistore.CartPageLocators3;
import utils.Base;
import utils.LoggerHandler;
import utils.Screenshot;
import utils.WebDriverHelper;
 
public class CheckOutPageActions3 {
     WebDriverHelper helper = new WebDriverHelper(Base.driver);
 
    // Method to proceed to checkout
    public void checkout(ExtentTest test) {
        try {
            helper.clickAction(CartPageLocators3.clickOnCheckOut);
            test.log(Status.INFO,"clicked on checkout");
            LoggerHandler.info("clicked on checkout");
 
            Screenshot.captureScreenShot("Checkout");
 
 
 
           
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
 
}