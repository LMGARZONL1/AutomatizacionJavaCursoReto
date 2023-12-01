package co.sic.gov.runner;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;


@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/feature/ValidarMensajes.feature",
        glue = "co.sic.gov.stepDefinitions",
        snippets = CucumberOptions.SnippetType.CAMELCASE
)


public class SicRunner {
}
