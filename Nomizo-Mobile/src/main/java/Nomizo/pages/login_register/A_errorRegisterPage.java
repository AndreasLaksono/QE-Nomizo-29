package Nomizo.pages.login_register;

import Nomizo.base.BasePageObject;
import io.appium.java_client.MobileBy;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;

public class A_errorRegisterPage extends BasePageObject {

    By buttonMengertiRegister(){
        return MobileBy.xpath("//android.widget.Button[@content-desc=\"Mengerti\"]");
    }

    public void clickButtonMengertiRegister(){
        click(buttonMengertiRegister());
    }

    public void buttonMengertiRegisterAppears(){
        Assertions.assertTrue(find(buttonMengertiRegister()).isDisplayed());
    }
}
