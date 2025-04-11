package uistore;

import org.openqa.selenium.By;

public class CheckOutPageLocators3 {

    public static By verifySelectAddress = By.xpath("//p[contains(text(),'Select Address')]");
    public static By verifyPriceDetails = By.cssSelector("h1[class='heading mb-0']");
    public static By verifySelectPaymentMethod = By.xpath("//p[contains(text(),'Select Payment Method')]");
    public static By verifyBackToCart = By
            .cssSelector("button[onclick=\"location.href=' https://avoncycles.com/cart.html '\"][type='button']");

}

