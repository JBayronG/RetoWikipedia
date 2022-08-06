package runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/Features/HistoriaWikipedia.feature",
        glue = "stepdefinitions",
        snippets = SnippetType.CAMELCASE,
        tags = "@Test3"
)
public class HistoriaWikipediaRunner {
}
