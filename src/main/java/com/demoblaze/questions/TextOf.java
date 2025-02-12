package com.demoblaze.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.targets.Target;

public class TextOf implements Question<String> {

	private Target field;

	public TextOf(Target field) {
		super();
		this.field = field;
	}

	@Override
	public String answeredBy(Actor actor) {
		return Text.of(field).answeredBy(actor);
	}

	public static TextOf field(Target field) {
		return new TextOf(field);
	}

}
