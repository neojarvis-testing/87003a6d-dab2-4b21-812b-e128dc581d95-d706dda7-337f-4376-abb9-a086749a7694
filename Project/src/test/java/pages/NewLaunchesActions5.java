package pages;

import org.testng.Assert;

import uistore.NewLaunchesLocator5;
import utils.Base;
import utils.WebDriverHelper;

public class NewLaunchesActions5 {

    public static void verifyURL(){
        String actual = Base.driver.getCurrentUrl();
        String expected = "https://avoncycles.com/category/new-launches.html";
        Assert.assertEquals(actual, expected);
    }
    
   
    public static void clickOnHeart(){
        WebDriverHelper wb = new WebDriverHelper(Base.driver);
        wb.clickAction(NewLaunchesLocator5.heartIcon);
        wb.switchWindow();
    }



}

