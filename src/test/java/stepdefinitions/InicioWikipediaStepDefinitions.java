package stepdefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import models.DataBusqueda;
import net.thucydides.core.annotations.Steps;
import steps.WikipediaStest;

import java.util.List;

public class InicioWikipediaStepDefinitions {

    @Steps
    WikipediaStest wikipediaStest;

    @Given("^que john ingresa la url de wikipedia$")
    public void queJohnIngresaLaUrlDeWikipedia() {
        wikipediaStest.openBrouser();
    }


    @Then("^valida que le aparezca el titulo de Bienvenidos$")
    public void validaQueLeAparezcaElTituloDeBienvenidos(List<DataBusqueda> data) {
        wikipediaStest.validationTitle(data.get(0).getTxtTitle());
    }
}
