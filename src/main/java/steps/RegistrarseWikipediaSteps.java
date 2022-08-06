package steps;

import net.thucydides.core.annotations.Step;
import pageobjects.RegistrarseWikipediaPage;

public class RegistrarseWikipediaSteps {
    RegistrarseWikipediaPage registrarseWikipediaPage=new RegistrarseWikipediaPage();

    @Step
    public void clickCreate(){
        registrarseWikipediaPage.clickCreate();
    }
    @Step
    public void searchName(String string){
       registrarseWikipediaPage.setInputName(string);
    }
    @Step
    public void searchPass(String string){
        registrarseWikipediaPage.setInputPass(string);
    }
    @Step
    public void searchConfPass(String string){
        registrarseWikipediaPage.setInputConfPass(string);
    }
    @Step
    public void searchEmail(String string){
        registrarseWikipediaPage.setInputEmail(string);
    }
    @Step
    public void searchCaptcha(String string){
        registrarseWikipediaPage.setInputCaptcha(string);
    }
    @Step
    public void clickCreate1(){
        registrarseWikipediaPage.clickCreate1();
    }
    @Step
    public void validation(String string){
        registrarseWikipediaPage.setTxtValidation(string);
    }
}
