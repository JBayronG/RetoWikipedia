package runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/Features/RegistrarseWikipedia.feature",
        glue = "stepdefinitions",
        snippets = SnippetType.CAMELCASE,
        tags = "@Test2"
)
public class RegistrarseWikipediaRunner {
}
