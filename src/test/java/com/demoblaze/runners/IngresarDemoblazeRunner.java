package com.demoblaze.runners;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        plugin = {"pretty"},
        glue = {"com.demoblaze.steps", "com.demoblaze.hooks"},
        features = "src/test/resources/features/ingresarDemoblaze.feature",
        tags = "@HULOGIN",
        snippets = SnippetType.CAMELCASE
)

public class IngresarDemoblazeRunner {

}
