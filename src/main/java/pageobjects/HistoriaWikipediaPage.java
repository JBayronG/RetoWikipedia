package pageobjects;

import org.openqa.selenium.By;

import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.*;
import static org.junit.Assert.assertEquals;

public class HistoriaWikipediaPage {
    public By clickMovil = By.id("footer-places-mobileview");
    public By clickDeskto= By.id("mw-mf-display-toggle");
    public By clickHistory= By.xpath("//*/div/ul/li/a/span[text()='Ver historial']");
    public By clickRadio1 = By.id("mw-oldid-112968885");
    public By clickCompare = By.cssSelector("#mw-history-compare > div > input");
    public By txtValidation = By.cssSelector("#ooui-php-1 > a > span.oo-ui-labelElement-label");

    public void clickMovil() {
        getDriver().findElement(clickMovil).click();
    }

    public void clickDeskto() {
        getDriver().findElement(clickDeskto).click();
    }

    public void clickHistory() {
        getDriver().findElement(clickHistory).click();
    }

    public void clickRadio1() {
        getDriver().findElement(clickRadio1).click();
    }

    public void clickCompare() {
        getDriver().findElement(clickCompare).click();
    }

    public void setTxtValidation(String string){
        assertEquals(getDriver().findElement(txtValidation).getText(),  string);
    }
}
