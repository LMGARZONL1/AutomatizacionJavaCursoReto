package co.sic.gov.stepDefinitions;

import co.sic.gov.questions.ValidarMensaje;
import co.sic.gov.tasks.HabeasTask;
import co.sic.gov.tasks.IngresarPagTask;
import co.sic.gov.tasks.SeleccionarMensajeTask;
import io.cucumber.java.es.*;
import io.cucumber.java.Before;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.hamcrest.Matchers;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.*;

public class ValidarMensajeStepDefinitions {

    @Before
    public void setupActor() {

        setTheStage(new OnlineCast());
    }

    @Dado("que el usuario abre el navegador, ingrese a la pagina")
    public void queElUsuarioAbreElNavegadorIngreseALaPagina() {

        theActorCalled("Usuario").wasAbleTo(
                IngresarPagTask.ingresarPagina()
        );
    }


    @Cuando("el usuario ingrese a  protección de datos y habeas data")
    public void elUsuarioIngreseAProtecciónDeDatosYHabeasData() {
        theActorInTheSpotlight().attemptsTo(
                HabeasTask.habeasData(),
                SeleccionarMensajeTask.on()
        );
    }


    @Entonces("el usuario al momento de dar click sobre un reporte se despliegue la información")
    public void elUsuarioAlMomentoDeDarClickSobreUnReporteSeDespliegueLaInformación() {
        theActorInTheSpotlight().should(seeThat(
                ValidarMensaje.desde(), Matchers.equalTo(true))
        );
    }
}
