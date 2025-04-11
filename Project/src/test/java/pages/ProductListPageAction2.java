package pages;

import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import uistore.ProductListPageLocator2;
import utils.LoggerHandler;
import utils.WebDriverHelper;

public class ProductListPageAction2 {

    private WebDriver driver;
    WebDriverHelper helper;

    public ProductListPageAction2(WebDriver driver)
    {
        this.driver = driver;
        helper = new WebDriverHelper(this.driver);
    }
    
    public void clickOnProduct(ExtentTest test)
    {
        helper.clickAction(ProductListPageLocator2.firstProduct);

        test.log(Status.INFO, "clicked on first product Successfully");
        LoggerHandler.info("clicked on first product successfully");
    }

    public void clickOnBuy(ExtentTest test)
    {
        helper.scrollwindow(200);
        helper.waitForElementToBeVisible(ProductListPageLocator2.BuyNowBtn, 3);
        helper.clickAction(ProductListPageLocator2.BuyNowBtn);

        test.log(Status.INFO, "clicked on Buy Now button successfully");
        LoggerHandler.info("clicked on Buy Now button successfully");
    }
}
