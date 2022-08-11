package task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;

import static iu.PersonasSeccionesPage.SECCION_TASAS_Y_TARIFAS;

public class IrTasasTarifas implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Scroll.to(SECCION_TASAS_Y_TARIFAS),
                Click.on(SECCION_TASAS_Y_TARIFAS)
        );
    }

    public static IrTasasTarifas delProductoPersonas(){
        return Tasks.instrumented(IrTasasTarifas.class);
    }

}
