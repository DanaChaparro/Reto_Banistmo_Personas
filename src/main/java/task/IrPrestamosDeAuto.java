package task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;

import static iu.PersonasMenuPrincipalPage.MENU_PRODUCTOS;
import static iu.PersonasMenuPrincipalPage.OPCION_PRESTAMOS;
import static iu.PersonasPrestamosPage.BUTTON_PRESTAMOS_AUTO;

public class IrPrestamosDeAuto implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(MENU_PRODUCTOS),
                Click.on(OPCION_PRESTAMOS),
                Scroll.to(BUTTON_PRESTAMOS_AUTO).andAlignToTop(),
                Click.on(BUTTON_PRESTAMOS_AUTO)
        );
    }

    public static IrPrestamosDeAuto delProductoPrestamosPersonas(){
        return Tasks.instrumented(IrPrestamosDeAuto.class);
    }

}
