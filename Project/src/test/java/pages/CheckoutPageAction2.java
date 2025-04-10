package pages;

import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import uistore.CheckoutPageLocator2;
import utils.Reporter;
import utils.Screenshot;
import utils.WebDriverHelper;

public class CheckoutPageAction2 {

    private WebDriver driver;
    WebDriverHelper helper;

    public CheckoutPageAction2(WebDriver driver)
    {
        this.driver = driver;
        helper = new WebDriverHelper(this.driver);
    }

    public void fillDetails(ExtentTest test)
    {
        helper.clickAction(CheckoutPageLocator2.firstName);
        helper.sendKeys(CheckoutPageLocator2.firstName, "firstname");

        helper.clickAction(CheckoutPageLocator2.lastName);
        helper.sendKeys(CheckoutPageLocator2.lastName, "lastname");

        helper.clickAction(CheckoutPageLocator2.email);
        helper.sendKeys(CheckoutPageLocator2.email, "demo@email.com");

        helper.clickAction(CheckoutPageLocator2.phone);
        helper.sendKeys(CheckoutPageLocator2.phone, "9876543210");

        helper.clickAction(CheckoutPageLocator2.pincode);
        helper.sendKeys(CheckoutPageLocator2.pincode, "100001");

        helper.clickAction(CheckoutPageLocator2.state);
        helper.sendKeys(CheckoutPageLocator2.state, "State");

        helper.clickAction(CheckoutPageLocator2.city);
        helper.sendKeys(CheckoutPageLocator2.city, "City");

        helper.clickAction(CheckoutPageLocator2.address);
        helper.sendKeys(CheckoutPageLocator2.address, "Address");
    }

    public void applyCoupon(ExtentTest test)
    {
        helper.clickAction(CheckoutPageLocator2.couponInputField);
        helper.sendKeys(CheckoutPageLocator2.couponInputField, "demo");

        helper.clickAction(CheckoutPageLocator2.applyBtn);
    }

    public void clickOnPaymentGateway(ExtentTest test)
    {
        helper.clickAction(CheckoutPageLocator2.paymentGateway);
        Screenshot.captureScreenShot("checkoutpage");
        Reporter.attachScreenshotToReport("checkoutpage", test, "");
    }

    public void clickOnConfirmCheckout(ExtentTest test)
    {
        helper.clickAction(CheckoutPageLocator2.checkOutBtn);
        test.log(Status.PASS, "clicked on confirm Checkout");
    }  
}
