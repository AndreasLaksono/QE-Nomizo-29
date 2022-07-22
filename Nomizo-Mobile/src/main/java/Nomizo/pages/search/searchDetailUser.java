package Nomizo.pages.search;

import Nomizo.base.BasePageObject;
import io.appium.java_client.MobileBy;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;

public class searchDetailUser extends BasePageObject {
    By buttonFollowUser(){
        return MobileBy.xpath("(//android.widget.Button[@content-desc=\"Ikuti\"])[2]");
    }

    public void clickButtonFollowUser(){
        click(buttonFollowUser());
    }

    public void buttonFollowUserAppears(){
        Assertions.assertTrue(find(buttonFollowUser()).isDisplayed());
    }
}
