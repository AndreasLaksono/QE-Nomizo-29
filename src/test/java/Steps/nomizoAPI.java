package Steps;

import Categories.postRegister;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class nomizoAPI {

    public String email;
    @Steps
    Categories.postRegister postRegister;

    @Given("I set an endpoint for post new {string}, {string} with {string}")
    public void iSetAnEndpointForPostNewWith(String arg0, String arg1, String arg2) {
        postRegister.reqPostDetailUser(arg0, arg1, arg2);
    }

    @When("I request post detail user")
    public void iRequestPostDetailUser() {
        this.email = postRegister.getEmail();
    }

    @Then("I validate the status code is {string}")
    public void iValidateTheStatusCodeIs(String arg0) {
        postRegister.vaidateStatusCode(arg0);
    }

    @And("validate the {string} after create user")
    public void validateTheAfterCreateUser(String arg0) {
        postRegister.validateDataDetail(arg0);
    }

    @And("get email if {string} for other request")
    public void getEmailIfForOtherRequest(String arg0) {
        postRegister.validateDataDetail(arg0);
    }
}
