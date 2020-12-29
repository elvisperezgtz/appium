package com.qarmy.qa.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        glue = "com.qarmy.qa.stepdefinitions",
        snippets = SnippetType.CAMELCASE,
        features = "src/test/resources/features/login.feature"
)
public class Login {
}
