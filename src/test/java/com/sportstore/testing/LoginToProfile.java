package com.sportstore.testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class LoginToProfile extends BaseTest{
    By myAccountLogin;
    By myAccountPassword;
    By loginButton;

    @Test
    public void test1_CreateNewProfile(){
        type(myAccountLogin, "administrator");
        type(myAccountPassword, "Admin3");
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
