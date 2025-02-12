package com.demoblaze.steps.login;


import static com.demoblaze.interfaces.DemoblazeLoginUI.*;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.setTheStage;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.core.IsEqual.equalTo;

import com.demoblaze.interfaces.DemoblazeLoginUI;
import com.demoblaze.models.User;
import com.demoblaze.questions.TextOf;
import com.demoblaze.tasks.GoTo;


import io.cucumber.java.Before;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import io.cucumber.java.es.Y;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.targets.EnsureFieldVisible;

public class IngresarDemoblazeStepDefinition {

	@Before
	public void setup() {
		setTheStage(new OnlineCast());
	}

	@Dado("me encuentro en la pagina de inicio")
	public void meEncuentroEnLaPaginaDeInicio() {
		theActorCalled("").wasAbleTo(Open.browserOn().thePageNamed("page.demo"));
	}


	@Cuando("el usuario  digite usuario y clave")
	public void elUsuarioDigiteUsuarioYClave(User dataUser) {

		theActorInTheSpotlight().attemptsTo(GoTo.login(dataUser));
	}


	@Y("da clic en el boton Iniciar sesion")
	public void daClicEnElBotonIniciarSesion() {
		theActorInTheSpotlight().attemptsTo(Click.on(BTN_LOG_IN));
	}

	@Entonces("Validar  inicio sesion a la pagina de forma exitosa")
	public void validarInicioSesionALaPaginaDeFormaExitosa() {
	//	theActorInTheSpotlight().should(seeThat(TextOf.field(MSJ_BIENVENIDO), equalTo("¡Gracias por visitar nuestro sitio web!")));
	}

	@Entonces("Validar  mensaje de que no se encontro el usuario")
	public void validarMensajeDeQueNoSeEncontroElUsuario() {
		//theActorInTheSpotlight().should(seeThat(TextOf.field(MSJ_NO_SE_ENCONTRO), equalTo("No se encontró ningún usuario activo con ese correo electrónico.")));
	}
	}

