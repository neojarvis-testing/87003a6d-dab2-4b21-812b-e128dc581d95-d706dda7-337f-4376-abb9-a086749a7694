package uistore;

import org.openqa.selenium.By;

public class CheckoutPageLocator2 {

    public static By firstName = By.name("first_name");
    public static By lastName = By.name("last_name");
    public static By email = By.name("email");
    public static By phone = By.name("phone");
    public static By pincode = By.name("postcode");
    public static By state = By.name("address1");
    public static By city = By.name("address2");
    public static By address = By.name("address3");

    public static By couponInputField = By.id("coupon-value");
    public static By applyBtn = By.id("coupon-button");
    public static By paymentGateway = By.cssSelector("[value='Razorpay']");
    public static By checkOutBtn = By.id("sc_button-form-process");

}
