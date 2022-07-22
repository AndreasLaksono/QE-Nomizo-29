package Categories;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import Utils.email;
import org.json.simple.JSONObject;

import java.io.FileWriter;
import java.io.IOException;

import static org.hamcrest.Matchers.equalTo;

public class postRegister {

    email Email = new email();

    String email;
    private static String base_url = "https://virtserver.swaggerhub.com/etrnal70/nomizo/1.0.0";

    @Step("I set an endpoint for POST new user")
    public String setPostEndpoint(){
        return base_url + "/register";
    }

    @Step("I set an endpoint for POST new user")
    public String getEmail() {
        return this.email;
    }

    @Step("I request POST detail user")
    public void reqPostDetailUser(String email, String username, String password){
        JSONObject requestData = new JSONObject();
        if (email.equals("mail")){
            this.email = Email.randomEmail();
            try (FileWriter file = new FileWriter("src//test//resources//filejson//email.json")) {
                file.write(this.email);
                file.flush();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        requestData.put("username", username);
        requestData.put("password", password);

        SerenityRest.given().header("Content-Type", "application/json").body(requestData.toJSONString());
        SerenityRest.when().post(setPostEndpoint());
    }

    @Step("I validate the status code")
    public void vaidateStatusCode(String statusCode){
        SerenityRest.then().statusCode(Integer.parseInt(statusCode));
    }

    @Step("validate the data detail after create user")
    public void validateDataDetail(String message){
        if (message.equals("success")){
            SerenityRest.then().body("email", equalTo(this.email));
        } else {
            SerenityRest.then().body("email", equalTo(null));
        }
    }
}
