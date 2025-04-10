package pages;

import com.aventstack.extentreports.ExtentTest;

import uistore.CartPageLocators3;
import utils.Base;
import utils.Screenshot;
import utils.WebDriverHelper;

public class CheckOutPageActions3 {
     WebDriverHelper helper = new WebDriverHelper(Base.driver);

    // Method to proceed to checkout
    public void checkout(ExtentTest test) {
        helper.clickAction(CartPageLocators3.clickOnCheckOut);
        Screenshot.captureScreenShot("Checkout");
    }

}
