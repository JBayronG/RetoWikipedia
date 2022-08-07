package stepdefinitions;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import models.DataBusqueda;
import net.thucydides.core.annotations.Steps;
import steps.BusquedaWikipediaSteps;

import java.util.List;

public class BusquedaWikipediaStepDefinitions {
    @Steps
    BusquedaWikipediaSteps busquedaWikipediaSteps;
    @When("^ingreso la palabra en el buscador$")
    public void ingresoLaPalabraEnElBuscador(List<DataBusqueda> data) {
        busquedaWikipediaSteps.search(data.get(0).getTxtPalabra());
        busquedaWikipediaSteps.clicksearch();
    }


    @Then("^valido de que me salga Analisis CEEM$")
    public void validoDeQueMeSalgaAnalisisCEEM(List<DataBusqueda> data) {
        busquedaWikipediaSteps.validation(data.get(0).getTxtTitle());
    }
}
