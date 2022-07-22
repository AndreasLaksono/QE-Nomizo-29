package Nomizo.pages.search;

import Nomizo.base.BasePageObject;
import io.appium.java_client.MobileBy;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;

public class searchDetailKategori extends BasePageObject {

    By buttonFollowKategori(){
        return MobileBy.xpath("(//android.widget.Button[@content-desc=\"Ikuti\"])[4]");
    }

    public void clickButtonFollowKategori(){
        click(buttonFollowKategori());
    }

    public void buttonFollowKategoriAppears(){
        Assertions.assertTrue(find(buttonFollowKategori()).isDisplayed());
    }
}
