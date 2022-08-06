package runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/Features/InicioWikipedia.feature",
        glue = "stepdefinitions",
        snippets = SnippetType.CAMELCASE,
        tags = "@Regresion"
)
public class InicioWikipediaRunner {
}
