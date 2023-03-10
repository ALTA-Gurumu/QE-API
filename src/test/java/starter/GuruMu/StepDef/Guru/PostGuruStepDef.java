package starter.GuruMu.StepDef.Guru;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Steps;
import starter.GuruMu.GuruAPI;
import starter.GuruMu.Utils.Constant;
import starter.GuruMu.Utils.Payload;

import java.io.File;

import static org.hamcrest.CoreMatchers.equalTo;

public class PostGuruStepDef {
    @Steps
    GuruAPI guruAPI;

    Payload payload = new Payload();

    @Given("Add guru with valid json")
    public void addGuruWithValidJson() {
        File json = new File(Constant.JSON_REQUEST + "/Guru/AddGuru.json");
        guruAPI.postGuru(json);
    }

    @Given("Add guru with invalid json")
    public void addGuruWithInvalidJson() {
        File json = new File(Constant.JSON_REQUEST + "/Guru/AddInvalidGuru.json");
        guruAPI.postGuru(json);
    }

    @When("Post guru request")
    public void postGuruRequest() {
        SerenityRest.when().post(GuruAPI.POST_GURU);
    }

    @And("Response body data nama should contain {string}")
    public void responseBodyDataNamaShouldContain(String name) {
        SerenityRest.then()
                .body(Constant.DATA_NAMA, equalTo(name));
    }

    @Given("Add guru with {string} as nama, {string} as email, and {string} as password")
    public void addGuruWithAsNamaAsEmailAndAsPassword(String nama, String email, String password) {
        guruAPI.postGuru(payload.bodyRequestRegister(nama, email, password));
    }
}
