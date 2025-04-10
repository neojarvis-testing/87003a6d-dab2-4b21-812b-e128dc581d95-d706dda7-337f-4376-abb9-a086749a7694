package pages;

import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentTest;

import uistore.ProductListPageLocator2;
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
    }

    public void clickOnBuy(ExtentTest test)
    {
        helper.scrollwindow(200);
        helper.waitForElementToBeVisible(ProductListPageLocator2.BuyNowBtn, 3);
        helper.clickAction(ProductListPageLocator2.BuyNowBtn);
    }
}
