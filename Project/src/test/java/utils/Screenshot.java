package utils;
 
import java.io.File;
import java.io.IOException;
 
import java.text.SimpleDateFormat;
import java.util.Date;
 
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
 
import com.google.common.io.Files;
 
 
public class Screenshot {
 
 
    public static TakesScreenshot ts;
 
    /**
     * Author: Ishan
     * Description: This method captures a screenshot of a specific web element on a webpage.
     * @param driver The WebDriver instance used to interact with the web browser.
     * @param locator The locator used to find the web element to be highlighted and captured.
     * @param filename The name for the screenshot file attached with log stamp for uniqueness.
     */
   static public void screenShotAndHighlight(WebDriver driver,By locator,String filename){
        try {
        String timestamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
        String screenshotName = filename + "_" + timestamp + ".png";
        WebElement captureElement =driver.findElement(locator);
        JavascriptExecutor js=(JavascriptExecutor) driver;
        js.executeScript("arguments[0].setAttribute('style', 'border:solid 5px red' );", captureElement);
        Thread.sleep(2000);
        // TakesScreenshot ts=(TakesScreenshot) driver;
        File fs=ts.getScreenshotAs(OutputType.FILE);
        File target=new File(System.getProperty("user.dir")+"/screenshots");
        if(!target.exists()){
            target.mkdirs();
        }
        FileHandler.copy(fs, new File(target.toString()+screenshotName ));
        } catch (IOException e) {
            e.printStackTrace();
        }catch(InterruptedException e){
          e.printStackTrace();
        }
    }
 
 
 
 
 
    /**
     * Author: Ishan
     * Description: Captures a screenshot of the current browser state and saves it with the specified filename in the "screenshots" directory.
     * @param filename Base name for the screenshot file (a timestamp will be appended to create the full file name).
     */
    public static void captureScreenShot(String filename) {
        String timestamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
        String name = filename + timestamp + ".png";
        ts = (TakesScreenshot) Base.driver;
        File file = ts.getScreenshotAs(OutputType.FILE);
 
        // Create the screenshots directory if it doesn't exist
        File screenshotsDir = new File(System.getProperty("user.dir") + "/screenshots");
        if (!screenshotsDir.exists()) {
            screenshotsDir.mkdirs();
        }
 
        File target = new File(screenshotsDir, name);
        try {
            Files.copy(file, target);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
 
 
}
 
 