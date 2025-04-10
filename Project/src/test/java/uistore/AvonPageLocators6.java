package uistore;

import org.openqa.selenium.By;

public class AvonPageLocators6 {
     //avon product
     public static By price_filter=By.cssSelector("#listingAccordion > form > div > div:nth-child(3) > p");
     public static By review_filter=By.cssSelector("#listingAccordion > form > div > div:nth-child(5) > p");
     public static By first_review=By.cssSelector("#listingAccordion > form > div > div:nth-child(6) > ul > li:nth-child(1)");
     public static By size_filter=By.cssSelector("#listingAccordion > form > div > div:nth-child(7)");
     public static By first_size=By.id("radio8");
     public static By Color_Swatches_filter=By.cssSelector("#listingAccordion > form > div > div:nth-child(9)");
     public static By clear_filter=By.cssSelector("[class='clearFilter 22']");
     public static By sort_filter=By.cssSelector("#filter_sort > div > div > button > div > div");
     public static By first_sort=By.cssSelector("#bs-select-1 > ul > li.selected.active");
     public static By first_product=By.xpath("/html/body/div[2]/section[2]/div[1]/div[1]/div[2]/div[2]/div/div[1]/div/div[1]/div/div[1]/a");
     public static By addtocart=By.cssSelector("#buy_block > div.btns-wrapper > div:nth-child(2)");
}
