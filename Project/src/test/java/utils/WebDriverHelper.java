package utils;

import java.time.Duration;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriverHelper {

    private WebDriver driver;

    /*
     * Descritption: constructor to initialize WebDriver object.
    */
    public WebDriverHelper(WebDriver driver)
    {
        this.driver = driver;
    }

    /*
     * Descritption: Method to perfrom click action on an element.
    */
    public void clickAction(By locator)
    {
        WebElement element = driver.findElement(locator);
        element.click();
    }

    /*
     * Description: Method to perform enter action on an element.
    */
    public void EnterAction(By locator)
    {
        WebElement element = driver.findElement(locator);
        element.sendKeys(Keys.ENTER);
    }

    /*
     * Description: Method to send some string value as input to an input field.
    */
    public void sendKeys(By locator, String key)
    {
        WebElement element = driver.findElement(locator);
        element.sendKeys(key);
    }

    /*
     * Description: Method to perform hover action on an element.
    */
    public void hoverAction(By locator)
    {
        WebElement element = driver.findElement(locator);
        Actions action = new Actions(driver);
        action.moveToElement(element).build().perform();
    }

    /*
     * Description: Method to read the text of an element.
    */
    public String getText(By locator)
    {
        WebElement element = driver.findElement(locator);
        return element.getText();
    }

    /*
     * Description: Method to read the URL of current web page.
    */
    public String getCurrenURL()
    {
        return driver.getCurrentUrl();
    }

    /*
     * Description: Method to read the title of current web page.
    */
    public String getTitle()
    {
        return driver.getTitle();
    }

    /*
     * Description: Method to read the DOM attribute value of an attribute for given element
    */
    public String getDOMAttribute(By locator, String attributeName)
    {
        WebElement element = driver.findElement(locator);
        return element.getDomAttribute(attributeName);
    }

    /*
     * Desscription: Mehthod to wait for an element to be visible for given amount of time.
    */
    public void waitForElementToBeVisible(By locator, int time)
    {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(time));
        wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

    /*
     * Description: Method to wait until element become clickable.
    */
    public void waitForElementToBeClickable(By locator, int time)
    {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(time));
        wait.until(ExpectedConditions.elementToBeClickable(locator));
    }

    /*
     * Description: Method to scroll current window by given amount of pixel.
    */
    public void scrollwindow(int pixel)
    {
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("window.scrollBy(0," + pixel + ")", "");
    }

    /*
     * Description: Method to switch window tab.
    */
    public void switchWindow()
    {
        String parentWindowId = driver.getWindowHandle();
        Set<String> allWindowId = driver.getWindowHandles();

        for(String id : allWindowId)
        {
            if(!id.equals(parentWindowId))
            {
                driver.switchTo().window(id);
                break;
            }
        }
    }
}
