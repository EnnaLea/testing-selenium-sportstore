package com.sportstore.testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class LoginToProfile extends BaseTest{
    By myAccountLogin = By.id("username");
    By myAccountPassword = By.id("password");
    By loginButton = By.id("login-button");

    @Test
    public void test1_CreateNewProfile(){
        type(myAccountLogin, "Lbianchi");
        type(myAccountPassword, "Passw2");
        click(loginButton);
    }

    private WebElement find(By locator){
        return driver.findElement(locator);
    }

    private void click (By locator){
        find(locator).click();
    }

    private void type(By locator, String text){
        find(locator).sendKeys(text);
    }
}
