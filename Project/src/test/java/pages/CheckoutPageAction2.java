package pages;

import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import uistore.CheckoutPageLocator2;
import utils.ExcelReader;
import utils.LoggerHandler;
import utils.WebDriverHelper;

public class CheckoutPageAction2 {

    private WebDriver driver;
    WebDriverHelper helper;

    public CheckoutPageAction2(WebDriver driver)
    {
        this.driver = driver;
        helper = new WebDriverHelper(this.driver);
    }

    public void enterFirstName(ExtentTest test)
    {
        String firstName = ExcelReader.readCellValue("Sadique", "firstName", "value");
        helper.clickAction(CheckoutPageLocator2.firstName);
        helper.sendKeys(CheckoutPageLocator2.firstName, firstName);

        test.log(Status.INFO, "Entered " + firstName + " in First Name field");
        LoggerHandler.info("Entered " + firstName + " in First Name field");
    }


    public void enterLastName(ExtentTest test)
    {
        String lastName = ExcelReader.readCellValue("Sadique", "lastName", "value");
        helper.clickAction(CheckoutPageLocator2.lastName);
        helper.sendKeys(CheckoutPageLocator2.lastName, lastName);

        test.log(Status.INFO, "Entered " + lastName + " in Last Name field");
        LoggerHandler.info("Entered " + lastName + " in Last Name field");
    }

    public void enterEmail(ExtentTest test)
    {
        String email = ExcelReader.readCellValue("Sadique", "email", "value");
        helper.clickAction(CheckoutPageLocator2.email);
        helper.sendKeys(CheckoutPageLocator2.email, email);

        test.log(Status.INFO, "Entered " + email + " in Email field");
        LoggerHandler.info("Entered " + email + " in Email field");
    }

    public void enterPhone(ExtentTest test)
    {
        String phone = ExcelReader.readCellValue("Sadique", "phone", "value");
        helper.clickAction(CheckoutPageLocator2.phone);
        helper.sendKeys(CheckoutPageLocator2.phone, phone);

        test.log(Status.INFO, "Entered " + phone + " in Phone field");
        LoggerHandler.info("Entered " + phone + " in Phone field");
    }

    public void enterPostCode(ExtentTest test)
    {
        String postCode = ExcelReader.readCellValue("Sadique", "postCode", "value");
        helper.clickAction(CheckoutPageLocator2.pincode);
        helper.sendKeys(CheckoutPageLocator2.pincode, postCode);

        test.log(Status.INFO, "Entered " + postCode + " in Post Code field");
        LoggerHandler.info("Entered " + postCode + " in Post Code field");
    }

    public void enterState(ExtentTest test)
    {
        String state = ExcelReader.readCellValue("Sadique", "state", "value");
        helper.clickAction(CheckoutPageLocator2.state);
        helper.sendKeys(CheckoutPageLocator2.state, state);

        test.log(Status.INFO, "Entered " + state + " in State field");
        LoggerHandler.info("Entered " + state + " in State field");
    }

    public void enterCity(ExtentTest test)
    {
        String city = ExcelReader.readCellValue("Sadique", "city", "value");
        helper.clickAction(CheckoutPageLocator2.city);
        helper.sendKeys(CheckoutPageLocator2.city, city);

        test.log(Status.INFO, "Entered " + city + " in City field");
        LoggerHandler.info("Entered " + city + " in City field");
    }

    public void enterAddress(ExtentTest test)
    {
        String address = ExcelReader.readCellValue("Sadique", "address", "value");
        helper.clickAction(CheckoutPageLocator2.address);
        helper.sendKeys(CheckoutPageLocator2.address, address);

        test.log(Status.INFO, "Entered " + address + " in Address field");
        LoggerHandler.info("Entered " + address + " in Address field");
    }

    public void applyCoupon(ExtentTest test)
    {
        String coupon = ExcelReader.readCellValue("Sadique", "coupon", "value");
        helper.clickAction(CheckoutPageLocator2.couponInputField);
        helper.sendKeys(CheckoutPageLocator2.couponInputField, coupon);

        helper.clickAction(CheckoutPageLocator2.applyBtn);

        test.log(Status.INFO, "coupon " + coupon + " applied successfully");
        LoggerHandler.info("coupon " + coupon + " applied successfully");
    }

    public void clickOnPaymentGateway(ExtentTest test)
    {
        helper.clickAction(CheckoutPageLocator2.paymentGateway);

        test.log(Status.INFO, "Payment gateway selected successfully");
        LoggerHandler.info("Payment gateway selected successfully");
    }

    public void clickOnConfirmCheckout(ExtentTest test)
    {
        helper.clickAction(CheckoutPageLocator2.checkOutBtn);

        test.log(Status.INFO, "clicked on confirm checkout button");
        LoggerHandler.info("clicked on confirm checkout button");
    }  
}
