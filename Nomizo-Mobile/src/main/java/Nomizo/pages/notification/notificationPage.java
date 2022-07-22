package Nomizo.pages.notification;

import Nomizo.base.BasePageObject;
import io.appium.java_client.MobileBy;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;

public class notificationPage extends BasePageObject {

    By notificationHeader(){
        return MobileBy.xpath("(//android.view.View[@content-desc=\"Notifikasi\"])[1]");
    }

    public void clickNotificationHeader(){
        click(notificationHeader());
    }

    public void notificationHeaderAppears(){
        Assertions.assertTrue(find(notificationHeader()).isDisplayed());
    }
}
