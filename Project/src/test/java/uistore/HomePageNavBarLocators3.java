package uistore;

import org.openqa.selenium.By;

public class HomePageNavBarLocators3 {

    
    public static By hoverCycleByBrand  = By.xpath(("//a[contains(text(),'by brand')]"));
    
    public static By clickAvon  = By.cssSelector(("a[href='https://avoncycles.com/brand/avon.html'][class='dropdown-item']"));

    public static By clickInternationalBusiness = By.cssSelector("a[class='nav-link'][href='https://avoncycles.com/international-business']");

}
