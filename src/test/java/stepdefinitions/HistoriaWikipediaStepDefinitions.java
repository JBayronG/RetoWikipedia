package stepdefinitions;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;
import steps.HistoriaWikipediaSteps;

public class HistoriaWikipediaStepDefinitions {

    @Steps
    HistoriaWikipediaSteps historiaWikipediaSteps;
    @When("^cambia la version a movil y mira el historial$")
    public void cambiaLaVersionAMovilYMiraElHistorial() {
        historiaWikipediaSteps.clickNavegation();
    }


    @Then("^validar de que le aprezca Explorar historial interactivamente$")
    public void validarDeQueLeAprezcaExplorarHistorialInteractivamente() {
        historiaWikipediaSteps.validation("Explorar historial interactivamente");
    }
}
