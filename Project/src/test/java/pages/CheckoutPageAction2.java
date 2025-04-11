package pages;

import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import uistore.CheckoutPageLocator2;
import utils.ExcelReader;
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
        String firstName = ExcelReader.readCellValue("Sheet1", "firstName", "value");
        helper.clickAction(CheckoutPageLocator2.firstName);
        helper.sendKeys(CheckoutPageLocator2.firstName, firstName);

        String lastName = ExcelReader.readCellValue("Sheet1", "lastName", "value");
        helper.clickAction(CheckoutPageLocator2.lastName);
        helper.sendKeys(CheckoutPageLocator2.lastName, lastName);

        String email = ExcelReader.readCellValue("Sheet1", "email", "value");
        helper.clickAction(CheckoutPageLocator2.email);
        helper.sendKeys(CheckoutPageLocator2.email, email);

        String phone = ExcelReader.readCellValue("Sheet1", "phone", "value");
        helper.clickAction(CheckoutPageLocator2.phone);
        helper.sendKeys(CheckoutPageLocator2.phone, phone);

        String postCode = ExcelReader.readCellValue("Sheet1", "postCode", "value");
        helper.clickAction(CheckoutPageLocator2.pincode);
        helper.sendKeys(CheckoutPageLocator2.pincode, postCode);

        String state = ExcelReader.readCellValue("Sheet1", "state", "value");
        helper.clickAction(CheckoutPageLocator2.state);
        helper.sendKeys(CheckoutPageLocator2.state, state);

        String city = ExcelReader.readCellValue("Sheet1", "city", "value");
        helper.clickAction(CheckoutPageLocator2.city);
        helper.sendKeys(CheckoutPageLocator2.city, city);

        String address = ExcelReader.readCellValue("Sheet1", "address", "value");
        helper.clickAction(CheckoutPageLocator2.address);
        helper.sendKeys(CheckoutPageLocator2.address, address);
    }

    public void applyCoupon(ExtentTest test)
    {
        String coupon = ExcelReader.readCellValue("Sheet1", "coupon", "value");
        helper.clickAction(CheckoutPageLocator2.couponInputField);
        helper.sendKeys(CheckoutPageLocator2.couponInputField, coupon);

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
