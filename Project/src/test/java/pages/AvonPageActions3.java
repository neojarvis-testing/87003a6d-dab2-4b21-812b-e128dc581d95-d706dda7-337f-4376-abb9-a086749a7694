package pages;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import uistore.AvonPageLocators3;
import utils.Base;
import utils.LoggerHandler;
import utils.WebDriverHelper;

public class AvonPageActions3 {
    
    WebDriverHelper helper = new WebDriverHelper(Base.driver);

    // Method to sort items by price in ascending order
    public void sortItemsByPriceAscending(ExtentTest test) {
        test.log(Status.INFO,"Browser opened");
        LoggerHandler.info("Browser opened");
        helper.clickAction(AvonPageLocators3.clickOnSort);
        test.log(Status.INFO,"Clicked on sort");
        LoggerHandler.info("Clicked on sort");
        helper.clickAction(AvonPageLocators3.clickPriceAscending);
        test.log(Status.INFO,"Clicked Price Ascending ");
        LoggerHandler.info("Clicked Price Ascending");
    }
    

    // Method to perform comparison of items
    public void compareItems(ExtentTest test) {
        test.log(Status.INFO,"Browser opened");
        LoggerHandler.info("browser opened");
        helper.clickAction(AvonPageLocators3.clickOnCompareIcon);
        test.log(Status.INFO,"clicked compare");
        LoggerHandler.info("Added to compare Success");
    }

    // Method to add an item to the cart
    public void addItemToCart(ExtentTest test) {
        test.log(Status.INFO,"Browser opened");
        LoggerHandler.info("browser opened");
    
        helper.clickAction(AvonPageLocators3.clickOnCartIcon);
        test.log(Status.INFO,"clicked cart");
        LoggerHandler.info("Added to cart");
    }

}
