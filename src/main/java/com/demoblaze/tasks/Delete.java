package com.demoblaze.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.targets.Target;

public class Delete implements Task {

	private Target target;

	public Delete(Target target) {
		super();
		this.target = target;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Click.on(target));
	}

	public static Delete theProductOfCart(Target target) {
		return Tasks.instrumented(Delete.class, target);
	}

}
