package steps;

import net.thucydides.core.annotations.Step;
import pageobjects.WikipediaPage;

public class WikipediaStest {
    WikipediaPage wikipediaPage = new WikipediaPage();

    @Step
    public void openBrouser(){
        wikipediaPage.open();
    }
    @Step
    public void validationTitle(String string){
        wikipediaPage.setTxtValidation(string);
    }
}
