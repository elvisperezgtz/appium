package com.qarmy.qa.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class LoginUI {
    private final static String BASE = "//*";
    public final static Target USERNAME = Target.the("The username field")
            .locatedBy(BASE.concat("[@content-desc='test-Username']"));
    public final static Target PASSWORD = Target.the("The password field")
            .locatedBy(BASE.concat("[@content-desc='test-Password']"));
    public final static Target LOGIN = Target.the("The Login button")
            .locatedBy(BASE.concat("[@content-desc='test-LOGIN']"));

}
