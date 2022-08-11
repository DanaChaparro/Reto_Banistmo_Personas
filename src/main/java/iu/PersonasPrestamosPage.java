package iu;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class PersonasPrestamosPage extends PageObject {

    public static final Target BUTTON_PRESTAMOS_AUTO = Target.the("Card de Prestamos de Autos").
            located(By.cssSelector(".leer-mas > [href='/wps/portal/banistmo/personas/productos-y-servicios/prestamos/prestamos-de-auto/']"));

}
