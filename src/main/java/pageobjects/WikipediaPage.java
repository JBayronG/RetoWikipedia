package pageobjects;

import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getDriver;
import static org.junit.Assert.assertEquals;

@DefaultUrl("https://es.wikipedia.org/wiki/Wikipedia:Portada")
public class WikipediaPage extends PageObject {

    public By txtValidation = By.xpath("//*/div/h1/span/a");

    public void setTxtValidation(String string){
        assertEquals(getDriver().findElement(txtValidation).getText(), string);
    }
}
