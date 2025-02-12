package com.demoblaze.interfaces;

import net.serenitybdd.screenplay.targets.Target;

public class DemoblazeLoginUI {

	public static final Target USER = Target.the("user").locatedBy("//*[@id=\"email\"]");
	public static final Target PASSWORD = Target.the("password").locatedBy("//*[@id=\"password\"]");
	public static final Target BTN_LOG_IN =
			Target.the("Boton para inciiar sesion").locatedBy("/html/body/main/div/div/div/div/div/form/div[4]/button");
	public static final Target MSJ_BIENVENIDO =
			Target.the("mensaje").locatedBy("//p[contains(text(),'¡Gracias por visitar nuestro sitio web!')]");
	public static final Target MSJ_NO_SE_ENCONTRO =
			Target.the("mensaje").locatedBy("//DIV[contains(text(),'No se encontró ningún usuario activo con ese correo electrónico.')]");


}
