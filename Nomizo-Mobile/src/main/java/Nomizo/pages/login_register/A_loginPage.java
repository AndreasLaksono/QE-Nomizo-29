package Nomizo.pages.login_register;

import Nomizo.base.BasePageObject;
import io.appium.java_client.MobileBy;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;

public class A_loginPage extends BasePageObject {

    By emailUsernameField(){
        return MobileBy.xpath("//android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.widget.EditText[1]");
    }
    public void emailUsernameField(String email){
        click(emailUsernameField());
        clear(emailUsernameField());
        sendKeys(emailUsernameField(), email);
    }
    public void emailUsernameFieldAppears(){
        Assertions.assertTrue(find(emailUsernameField()).isDisplayed());
    }

    By passwordField(){
        return MobileBy.xpath("//android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.widget.EditText[2]");
    }
    public void passwordField(String password){
        click(passwordField());
        clear(passwordField());
        sendKeys(passwordField(), password);
    }
    public void passwordFieldAppears(){
        Assertions.assertTrue(find(passwordField()).isDisplayed());
    }

    By buttonLogin(){
        return MobileBy.xpath("//android.widget.Button[@content-desc=\"Masuk\"]");
    }
    public void clickButtonLogin(){
        click(buttonLogin());
    }

    public void buttonLoginAppears(){
        Assertions.assertTrue(find(buttonLogin()).isDisplayed());
    }

    By buttonRegisterMenu(){
        return MobileBy.xpath("//android.widget.Button[@content-desc=\"Daftar\"]");
    }
    public void clickButtonRegisterMenu(){
        click(buttonRegisterMenu());
    }

    public void buttonRegisterMenuAppears(){
        Assertions.assertTrue(find(buttonRegisterMenu()).isDisplayed());
    }

    By errorMessageEmail(){
        return MobileBy.xpath("//android.view.View[@content-desc=\"* Silahkan memasukkan Email\"]");
    }
    public void errorMessageEmailAppears(){
        Assertions.assertTrue(find(errorMessageEmail()).isDisplayed());
    }

    By errorMessagePassword(){
        return MobileBy.xpath("//android.view.View[@content-desc=\"* Silahkan memasukkan Password\"]");
    }
    public void errorMessagePasswordAppears(){
        Assertions.assertTrue(find(errorMessagePassword()).isDisplayed());
    }

//    By errorMessageGagal(){
//        return MobileBy.xpath("//android.view.View[@content-desc=\"Gagal :(\"]");
//    }

//    public void errorMessageGagalAppears(){
//        Assertions.assertTrue(find(errorMessageGagal()).isDisplayed());
//    }
}

