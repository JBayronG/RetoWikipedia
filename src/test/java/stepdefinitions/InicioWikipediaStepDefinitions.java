package stepdefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import net.thucydides.core.annotations.Steps;
import steps.WikipediaStest;

public class InicioWikipediaStepDefinitions {

    @Steps
    WikipediaStest wikipediaStest;

    @Given("^que john ingresa la url de wikipedia$")
    public void queJohnIngresaLaUrlDeWikipedia() {
        wikipediaStest.openBrouser();
    }


    @Then("^valida que le aparezca el titulo de Bienvenida$")
    public void validaQueLeAparezcaElTituloDeBienvenida() {
        wikipediaStest.validationTitle("Bienvenidos");
    }
}
