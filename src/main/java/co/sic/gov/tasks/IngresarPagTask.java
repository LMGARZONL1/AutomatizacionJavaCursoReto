package co.sic.gov.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Open;

import static co.sic.gov.UI.IngresarPagUI.LBL_PROTECCION;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class IngresarPagTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Open.url("https://www.sic.gov.co/"),
                Click.on(LBL_PROTECCION)
        );
    }

    public static IngresarPagTask ingresarPagina(){
        return instrumented(IngresarPagTask.class);
    }
}
