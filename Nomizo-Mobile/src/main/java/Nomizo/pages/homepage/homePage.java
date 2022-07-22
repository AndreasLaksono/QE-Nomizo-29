package Nomizo.pages.homepage;

import Nomizo.base.BasePageObject;
import io.appium.java_client.MobileBy;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;

public class homePage extends BasePageObject {

    By buttonSharePost(){
        return MobileBy.xpath("//android.widget.ImageView[@content-desc=\"27 jam lalu diposting Sepak Bola Sepak bola adalah olahraga yang memakai kaki 0\"]/android.view.View[5]");
    }

    public void clickButtonSharePost(){
        click(buttonSharePost());
    }

    public void buttonSharePostAppears(){
        Assertions.assertTrue(find(buttonSharePost()).isDisplayed());
    }


    By buttonCommentPost(){
        return MobileBy.xpath("//android.view.View[@content-desc=\"1\"]");
    }

    public void clickButtonCommentPost(){
        click(buttonCommentPost());
    }

    public void buttonCommentPostAppears(){
        Assertions.assertTrue(find(buttonCommentPost()).isDisplayed());
    }

    By buttonHome(){
        return MobileBy.xpath("//android.view.View[@content-desc=\"Beranda\"]");
    }

    public void clickButtonHome(){
        click(buttonHome());
    }

    public void buttonHomeAppears(){
        Assertions.assertTrue(find(buttonHome()).isDisplayed());
    }

    By buttonSearch(){
        return MobileBy.xpath("//android.view.View[@content-desc=\"Cari\"]");
    }

    public void clickButtonSearch(){
        click(buttonSearch());
    }

    public void buttonSearchAppears(){
        Assertions.assertTrue(find(buttonSearch()).isDisplayed());
    }

    By buttonPost(){
        return MobileBy.xpath("//android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[5]");
    }

    public void clickButtonPost(){
        click(buttonPost());
    }

    public void buttonPostAppears(){
        Assertions.assertTrue(find(buttonPost()).isDisplayed());
    }

    By buttonNotification(){
        return MobileBy.xpath("//android.view.View[@content-desc=\"Notifikasi\"]");
    }

    public void clickButtonNotification(){
        click(buttonNotification());
    }

    public void buttonNotificationAppears(){
        Assertions.assertTrue(find(buttonNotification()).isDisplayed());
    }

    By buttonProfile(){
        return MobileBy.xpath("//android.view.View[@content-desc=\"Profil\"]");
    }

    public void clickButtonProfile(){
        click(buttonProfile());
    }

    public void buttonProfileAppears(){
        Assertions.assertTrue(find(buttonProfile()).isDisplayed());
    }

    By buttonMengikuti(){
        return MobileBy.xpath("//android.view.View[@content-desc=\"Mengikuti\"]");
    }

    public void clickButtonMengikuti(){
        click(buttonMengikuti());
    }

    public void buttonMengikutiAppears(){
        Assertions.assertTrue(find(buttonMengikuti()).isDisplayed());
    }

    By buttonRekomendasi(){
        return MobileBy.xpath("//android.view.View[@content-desc=\"Rekomendasi\"]");
    }

    public void clickButtonRekomendasi(){
        click(buttonRekomendasi());
    }

    public void buttonRekomendasiAppears(){
        Assertions.assertTrue(find(buttonRekomendasi()).isDisplayed());
    }

    By buttonMenuPost(){
        return MobileBy.xpath("//android.widget.ImageView[@content-desc=\"26 jam lalu diposting Masjid Cheng Ho bukti nyata rukun dalam beragama dan berbudaya Masjid Cheng Ho bagi orang yang belum pernah mendengar atau mengetahui bahwa bagunan itu adalah masjid, mungkin banyak yang akan mengira bahwa bangunan itu adalah sebuah klenteng atau wihara. Hal ini juga didukung oleh ornamen yang bertuliskan huruf Mandarin yang dipadukan dengan lafadz-lafdz Allah juga, namun sekilas hampir semua bernuansa seperti anda berada di sebuah klenteng. Fokus pertama pada bagian kubah masjid yang berbentuk segi delapan, juga dilengkapi ukiran melingkar yang membentuk lafadz “Allah”. Sementara itu, rangka atap bagian dalam masjid disusun rapi dengan gaya khas rumah Jawa (usuk). Dinding di dalam masjid juga dilengkapi ornamen kaligrafi arab yang semakin membuat masjid ini benar-benar menjadi sangat unik dan istimewa. Jadi di masjid ini ada perpaduan tiga budaya, yaitu budaya Cina, Islam, dan budaya Jawa sendiri, hal ini semakin menambah keunikan dari masjid ini.\"]/android.widget.Button");
    }

    public void clickButtonMenuPost(){
        click(buttonMenuPost());
    }

    public void buttonMenuPostAppears(){
        Assertions.assertTrue(find(buttonMenuPost()).isDisplayed());
    }
}
