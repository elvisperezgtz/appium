package com.qarmy.qa.tasks;

import com.qarmy.qa.models.User;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.thucydides.core.annotations.Step;

import static com.qarmy.qa.userinterfaces.LoginUI.*;

public class Login implements Task {
    private User user;

    public Login(User user) {
        this.user = user;
    }

    @Override
    @Step("{0} authenticates with her credentials")
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Enter.theValue(user.getUsername()).into(USERNAME),
                Enter.theValue(user.getPassword()).into(PASSWORD),
                Click.on(LOGIN)
        );
    }

    public static Login withHerCredentials(User user){
        return Tasks.instrumented(Login.class,user);
    }
}
