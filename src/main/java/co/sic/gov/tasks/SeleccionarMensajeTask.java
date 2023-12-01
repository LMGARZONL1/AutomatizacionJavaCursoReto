package co.sic.gov.tasks;

import co.sic.gov.interactions.SelectRandom;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class SeleccionarMensajeTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                SelectRandom.click()
        );

    }


    public static SeleccionarMensajeTask on(){
        return instrumented(SeleccionarMensajeTask.class);
    }
}
