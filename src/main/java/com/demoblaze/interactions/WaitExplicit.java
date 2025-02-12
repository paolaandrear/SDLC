package com.demoblaze.interactions;

import net.serenitybdd.markers.IsSilent;
import net.serenitybdd.model.time.InternalSystemClock;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;

public class WaitExplicit implements Interaction, IsSilent {

	private Long seconds;

	public WaitExplicit(Long seconds) {
		super();
		this.seconds = seconds;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		new InternalSystemClock().pauseFor(seconds * 1000);
	}

	public static WaitExplicit forSeconds(Long seconds) {
		return Tasks.instrumented(WaitExplicit.class, seconds);
	}

}
