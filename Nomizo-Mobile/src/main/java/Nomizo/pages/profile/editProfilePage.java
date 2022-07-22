package Nomizo.pages.profile;

import Nomizo.base.BasePageObject;
import io.appium.java_client.MobileBy;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;

public class editProfilePage extends BasePageObject {

    By usernameField(){
        return MobileBy.xpath("//android.view.View/android.view.View/android.view.View/android.view.View[2]/android.widget.EditText[1]");
    }
    public void usernameField(String username){
        click(usernameField());
        clear(usernameField());
        sendKeys(usernameField(), username);
    }
    public void usernameFieldAppears(){
        Assertions.assertTrue(find(usernameField()).isDisplayed());
    }

    By fullnameField(){
        return MobileBy.xpath("//android.view.View/android.view.View/android.view.View/android.view.View[2]/android.widget.EditText[2]");
    }
    public void fullnameField(String fullname){
        click(fullnameField());
        clear(fullnameField());
        sendKeys(fullnameField(), fullname);
    }
    public void fullnameFieldAppears(){
        Assertions.assertTrue(find(fullnameField()).isDisplayed());
    }

    By bioField(){
        return MobileBy.xpath("//android.view.View/android.view.View/android.view.View/android.view.View[2]/android.widget.EditText[3]");
    }
    public void bioField(String bio){
        click(bioField());
        clear(bioField());
        sendKeys(bioField(), bio);
    }
    public void bioFieldAppears(){
        Assertions.assertTrue(find(bioField()).isDisplayed());
    }

    By buttonFotoProfile(){
        return MobileBy.xpath("//android.view.View/android.view.View/android.view.View/android.view.View[2]/android.widget.Button");
    }

    public void clickButtonFotoProfile(){
        click(buttonFotoProfile());
    }

    public void buttonFotoProfileAppears(){
        Assertions.assertTrue(find(buttonFotoProfile()).isDisplayed());
    }

    By buttonSave(){
        return MobileBy.xpath("//android.widget.Button[@content-desc=\"Simpan\"]");
    }

    public void clickButtonSave(){
        click(buttonSave());
    }

    public void buttonSaveAppears(){
        Assertions.assertTrue(find(buttonSave()).isDisplayed());
    }

    By errorMessageUsername(){
        return MobileBy.xpath("//android.view.View[@content-desc=\"* Silahkan memasukkan username anda\"]");
    }
    public void errorMessageUsernameAppears(){
        Assertions.assertTrue(find(errorMessageUsername()).isDisplayed());
    }

    By errorMessageFullName(){
        return MobileBy.xpath("//android.view.View[@content-desc=\"* Silahkan memasukkan nama lengkap anda\"]");
    }
    public void errorMessageFullNameAppears(){
        Assertions.assertTrue(find(errorMessageFullName()).isDisplayed());
    }

    By errorMessageBio(){
        return MobileBy.xpath("//android.view.View[@content-desc=\"* Silahkan memasukkan deskripsi anda\"]");
    }
    public void errorMessageBioAppears(){
        Assertions.assertTrue(find(errorMessageBio()).isDisplayed());
    }
}
