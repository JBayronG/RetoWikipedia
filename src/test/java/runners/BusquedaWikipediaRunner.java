package runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/Features/BusquedaWikipedia.feature",
        glue = "stepdefinitions",
        snippets = SnippetType.CAMELCASE,
        tags = "@Test1"
)
public class BusquedaWikipediaRunner {
}
