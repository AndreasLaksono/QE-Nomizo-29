package Nomizo.pages.post;

import Nomizo.base.BasePageObject;
import io.appium.java_client.MobileBy;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;

public class kategoriPage extends BasePageObject {

    By namaKategoriField(){
        return MobileBy.xpath("//android.view.View/android.view.View/android.view.View/android.view.View[2]/android.widget.EditText[1]");
    }
    public void namaKategoriField(String namakategori){
        click(namaKategoriField());
        clear(namaKategoriField());
        sendKeys(namaKategoriField(), namakategori);
    }
    public void namaKategoriFieldAppears(){
        Assertions.assertTrue(find(namaKategoriField()).isDisplayed());
    }

    By bioField(){
        return MobileBy.xpath("//android.view.View/android.view.View/android.view.View/android.view.View[2]/android.widget.EditText[2]");
    }
    public void bioField(String bio){
        click(bioField());
        clear(bioField());
        sendKeys(bioField(), bio);
    }
    public void bioFieldAppears(){
        Assertions.assertTrue(find(bioField()).isDisplayed());
    }

    By rulesField(){
        return MobileBy.xpath("//android.view.View/android.view.View/android.view.View/android.view.View[2]/android.widget.EditText[3]");
    }
    public void rulesField(String rules){
        click(rulesField());
        clear(rulesField());
        sendKeys(rulesField(), rules);
    }
    public void rulesFieldAppears(){
        Assertions.assertTrue(find(rulesField()).isDisplayed());
    }

    By buttonCam(){
        return MobileBy.xpath("//android.view.View/android.view.View/android.view.View/android.view.View[2]/android.widget.Button");
    }

    public void clickButtonCam(){
        click(buttonCam());
    }

    public void buttonCamAppears(){
        Assertions.assertTrue(find(buttonCam()).isDisplayed());
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

    By buttonCard(){
        return MobileBy.xpath("//android.widget.ImageView[@content-desc=\"Food 14 Postingan\"]");
    }

    public void clickButtonCard(){
        click(buttonCard());
    }

    public void buttonCardAppears(){
        Assertions.assertTrue(find(buttonCard()).isDisplayed());
    }

    By buttonTambahKategori(){
        return MobileBy.xpath("//android.widget.ImageView[@content-desc=\"Food 14 Postingan\"]");
    }

    public void clickButtonTambahKategori(){
        click(buttonTambahKategori());
    }

    public void buttonTambahKategoriAppears(){
        Assertions.assertTrue(find(buttonTambahKategori()).isDisplayed());
    }

    By errorMessageNamaKategori(){
        return MobileBy.xpath("//android.view.View[@content-desc=\"* Silahkan memasukkan nama kategori\"]");
    }
    public void errorMessageNamaKategoriAppears(){
        Assertions.assertTrue(find(errorMessageNamaKategori()).isDisplayed());
    }

    By errorMessageBio(){
        return MobileBy.xpath("//android.view.View[@content-desc=\"* Silahkan memasukkan Bio kategori\"]");
    }
    public void errorMessageBioAppears(){
        Assertions.assertTrue(find(errorMessageBio()).isDisplayed());
    }

    By errorMessageRules(){
        return MobileBy.xpath("//android.view.View[@content-desc=\"* Silahkan memasukkan aturan kategori\"]");
    }
    public void errorMessageRulesAppears(){
        Assertions.assertTrue(find(errorMessageRules()).isDisplayed());
    }
}
