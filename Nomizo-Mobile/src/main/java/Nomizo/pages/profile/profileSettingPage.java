package Nomizo.pages.profile;

import Nomizo.base.BasePageObject;
import io.appium.java_client.MobileBy;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;

public class profileSettingPage extends BasePageObject {

    By buttonEditProfile(){
        return MobileBy.xpath("//android.view.View[@content-desc=\"Edit profil\"]");
    }

    public void clickButtonEditProfile(){
        click(buttonEditProfile());
    }

    public void buttonEditProfileAppears(){
        Assertions.assertTrue(find(buttonEditProfile()).isDisplayed());
    }

    By buttonLogout(){
        return MobileBy.xpath("//android.view.View[@content-desc=\"Keluar\"]");
    }

    public void clickButtonLogout(){
        click(buttonLogout());
    }

    public void buttonLogoutAppears(){
        Assertions.assertTrue(find(buttonLogout()).isDisplayed());
    }
}
