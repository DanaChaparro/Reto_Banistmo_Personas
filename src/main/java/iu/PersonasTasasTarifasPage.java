package iu;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class PersonasTasasTarifasPage extends PageObject {

    public static final Target DESCARGAR_DOCUMENTO_PDF = Target.the("descargar PDF").
            located(By.xpath("//div[@class='tab-pane active']//tr[2]//img[@alt='Descargar PDF']"));

}
