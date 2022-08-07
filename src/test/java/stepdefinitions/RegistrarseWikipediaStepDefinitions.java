package stepdefinitions;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import models.DataBusqueda;
import net.thucydides.core.annotations.Steps;
import steps.RegistrarseWikipediaSteps;

import java.util.Date;
import java.util.List;

public class RegistrarseWikipediaStepDefinitions {

    @Steps
    RegistrarseWikipediaSteps registrarseWikipediaSteps;
    @When("^ingreso a crear una cuenta diligenciando todo los campos$")
    public void ingresoACrearUnaCuentaDiligenciandoTodoLosCampos(List<DataBusqueda> data) {
        registrarseWikipediaSteps.clickCreate();
        registrarseWikipediaSteps.searchName(data.get(0).getTxtName());
        registrarseWikipediaSteps.searchPass(data.get(0).getTxtpass());
        registrarseWikipediaSteps.searchConfPass(data.get(0).getTxtpass());
        registrarseWikipediaSteps.searchEmail(data.get(0).getTxtEmail());
        registrarseWikipediaSteps.searchCaptcha(data.get(0).getTxtCaptche());
        registrarseWikipediaSteps.clickCreate1();
    }


    @Then("^valido de que me salga el mesaje$")
    public void validoDeQueMeSalgaElMesaje(List<DataBusqueda> data) {
        registrarseWikipediaSteps.validation(data.get(0).getTxtTitle());
    }
}
