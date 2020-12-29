package com.qarmy.qa.userinterfaces;


import net.serenitybdd.screenplay.targets.Target;

public class Products {
    public static final Target TITLE = Target.the("title")
            .locatedBy("//android.view.ViewGroup[@content-desc='test-Cart drop zone']/android.view.ViewGroup/android.widget.TextView");
}
