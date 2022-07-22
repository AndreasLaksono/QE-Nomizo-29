package Nomizo.pages.login_register;

import Nomizo.base.BasePageObject;
import io.appium.java_client.MobileBy;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;

public class A_registerPage extends BasePageObject {

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

    By confirmationPasswordField(){
        return MobileBy.xpath("//android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.widget.EditText[3]");
    }
    public void confirmationPasswordField(String confirmationPassword){
        click(confirmationPasswordField());
        clear(confirmationPasswordField());
        sendKeys(confirmationPasswordField(), confirmationPassword);
    }
    public void confirmationPasswordFieldAppears(){
        Assertions.assertTrue(find(confirmationPasswordField()).isDisplayed());
    }

    By buttonRegister(){
        return MobileBy.xpath("//android.widget.Button[@content-desc=\"Daftar\"]");
    }
    public void clickButtonRegister(){
        click(buttonRegister());
    }

    public void buttonRegisterAppears(){
        Assertions.assertTrue(find(buttonRegister()).isDisplayed());
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

    By errorMessageConfirmationPassword(){
        return MobileBy.xpath("(//android.view.View[@content-desc=\"* Silahkan memasukkan Password\"])[2]");
    }
    public void errorMessageConfirmationPasswordAppears(){
        Assertions.assertTrue(find(errorMessagePassword()).isDisplayed());
    }

    By buttonLogin(){
        return MobileBy.xpath("//android.widget.Button[@content-desc=\"Masuk\"]");
    }

    public void buttonLoginAppears(){
        Assertions.assertTrue(find(buttonLogin()).isDisplayed());
    }
}
