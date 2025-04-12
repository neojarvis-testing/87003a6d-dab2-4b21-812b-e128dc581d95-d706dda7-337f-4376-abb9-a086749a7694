package pages;

import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import uistore.HomePageLocator2;
import utils.ExcelReader;
import utils.LoggerHandler;
import utils.WebDriverHelper;

public class HomePageAction2 {

    private WebDriver driver;
    WebDriverHelper helper;

    public HomePageAction2(WebDriver driver)
    {
        this.driver = driver;
        helper = new WebDriverHelper(this.driver);
    }

    public void clickOnsearchIcon(ExtentTest test)
    {
        helper.clickAction(HomePageLocator2.searchIcon);
        test.log(Status.INFO, "clicked on search icon on homepage");
        LoggerHandler.info("clicked on search icon on homepage");
    }

    public void SearchForValue(ExtentTest test)
    {
        String value = ExcelReader.readCellValue("Sadique", "searchValue", "value");
        helper.clickAction(HomePageLocator2.searchBar);
        helper.sendKeys(HomePageLocator2.searchBar, value);
        helper.clickAction(HomePageLocator2.searchIcon2);

        test.log(Status.INFO, value + "searched successfully");
        LoggerHandler.info(value  + "searched successfully");

    }
}
