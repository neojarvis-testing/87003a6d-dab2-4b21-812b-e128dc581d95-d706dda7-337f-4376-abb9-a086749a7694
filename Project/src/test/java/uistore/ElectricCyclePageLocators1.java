package uistore;

import org.openqa.selenium.By;

public class ElectricCyclePageLocators1 {

    public static By price = By.cssSelector(  "div[class='accordion-title js-accordion-title']");
    public static By priceClosed = By.cssSelector(  "img[src='https://avoncycles.com/img/icon/listing/price.svg']");
    public static By review = By.cssSelector(  "img[src='https://avoncycles.com/img/icon/listing/review.svg']");
    public static By firstoptionReview = By.cssSelector(  "#radio4");
    public static By size = By.xpath(  "//p[contains(text(),'Size')]");
    public static By firstOptionSize = By.cssSelector(  "#radio8");
    public static By height = By.xpath(  "//p[contains(text(),'Height (in feets)')]");
    public static By firstHeight = By.cssSelector("#radio9");
    public static By age = By.xpath("//p[text()='Age']");
    public static By acceptCookies = By.id("acceptCookies");
    public static By firstAge = By.cssSelector("#radio10");
    public static By colorSwatch = By.cssSelector("img[src='https://avoncycles.com/img/icon/listing/colour.svg']");
    public static By firstValuePrice = By.cssSelector("#radio1");
    public static By clearFilter = By.cssSelector("div[class='filter clear applyFilterButton active']");
    public static By categories = By.cssSelector("a[href='https://avoncycles.com/category']");

   
 
    
}
