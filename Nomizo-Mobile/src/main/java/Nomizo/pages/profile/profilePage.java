package Nomizo.pages.profile;

import Nomizo.base.BasePageObject;
import io.appium.java_client.MobileBy;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;

public class profilePage extends BasePageObject {

    By buttonSetting(){
        return MobileBy.xpath("//android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.widget.Button[2]");
    }

    public void clickButtonSetting()    {
        click(buttonSetting());
    }

    public void buttonSettingAppears(){
        Assertions.assertTrue(find(buttonSetting()).isDisplayed());
    }

    By buttonEditProfile(){
        return MobileBy.xpath("//android.view.View[@content-desc=\"Edit profil\"]");
    }

    public void clickButtonEditProfile()    {
        click(buttonEditProfile());
    }

    public void buttonEditProfileAppears(){
        Assertions.assertTrue(find(buttonEditProfile()).isDisplayed());
    }

    By buttonPopulerPost(){
        return MobileBy.xpath("//android.view.View[@content-desc=\"Populer\"]");
    }

    public void clickButtonPopulerPost()    {
        click(buttonPopulerPost());
    }

    public void buttonPopulerPostAppears(){
        Assertions.assertTrue(find(buttonPopulerPost()).isDisplayed());
    }

    By buttonTerbaruPost(){
        return MobileBy.xpath("//android.view.View[@content-desc=\"Terbaru\"]");
    }

    public void clickButtonTerbaruPost()    {
        click(buttonTerbaruPost());
    }

    public void buttonTerbaruPostAppears(){
        Assertions.assertTrue(find(buttonTerbaruPost()).isDisplayed());
    }

    By buttonSearch(){
        return MobileBy.xpath("//android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.widget.Button[1]");
    }

    public void clickbuttonSearch(){
        click(buttonSearch());
        clear(buttonSearch());
        enter(buttonSearch());
    }

    public void buttonSearchAppears(){
        Assertions.assertTrue(find(buttonSearch()).isDisplayed());
    }
}
