package Nomizo.pages.login_register;

import Nomizo.base.BasePageObject;
import io.appium.java_client.MobileBy;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;

public class A_loadingPage extends BasePageObject {

    By buttonSkip(){
        return MobileBy.xpath("//android.widget.Button[@content-desc=\"Skip\"]");
    }

    public void clickButtonSkip(){
        click(buttonSkip());
    }

    public void buttonSkipAppears(){
        Assertions.assertTrue(find(buttonSkip()).isDisplayed());
    }

    By buttonNext(){
        return MobileBy.xpath("//android.widget.Button[@content-desc=\"Berikutnya\"]");
    }

    public void clickButtonNext(){
        click(buttonNext());
    }

    public void buttonNextAppears(){
        Assertions.assertTrue(find(buttonNext()).isDisplayed());
    }

    By buttonPreviously(){
        return MobileBy.xpath("//android.widget.Button[@content-desc=\"Sebelumnya\"]");
    }

    public void clickButtonPreviously(){
        click(buttonPreviously());
    }

    public void buttonPreviouslyAppears(){
        Assertions.assertTrue(find(buttonPreviously()).isDisplayed());
    }
}
