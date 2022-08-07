package stepdefinitions;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import models.DataBusqueda;
import net.thucydides.core.annotations.Steps;
import steps.HistoriaWikipediaSteps;

import java.util.List;

public class HistoriaWikipediaStepDefinitions {

    @Steps
    HistoriaWikipediaSteps historiaWikipediaSteps;
    @When("^cambia la version a movil y mira el historial$")
    public void cambiaLaVersionAMovilYMiraElHistorial() {
        historiaWikipediaSteps.clickNavegation();
    }


    @Then("^validar de que le aprezca el titulo$")
    public void validarDeQueLeAprezcaElTitulo(List<DataBusqueda> data) {
        historiaWikipediaSteps.validation(data.get(0).getTxtTitle());
    }
}
