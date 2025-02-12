package com.demoblaze.tasks;

import com.demoblaze.interactions.ClicOnThe;
import com.demoblaze.interactions.WaitExplicit;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Switch;
import net.serenitybdd.screenplay.targets.Target;

public class SelectThe implements Task {

	private String category;
	private String product;
	private Target[] target;

	public SelectThe(String category, String product, Target... target) {
		super();
		this.category = category;
		this.product = product;
		this.target = target;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(ClicOnThe.option(target[0], category));
		actor.attemptsTo(ClicOnThe.option(target[1], product));
		actor.attemptsTo(Click.on(target[2]), WaitExplicit.forSeconds(2L));
		actor.attemptsTo(Switch.toAlert().andAccept(), Click.on(target[3]));
	}

	public static SelectThe product(String category, String product, Target... target) {
		return Tasks.instrumented(SelectThe.class, category, product, target);
	}

}
