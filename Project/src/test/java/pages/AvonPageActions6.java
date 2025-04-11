package pages;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import uistore.AvonPageLocators6;
import utils.Base;
import utils.WebDriverHelper;

public class AvonPageActions6 {
    WebDriver driver=Base.driver;
    WebDriverHelper helper=new WebDriverHelper(driver);
    public void avonpageactions6(){
        Assert.assertEquals(helper.getText(AvonPageLocators6.price_filter), "Price");
        helper.clickAction(AvonPageLocators6.review_filter);
        helper.clickAction(AvonPageLocators6.first_review);
        helper.clickAction(AvonPageLocators6.size_filter);
        helper.clickAction(AvonPageLocators6.first_size);
        helper.clickAction(AvonPageLocators6.clear_filter);
        helper.clickAction(AvonPageLocators6.sort_filter);
        helper.clickAction(AvonPageLocators6.first_sort);
        helper.clickAction(AvonPageLocators6.first_product);
        Assert.assertEquals(helper.getText(AvonPageLocators6.addtocart), "add to cart");
    }
}
