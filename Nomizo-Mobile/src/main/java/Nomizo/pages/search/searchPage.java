package Nomizo.pages.search;

import Nomizo.base.BasePageObject;
import io.appium.java_client.MobileBy;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;

public class searchPage extends BasePageObject {

    public By searchField(){
        return MobileBy.xpath("//android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View");
    }

    public void searchField(String search){
        click(searchField());
        clear(searchField());
        enter(searchField());
        sendKeys(searchField(), search);
    }
    public void searchFieldAppears(){
        Assertions.assertTrue(find(searchField()).isDisplayed());
    }

    By buttonCardUser(){
        return MobileBy.xpath("//android.view.View[@content-desc=\"Populer Tab 1 of 4\"]");
    }

    public void clickButtonCardUser(){
        click(buttonCardUser());
    }

    public void buttonCardUserAppears(){
        Assertions.assertTrue(find(buttonCardUser()).isDisplayed());
    }

    By buttonCardKategori(){
        return MobileBy.xpath("//android.widget.ImageView[@content-desc=\"@user_e2c58417 2 Pengikut\"]");
    }

    public void clickButtonCardKategori(){
        click(buttonCardKategori());
    }

    public void buttonCardKategoriAppears(){
        Assertions.assertTrue(find(buttonCardKategori()).isDisplayed());
    }

    By buttonPopuler(){
        return MobileBy.xpath("//android.view.View[@content-desc=\"Populer Tab 1 of 4\"]");
    }

    public void clickButtonPopuler(){
        click(buttonPopuler());
    }

    public void buttonPopulerAppears(){
        Assertions.assertTrue(find(buttonPopuler()).isDisplayed());
    }

    By buttonTerbaru(){
        return MobileBy.xpath("//android.view.View[@content-desc=\"Terbaru Tab 2 of 4\"]");
    }

    public void clickButtonTerbaru(){
        click(buttonTerbaru());
    }

    public void buttonTerbaruAppears(){
        Assertions.assertTrue(find(buttonTerbaru()).isDisplayed());
    }

    By buttonKategori(){
        return MobileBy.xpath("//android.view.View[@content-desc=\"Kategori Tab 3 of 4\"]");
    }

    public void clickButtonKategori(){
        click(buttonKategori());
    }

    public void buttonKategoriAppears(){
        Assertions.assertTrue(find(buttonKategori()).isDisplayed());
    }

    By buttonKreator(){
        return MobileBy.xpath("//android.view.View[@content-desc=\"Kreator Tab 4 of 4\"]");
    }

    public void clickButtonKreator(){
        click(buttonKreator());
    }

    public void buttonKreatorAppears(){
        Assertions.assertTrue(find(buttonKreator()).isDisplayed());
    }

}