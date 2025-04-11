package uistore;

import org.openqa.selenium.By;

public class LoginPageLocator5 {

    public static By emailLogin = By.cssSelector("input[placeholder='Email']");
    
    public static By passwordLogin = By.cssSelector("input[placeholder='Password']");

    public static By loginButton = By.cssSelector("[class='default-btn  button button-lg  button-secondary']");

    public static By credsDontMatch = By.cssSelector("span[class='help-block']");

    public static By createAccount = By.cssSelector("a[href='https://avoncycles.com/customer/register.html'][class='link']");

    
}