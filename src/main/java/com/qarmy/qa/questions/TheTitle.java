package com.qarmy.qa.questions;

import com.qarmy.qa.userinterfaces.Products;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class TheTitle implements Question<String> {

    @Override
    public String answeredBy(Actor actor) {
        return Text.of(Products.TITLE).viewedBy(actor).asString();
    }
    public static TheTitle ofTheModule(){
        return new TheTitle();
    }
}
