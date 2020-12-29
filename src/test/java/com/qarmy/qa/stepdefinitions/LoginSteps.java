package com.qarmy.qa.stepdefinitions;

import com.qarmy.qa.models.User;
import com.qarmy.qa.questions.TheTitle;
import com.qarmy.qa.tasks.Login;
import com.qarmy.qa.utils.drivers.MyAndroidDriver;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.appium.java_client.AppiumDriver;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.actors.Stage;
import net.thucydides.core.annotations.Managed;
import org.hamcrest.Matchers;

import java.net.MalformedURLException;
import java.util.List;

public class LoginSteps {
    private Actor james = Actor.named("James");
    @Managed
    private AppiumDriver herMobileDriver;

    @Before
    public void beforeTest() {
        Stage stage = OnStage.setTheStage(new OnlineCast());
        OnStage.theActorCalled(james.getName());
    }

    @Given("He has the app open")
    public void heHasTheAppOpen() throws MalformedURLException {
        james.can(BrowseTheWeb.with(MyAndroidDriver.hisAndroidDriver().enLaApp()));

    }


    @When("He logs into the app with her credentials")
    public void heLogsIntoTheAppWithHerCredentials(List<User> users) {

        james.attemptsTo(
                 Login.withHerCredentials(users.get(0))
        );
    }


    @Then("^He should be able to see the title (.*)$")
    public void heShouldBeAbleToSeeTheTitle(String title) {
        james.should(GivenWhenThen.seeThat(TheTitle.ofTheModule(), Matchers.is(title)));
    }
}
