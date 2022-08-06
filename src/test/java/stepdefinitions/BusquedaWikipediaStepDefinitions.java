package stepdefinitions;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;
import steps.BusquedaWikipediaSteps;

public class BusquedaWikipediaStepDefinitions {
    @Steps
    BusquedaWikipediaSteps busquedaWikipediaSteps;
    @When("^ingreso la palabra en el buscador$")
    public void ingresoLaPalabraEnElBuscador() {
        busquedaWikipediaSteps.search("Sistemas");
        busquedaWikipediaSteps.clicksearch();
    }


    @Then("^valido de que me salga Analisis CEEM$")
    public void validoDeQueMeSalgaAnalisisCEEM() {
        busquedaWikipediaSteps.validation("Análisis CEEM");
    }
}
