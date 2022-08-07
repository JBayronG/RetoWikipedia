package steps;

import models.DataBusqueda;
import net.thucydides.core.annotations.Step;
import pageobjects.BusquedaWikiPediaPage;

import java.util.List;

public class BusquedaWikipediaSteps {
    BusquedaWikiPediaPage busquedaWikipedia = new BusquedaWikiPediaPage();

    @Step
    public void search(String string){
        busquedaWikipedia.setInputName(string);
    }
    @Step
    public void clicksearch(){
        busquedaWikipedia.clickSearch();
    }

    @Step
    public void validation(String string){
        busquedaWikipedia.setTxtValidation(string);
    }

}
