package iu;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class PersonasSeccionesPage extends PageObject {

    public static final Target SECCION_TASAS_Y_TARIFAS = Target.the("sección Tasas y Tarifas").
            located(By.xpath("//a[.='Tasas y tarifas']"));

}
