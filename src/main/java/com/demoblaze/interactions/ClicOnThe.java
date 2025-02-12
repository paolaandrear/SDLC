package com.demoblaze.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.targets.Target;

public class ClicOnThe implements Interaction {

	private Target target;
	private String value;

	public ClicOnThe(Target target, String value) {
		super();
		this.target = target;
		this.value = value;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Click.on(target.of(value)));

	}

	public static ClicOnThe option(Target target, String value) {
		return Tasks.instrumented(ClicOnThe.class, target, value);
	}

}
