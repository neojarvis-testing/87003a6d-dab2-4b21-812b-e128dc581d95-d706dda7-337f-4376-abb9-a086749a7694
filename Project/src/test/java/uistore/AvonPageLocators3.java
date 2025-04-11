package uistore;

import org.openqa.selenium.By;

public class AvonPageLocators3 {

    public static By verifyAvonLabel = By.cssSelector("h1[class='heading mb-0']");

    public static By clickOnSort = By.cssSelector("button[class='btn dropdown-toggle bs-placeholder btn-light']");

    public static By clickPriceAscending = By.cssSelector("a[id='bs-select-1-1']");

    public static By clickOnCompareIcon = By.cssSelector("a[class='d-flex flex-wrap justify-content-center align-items-center'][onclick=\"addToCartAjax('9e59fbc8-3f7b-40b8-bdbb-2c0e82ca5efa','compare','1')\"]");

    public static By clickOnCartIcon = By.cssSelector("a[class='btn'][onclick=\"buyNowAjaxListpage('9e59fbc8-3f7b-40b8-bdbb-2c0e82ca5efa','1', '1')\"]");


}
