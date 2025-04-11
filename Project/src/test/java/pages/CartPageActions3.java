package pages;

import com.aventstack.extentreports.ExtentTest;

import uistore.CartPageLocators3;
import utils.Base;
import utils.WebDriverHelper;

public class CartPageActions3 {
    WebDriverHelper helper = new WebDriverHelper(Base.driver);

    // Method to increase item quantity in the cart
    public void increaseItemQuantity(ExtentTest test) {
        helper.clickAction(CartPageLocators3.clickOnPlusIcon);
    }

    // Method to delete an item from the cart
    public void deleteItemFromCart(ExtentTest test) {
        helper.clickAction(CartPageLocators3.clickOnDeleteIcon);
        Base.driver.switchTo().alert().dismiss();
    }

}
