package co.sic.gov.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import static co.sic.gov.UI.IngresarPagUI.LIST_MENSAJES;


public class ValidarMensaje implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {
        return LIST_MENSAJES.resolveFor(actor).isDisplayed();
    }

    public static Question<Boolean> desde(){
        return new ValidarMensaje();
    }
}
