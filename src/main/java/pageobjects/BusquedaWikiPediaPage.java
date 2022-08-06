package pageobjects;

import jdk.nashorn.internal.runtime.regexp.joni.Matcher;
import org.junit.Assert;
import org.openqa.selenium.By;

import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.*;
import static org.junit.Assert.assertEquals;

public class BusquedaWikiPediaPage {

    public By inputName = By.id("searchInput");
    public By clickSearch= By.id("searchButton");
    public By txtValidation = By.id("Análisis_CEEM");

    public void setInputName(String string){
        getDriver().findElement(inputName).sendKeys(string);
    }
    public void clickSearch(){
        getDriver().findElement(clickSearch).click();
    }
    public void setTxtValidation(String string){
        assertEquals(getDriver().findElement(txtValidation).getText(), string);
    }
}
