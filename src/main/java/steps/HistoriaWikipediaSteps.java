package steps;

import net.thucydides.core.annotations.Step;
import pageobjects.HistoriaWikipediaPage;

public class HistoriaWikipediaSteps {
    HistoriaWikipediaPage historiaWikipediaPage = new HistoriaWikipediaPage();

    @Step
    public void clickNavegation(){
        historiaWikipediaPage.clickMovil();
        historiaWikipediaPage.clickDeskto();
        historiaWikipediaPage.clickHistory();
        historiaWikipediaPage.clickRadio1();
        historiaWikipediaPage.clickCompare();
    }
    @Step
    public void validation(String string){
        historiaWikipediaPage.setTxtValidation(string);
    }
}
