package stepdefinitions;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;
import steps.RegistrarseWikipediaSteps;

public class RegistrarseWikipediaStepDefinitions {

    @Steps
    RegistrarseWikipediaSteps registrarseWikipediaSteps;
    @When("^ingreso a crear una cuenta diligenciando todo los campos$")
    public void ingresoACrearUnaCuentaDiligenciandoTodoLosCampos() {
        registrarseWikipediaSteps.clickCreate();
        registrarseWikipediaSteps.searchName("SALSAu");
        registrarseWikipediaSteps.searchPass("Trouy#192-");
        registrarseWikipediaSteps.searchConfPass("Trouy#192-");
        registrarseWikipediaSteps.searchEmail("saueg233@gmail.com");
        registrarseWikipediaSteps.searchCaptcha("Srtru283i");
        registrarseWikipediaSteps.clickCreate1();
    }


    @Then("^valido de que me salga el mesaje de Falta el codigo de confirmación o es incorrecto\\.$")
    public void validoDeQueMeSalgaElMesajeDeFaltaElCodigoDeConfirmaciónOEsIncorrecto() {
        registrarseWikipediaSteps.validation("Falta el código de confirmación o es incorrecto.");
    }
}
