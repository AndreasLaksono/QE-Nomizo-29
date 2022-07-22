package Nomizo.pages.post;

import Nomizo.base.BasePageObject;
import io.appium.java_client.MobileBy;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;

public class postPage extends BasePageObject {

    By judulDiskusiField(){
        return MobileBy.xpath("//android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.widget.EditText[1]");
    }
    public void judulDiskusiField(String judulDiskusi){
        click(judulDiskusiField());
        clear(judulDiskusiField());
        sendKeys(judulDiskusiField(), judulDiskusi);
    }
    public void judulDiskusiFieldAppears(){
        Assertions.assertTrue(find(judulDiskusiField()).isDisplayed());
    }

    By deskripsiDiskusiField(){
        return MobileBy.xpath("//android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.widget.EditText[2]");
    }
    public void deskripsiDiskusiField(String deskripsiDiskusi){
        click(deskripsiDiskusiField());
        clear(deskripsiDiskusiField());
        sendKeys(deskripsiDiskusiField(), deskripsiDiskusi);
    }
    public void deskripsiDiskusiFieldAppears(){
        Assertions.assertTrue(find(deskripsiDiskusiField()).isDisplayed());
    }

    By buttonPicture(){
        return MobileBy.xpath("//android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.Button[1]");
    }

    public void clickButtonPicture()    {
        click(buttonPicture());
    }

    public void buttonPictureAppears(){
        Assertions.assertTrue(find(buttonPicture()).isDisplayed());
    }

    By buttonPost(){
        return MobileBy.xpath("//android.widget.Button[@content-desc=\"Post\"]");
    }

    public void clickButtonPost()    {
        click(buttonPost());
    }

    public void buttonPostAppears(){
        Assertions.assertTrue(find(buttonPost()).isDisplayed());
    }

    By buttonKategori(){
        return MobileBy.xpath("//android.widget.Button[@content-desc=\"Pilih Kategori\"]");
    }

    public void clickButtonKategori()    {
        click(buttonKategori());
    }

    public void buttonKategoriAppears(){
        Assertions.assertTrue(find(buttonKategori()).isDisplayed());
    }

    By errorMessageJudul(){
        return MobileBy.xpath("//android.view.View[@content-desc=\"Judul Tidak Boleh Kosong\"]");
    }
    public void errorMessageJudulAppears(){
        Assertions.assertTrue(find(errorMessageJudul()).isDisplayed());
    }

    By errorMessageDeskripsi(){
        return MobileBy.xpath("//android.view.View[@content-desc=\"Deskripsi Tidak Boleh Kosong\"]");
    }
    public void errorMessageDeskripsiAppears(){
        Assertions.assertTrue(find(errorMessageDeskripsi()).isDisplayed());
    }
}
