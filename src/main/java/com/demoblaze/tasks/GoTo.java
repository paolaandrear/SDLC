package com.demoblaze.tasks;

import static com.demoblaze.interfaces.DemoblazeLoginUI.BTN_LOG_IN;
import static com.demoblaze.interfaces.DemoblazeLoginUI.PASSWORD;
import static com.demoblaze.interfaces.DemoblazeLoginUI.USER;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.*;

import com.demoblaze.models.User;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;

public class GoTo implements Task {

	private User user;

	public GoTo(User user) {
		this.user = user;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(WaitUntil.the(USER, isClickable()).forNoMoreThan(60).seconds(), Click.on(USER),
				Enter.theValue(user.getUserName()).into(USER), Enter.theValue(user.getPassword()).into(PASSWORD));
				//WaitUntil.the(BTN_LOG_IN, isNotVisible()).forNoMoreThan(60).seconds(),
				//Click.on(BTN_LOG_IN)) ;
	}

	public static GoTo login(User user) {
		return Tasks.instrumented(GoTo.class, user);
	}

}
