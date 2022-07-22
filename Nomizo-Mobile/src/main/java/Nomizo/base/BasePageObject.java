package Nomizo.base;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static Nomizo.drivers.AndroidDriverInit.driver;

public class BasePageObject {

    public AndroidDriver<AndroidElement> getDriver(){
        return driver;
    }

    public WebDriverWait onWait(){
        return new WebDriverWait(getDriver(), 60, 5000);
    }

    public AndroidElement find(By locator){
        return (AndroidElement) onWait().until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

    public void click(By locator){
        find(locator).click();
    }

    public boolean isDisplayed(By locator){
        return find(locator).isDisplayed();
    }

    public void clear(By locator){
        find(locator).clear();
    }

    public void enter(By locator){
        find(locator).sendKeys(Keys.ENTER);
    }

    public void sendKeys(By locator, String email){
        find(locator).sendKeys(email);
    }

}
