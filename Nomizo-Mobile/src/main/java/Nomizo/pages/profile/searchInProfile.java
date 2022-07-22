package Nomizo.pages.profile;

import Nomizo.base.BasePageObject;
import io.appium.java_client.MobileBy;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;

public class searchInProfile extends BasePageObject {

    By searchField(){
        return MobileBy.xpath("//android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.EditText");
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

    By errorMessageSearch(){
        return MobileBy.xpath("//android.view.View[@content-desc=\"Pencarian tidak ditemukan\"]");
    }
    public void errorMessageSearchAppears(){
        Assertions.assertTrue(find(errorMessageSearch()).isDisplayed());
    }
}
