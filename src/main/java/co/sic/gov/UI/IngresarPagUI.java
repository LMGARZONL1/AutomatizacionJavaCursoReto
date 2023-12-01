package co.sic.gov.UI;

import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class IngresarPagUI {


    public static Target LBL_PROTECCION=Target.the("Sección Protección datos")
            .locatedBy("//a[@title='Protección de datos personales']");



    @FindBy(how = How.XPATH, using = "//a[@title='Protección de datos personales']")
    public static WebElementFacade aProteccion;



    public static Target LIST_MENSAJES=Target.the("Mensajes")
            .locatedBy("//a[@data-parent='#accordion']");


}
