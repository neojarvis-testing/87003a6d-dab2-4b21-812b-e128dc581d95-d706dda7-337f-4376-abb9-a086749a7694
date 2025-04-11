package pages;
 
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
 
import uistore.CartPageLocators3;
import utils.Base;
import utils.LoggerHandler;
import utils.WebDriverHelper;
 
public class CartPageActions3 {
    WebDriverHelper helper = new WebDriverHelper(Base.driver);
 
    // Method to increase item quantity in the cart
    public void increaseItemQuantity(ExtentTest test) {
        try {
            helper.clickAction(CartPageLocators3.clickOnPlusIcon);
            test.log(Status.INFO, "Clicked plus icon");
            LoggerHandler.info("Clicked plus icon");
           
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
 
    // Method to delete an item from the cart
    public void deleteItemFromCart(ExtentTest test) {
        try {
            helper.clickAction(CartPageLocators3.clickOnDeleteIcon);
            test.log(Status.INFO, "clicked delete icon");
            LoggerHandler.info("clicked delete icon");
            Base.driver.switchTo().alert().dismiss();
           
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
 
}