package Nomizo.steps;

import Nomizo.pages.homepage.homePage;
import Nomizo.pages.homepage.menuPostPage;
import Nomizo.pages.login_register.A_errorRegisterPage;
import Nomizo.pages.login_register.A_loadingPage;
import Nomizo.pages.login_register.A_loginPage;
import Nomizo.pages.login_register.A_registerPage;
import Nomizo.pages.notification.notificationPage;
import Nomizo.pages.post.detailPostPage;
import Nomizo.pages.post.kategoriPage;
import Nomizo.pages.post.postPage;
import Nomizo.pages.profile.editProfilePage;
import Nomizo.pages.profile.profilePage;
import Nomizo.pages.profile.profileSettingPage;
import Nomizo.pages.profile.searchInProfile;
import Nomizo.pages.search.searchDetailKategori;
import Nomizo.pages.search.searchDetailUser;
import Nomizo.pages.search.searchPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.rest.interactions.Post;

public class nomizoSteps {

    Nomizo.pages.login_register.A_loginPage A_loginPage = new A_loginPage();
    Nomizo.pages.login_register.A_loadingPage A_loadingPage = new A_loadingPage();
    homePage HomePage = new homePage();
    Nomizo.pages.login_register.A_registerPage A_registerPage = new A_registerPage();
    profilePage ProfilePage = new profilePage();
    profileSettingPage ProfileSettingPage = new profileSettingPage();
    editProfilePage EditProfilePage = new editProfilePage();
    searchInProfile SearchInProfile = new searchInProfile();
    menuPostPage MenuPostPage = new menuPostPage();
    searchPage SearchPage = new searchPage();
    Nomizo.pages.search.searchDetailUser SearchDetailUser = new searchDetailUser();
    Nomizo.pages.search.searchDetailKategori SearchDetailKategori = new searchDetailKategori();
    Nomizo.pages.login_register.A_errorRegisterPage A_errorRegisterPage = new A_errorRegisterPage();
    notificationPage NotificationPage = new notificationPage();
    Nomizo.pages.post.postPage PostPage = new postPage();
    Nomizo.pages.post.kategoriPage KategoriPage = new kategoriPage();
    Nomizo.pages.post.detailPostPage DetailPostPage = new detailPostPage();

//LOGIN STEPS
    @Given("I am on loading page")
    public void iAmOnLoadingPage() {
        A_loadingPage.buttonNextAppears();
    }
    @And("I click skip button")
    public void iClickSkipButton() {
        A_loadingPage.clickButtonSkip();
    }
    @When("I input {string} email")
    public void iInputEmail(String arg0) {
        A_loginPage.emailUsernameField(arg0);
    }
    @And("I input {string} password")
    public void iInputPassword(String arg0) {
        A_loginPage.passwordField(arg0);
    }
    @And("I click login button")
    public void iClickLoginButton() {
        A_loginPage.clickButtonLogin();
    }
    @Then("I validate {string} error message login")
    public void iValidateErrorMessage(String arg0) {
        if(arg0.equals("success admin")){
            HomePage.buttonProfileAppears();
        }else if (arg0.equals("success user")){
            HomePage.buttonProfileAppears();
        }else if (arg0.equals("error null all")){
            A_loginPage.errorMessageEmailAppears();
            A_loginPage.errorMessagePasswordAppears();
        }else if (arg0.equals("error null email")){
            A_loginPage.errorMessageEmailAppears();
        }else {
            A_loginPage.errorMessagePasswordAppears();
        }
    }

//REGISTER STEPS
    @And("I click register menu button")
    public void iClickRegisterMenuButton() {
        A_loginPage.clickButtonRegisterMenu();
    }
    @And("I input {string} confirmation password")
    public void iInputConfirmationPassword(String arg0) {
        A_registerPage.confirmationPasswordField(arg0);
    }
    @And("I click register button")
    public void iClickRegisterButton() {
        A_registerPage.clickButtonRegister();
    }
    @Then("I validate {string} error message register")
    public void iValidateErrorMessageRegister(String arg0) {
        if(arg0.equals("success")){
            A_loginPage.buttonLoginAppears();
        }else if (arg0.equals("error null all")){
            A_registerPage.errorMessageEmailAppears();
            A_registerPage.errorMessagePasswordAppears();
            A_registerPage.errorMessageConfirmationPasswordAppears();
        }else if (arg0.equals("error gagal")){
            A_errorRegisterPage.buttonMengertiRegisterAppears();
        }else if (arg0.equals("error null email")){
            A_registerPage.errorMessageEmailAppears();
        }else if (arg0.equals("error null password")){
            A_registerPage.errorMessagePasswordAppears();
        }else {
            A_registerPage.errorMessageConfirmationPasswordAppears();
        }
    }

//PROFILE-Edit Profile
    @And("I click edit profile button")
    public void iClickEditProfileButton(){
        ProfilePage.clickButtonEditProfile();
    }
    @Then("I am on edit profile page")
    public void iAmOnEditProfilePage() {
        EditProfilePage.buttonSaveAppears();
    }
    @And("I input {string} user")
    public void iInputUser(String arg0) {
        EditProfilePage.usernameField(arg0);
    }
    @And("I input {string} full name")
    public void iInputFullName(String arg0) {
        EditProfilePage.fullnameField(arg0);
    }
    @And("I input {string} bio")
    public void iInputBio(String arg0) {
        EditProfilePage.bioField(arg0);
    }
    @And("I click save button profile")
    public void iClickSaveButtonProfile() {
        EditProfilePage.clickButtonSave();
    }
    @And("validate the {string} edit profile")
    public void validateTheEditProfile(String arg0) {
        if(arg0.equals("success")){
            ProfilePage.buttonSettingAppears();
        }else if (arg0.equals("error null username")){
            EditProfilePage.errorMessageUsernameAppears();
        }else if (arg0.equals("error null full name")){
            EditProfilePage.errorMessageFullNameAppears();
        }else if (arg0.equals("error null bio")){
            EditProfilePage.errorMessageBioAppears();
        }else {
            EditProfilePage.errorMessageUsernameAppears();
            EditProfilePage.errorMessageFullNameAppears();
            EditProfilePage.errorMessageBioAppears();
        }
    }

//PROFILE-Populer Post
    @And("I click populer post")
    public void iClickPopulerPost() {
        ProfilePage.clickButtonPopulerPost();
    }
    @And("I validate response after click populer post")
    public void iValidateResponseAfterClickPopulerPost() {
        ProfilePage.buttonPopulerPostAppears();
    }

//PROFILE-Post Terbaru
    @And("I click latest post")
    public void iClickLatestPost() {
        ProfilePage.clickButtonTerbaruPost();
    }
    @And("I validate response after click latest post")
    public void iValidateResponseAfterClickLatestPost() {
        ProfilePage.buttonTerbaruPostAppears();
    }

//PROFILE-Logout
    @Then("I go to profile page")
    public void iGoToProfilePage() {
        HomePage.clickButtonProfile();
    }
    @And("I click setting button")
    public void iClickSettingButton() {
        ProfilePage.clickButtonSetting();
    }
    @And("I click logout button")
    public void iClickLogoutButton() {
        ProfileSettingPage.clickButtonLogout();
    }
    @And("validate the result")
    public void validateTheResult() {
        A_loginPage.buttonLoginAppears();
    }

//FOLLOW USER
    @Then("I am on home page")
    public void iAmOnHomePage() {
        HomePage.buttonHomeAppears();
    }
    @And("I click menu post button")
    public void iClickMenuPostButton() {
        HomePage.clickButtonMenuPost();
    }
    @And("I click follow user button")
    public void iClickFollowUserButton() {
        MenuPostPage.clickButtonFollowUser();
    }
    @And("validate the result follow user")
    public void validateTheResultFollowUser() {
        HomePage.buttonHomeAppears();
    }

//FOLLOW KATEGORI
    @And("I click follow kategori")
    public void iClickFollowKategori() {
        MenuPostPage.clickButtonFollowKategori();
    }
    @And("validate the result follow kategori")
    public void validateTheResultFollowKategori() {
        HomePage.buttonHomeAppears();
    }

//SEARCH BUTTON
    @Then("I click search button")
    public void iClickSearchButton() {
        HomePage.clickButtonSearch();
    }
    @And("I click field search")
    public void iClickFieldSearch() {
        SearchPage.searchField();
    }
    @And("I input {string}")
    public void iInput(String arg0) {
        SearchPage.searchField(arg0);
    }
    @And("I click {string}")
    public void iClick(String arg0) {
        if(arg0.equals("populer")){
            SearchPage.clickButtonPopuler();
            SearchPage.buttonPopulerAppears();
        } else if (arg0.equals("terbaru")){
            SearchPage.clickButtonTerbaru();
            SearchPage.buttonTerbaruAppears();
        } else if (arg0.equals("kategori")){
            SearchPage.clickButtonKategori();
            SearchPage.buttonKategoriAppears();
        }else {
            SearchPage.clickButtonKreator();
            SearchPage.buttonKreatorAppears();
        }
    }
    @And("validate the result search")
    public void validateTheResultSearch() {
        SearchPage.searchFieldAppears();
    }

//NOTIFICATION-View Notification
    @Then("I go to notification page")
    public void iGoToNotificationPage() {
        HomePage.clickButtonNotification();
    }
    @And("I validate response after click notification page")
    public void iValidateResponseAfterClickNotificationPage() {
        NotificationPage.notificationHeaderAppears();
    }

    @And("I click button search in profile")
    public void iClickButtonSearchInProfile() {
        ProfilePage.clickbuttonSearch();
    }

    @And("I input {string} field")
    public void iInputField(String arg0) {
        SearchInProfile.searchField(arg0);
    }

    @And("I validate {string} after search in profile page")
    public void iValidateAfterSearchInProfilePage(String arg0) {
        if(arg0.equals("success")){
            SearchInProfile.errorMessageSearchAppears();
        }else {
            SearchInProfile.errorMessageSearchAppears();
        }
    }

//POST - Create New Post
    @And("I go to post page")
    public void iGoToPostPage() {
        HomePage.clickButtonPost();
    }
    @And("I input {string} judul diskusi")
    public void iInputJudulDiskusi(String arg0) {
        PostPage.judulDiskusiField(arg0);
    }
    @And("I input {string} deskripsi diskusi")
    public void iInputDeskripsiDiskusi(String arg0) {
        PostPage.deskripsiDiskusiField(arg0);
    }
    @And("I chose the kategori")
    public void iChoseTheKategori() {
        PostPage.clickButtonKategori();
        KategoriPage.clickButtonCard();
    }
    @Then("I click post button")
    public void iClickPostButton() {
        PostPage.clickButtonPost();
    }
    @And("validate the {string} after create new post")
    public void validateTheAfterCreateNewPost(String arg0) {
        if(arg0.equals("Success")){
            ProfilePage.buttonSearchAppears();
        } else if (arg0.equals("error null judul")){
            PostPage.errorMessageJudulAppears();
        } else if (arg0.equals("error null deskripsi")){
            PostPage.errorMessageDeskripsiAppears();
        }else {
            PostPage.errorMessageJudulAppears();
            PostPage.errorMessageDeskripsiAppears();
        }
    }

//POST - Create new kategori
    @And("I click kategori button")
    public void iClickKategoriButton() {
        PostPage.clickButtonKategori();
    }
    @And("I click button tambah kategori")
    public void iClickButtonTambahKategori() {
        KategoriPage.clickButtonTambahKategori();
    }
    @Then("I input {string} nama ketegori")
    public void iInputNamaKetegori(String arg0) {
        KategoriPage.namaKategoriField(arg0);
    }
    @And("I input {string} bio ketegori")
    public void iInputBioKetegori(String arg0){
        KategoriPage.bioField(arg0);
    }
    @And("I input {string} rules kategori")
    public void iInputRulesKategori(String arg0) {
        KategoriPage.rulesField(arg0);
    }
    @And("I click save button kategori")
    public void iClickSaveButtonKategori() {
        KategoriPage.clickButtonSave();
    }
    @And("validate the {string} after create new categori")
    public void validateTheAfterCreateNewCategori(String arg0) {
        if(arg0.equals("success")){
            KategoriPage.buttonTambahKategoriAppears();
        } else if (arg0.equals("error null nama")){
            KategoriPage.errorMessageNamaKategoriAppears();
        } else if (arg0.equals("error null bio")){
            KategoriPage.errorMessageBioAppears();
        }else if (arg0.equals("error null result")){
            KategoriPage.errorMessageRulesAppears();
        }else {
            KategoriPage.errorMessageNamaKategoriAppears();
            KategoriPage.errorMessageBioAppears();
            KategoriPage.errorMessageRulesAppears();
        }
    }

//Search - Follow user
    @And("I click user")
    public void iClickUser() {
        SearchPage.clickButtonCardUser();
    }
    @And("I am on user page")
    public void iAmOnUserPage() {
        SearchDetailUser.clickButtonFollowUser();
    }
    @And("I click button follow user")
    public void iClickButtonFollowUser() {
        SearchDetailUser.buttonFollowUserAppears();
    }

//Search - Follow kategori
    @And("I click kategori")
    public void iClickKategori() {
        SearchPage.clickButtonKategori();
    }
    @And("I am on kategori page")
    public void iAmOnKategoriPage() {
        SearchDetailKategori.clickButtonFollowKategori();
    }
    @And("I click button follow kategori")
    public void iClickButtonFollowKategori() {
        SearchDetailKategori.buttonFollowKategoriAppears();
    }

//Post - Send Comment
    @Then("I click post card")
    public void iClickPostCard() {
        HomePage.clickButtonCommentPost();
    }
    @And("I click comment button")
    public void iClickCommentButton() {
        DetailPostPage.komenField();
    }
    @And("I input {string} in comment")
    public void iInputInComment(String arg0) {
        DetailPostPage.komenField(arg0);
    }
    @And("I click send comment button")
    public void iClickSendCommentButton() {
        DetailPostPage.clickButtonSend();
    }
    @And("validate the result after comment")
    public void validateTheResultAfterComment() {
        DetailPostPage.komenFieldAppears();
    }

//Post - Share Post
    @Then("I click share post card button")
    public void iClickSharePostCardButton() {
        HomePage.clickButtonSharePost();
    }

    @And("validate the result after click share button")
    public void validateTheResultAfterClickShareButton() {
        HomePage.buttonSharePostAppears();
    }
}