package co.sic.gov.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import static co.sic.gov.UI.HabeasUI.LBL_HABEAS;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class HabeasTask implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(LBL_HABEAS)
        );
    }

    public static HabeasTask habeasData(){
        return instrumented(HabeasTask.class);
    }
}
