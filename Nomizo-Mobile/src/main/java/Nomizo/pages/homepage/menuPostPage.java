package Nomizo.pages.homepage;

import Nomizo.base.BasePageObject;
import io.appium.java_client.MobileBy;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;

public class menuPostPage extends BasePageObject {

    By buttonFollowUser(){
        return MobileBy.xpath("//android.view.View[@content-desc=\"Ikuti Pengguna\"]");
    }

    public void clickButtonFollowUser(){
        click(buttonFollowUser());
    }

    public void buttonFollowUserAppears(){
        Assertions.assertTrue(find(buttonFollowUser()).isDisplayed());
    }

    By buttonFollowKategori(){
        return MobileBy.xpath("//android.view.View[@content-desc=\"Ikuti Kategori\"]");
    }

    public void clickButtonFollowKategori(){
        click(buttonFollowKategori());
    }

    public void buttonFollowKategoriAppears(){
        Assertions.assertTrue(find(buttonFollowKategori()).isDisplayed());
    }

    By buttonReport(){
        return MobileBy.xpath("//android.view.View[@content-desc=\"Laporkan\"]");
    }

    public void clickButtonReport(){
        click(buttonReport());
    }

    public void buttonReportAppears(){
        Assertions.assertTrue(find(buttonReport()).isDisplayed());
    }
}
