package task;

import interactions.SwitchWindows;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import static iu.PersonasTasasTarifasPage.DESCARGAR_DOCUMENTO_PDF;

public class DescargarDocumentoProhibiciones implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(DESCARGAR_DOCUMENTO_PDF),
                SwitchWindows.setWindow()
        );
    }

    public static DescargarDocumentoProhibiciones pdf(){
        return Tasks.instrumented(DescargarDocumentoProhibiciones.class);
    }

}
