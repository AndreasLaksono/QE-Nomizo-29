package Nomizo.pages.post;

import Nomizo.base.BasePageObject;
import io.appium.java_client.MobileBy;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;

public class detailPostPage extends BasePageObject {

    public By komenField(){
        return MobileBy.xpath("//android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.EditText");
    }

    public void komenField(String komen){
        click(komenField());
        clear(komenField());
        enter(komenField());
        sendKeys(komenField(), komen);
    }
    public void komenFieldAppears(){
        Assertions.assertTrue(find(komenField()).isDisplayed());
    }

    By buttonSend(){
        return MobileBy.xpath("//android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.Button");
    }

    public void clickButtonSend()    {
        click(buttonSend());
    }

    public void buttonSendAppears(){
        Assertions.assertTrue(find(buttonSend()).isDisplayed());
    }

}
