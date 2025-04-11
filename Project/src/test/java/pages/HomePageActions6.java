package pages;

import org.openqa.selenium.WebDriver;

import uistore.AvonPageLocators6;
import uistore.HomePageLocators6;
import utils.Base;
import utils.WebDriverHelper;

public class HomePageActions6 {
    WebDriver driver=Base.driver;

    WebDriverHelper helper=new WebDriverHelper(driver);
    public void avonactions(){
        helper.scrollwindow(10000);
        helper.clickAction(HomePageLocators6.cyclux);
        driver.navigate().back();
        helper.scrollwindow(10000);
        helper.clickAction(HomePageLocators6.Avon);
        helper.clickAction(AvonPageLocators6.review_filter);
        helper.clickAction(AvonPageLocators6.first_review);
        helper.clickAction(AvonPageLocators6.size_filter);
        helper.clickAction(AvonPageLocators6.first_size);
        helper.clickAction(AvonPageLocators6.clear_filter);
        helper.clickAction(AvonPageLocators6.sort_filter);
        helper.clickAction(AvonPageLocators6.first_sort);
        helper.clickAction(AvonPageLocators6.first_product);
    }
}
