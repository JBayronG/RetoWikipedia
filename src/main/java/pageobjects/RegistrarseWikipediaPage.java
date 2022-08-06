package pageobjects;

import org.openqa.selenium.By;

import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.*;
import static org.junit.Assert.assertEquals;

public class RegistrarseWikipediaPage {
    public By clickCreate = By.id("pt-createaccount");
    public By inputName = By.id("wpName2");
    public By inputPass = By.id("wpPassword2");
    public By inputConfPass= By.id("wpRetype");
    public By inputEmail = By.id("wpEmail");
    public By inputCaptcha = By.id("mw-input-captchaWord");
    public By clickCreate1 = By.id("wpCreateaccount");
    public By txtValidation = By.xpath("//div[text()='Falta el código de confirmación o es incorrecto.']");

    public void clickCreate() {
        getDriver().findElement(clickCreate).click();
    }

    public void setInputName(String string) {
        getDriver().findElement(inputName).sendKeys(string);
    }

    public void setInputPass(String string) {
        getDriver().findElement(inputPass).sendKeys(string);
    }

    public void setInputConfPass(String string) {
        getDriver().findElement(inputConfPass).sendKeys(string);
    }

    public void setInputEmail(String string) {
        getDriver().findElement(inputEmail).sendKeys(string);
    }

    public void setInputCaptcha(String string) {
        getDriver().findElement(inputCaptcha).sendKeys(string);
    }
    public void clickCreate1() {
        getDriver().findElement(clickCreate1).click();
    }

    public void setTxtValidation(String string){
        assertEquals(getDriver().findElement(txtValidation).getText(),string);
    }
}
