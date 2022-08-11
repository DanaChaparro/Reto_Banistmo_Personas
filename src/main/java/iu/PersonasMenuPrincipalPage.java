package iu;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class PersonasMenuPrincipalPage extends PageObject {

    public static final Target MENU_PRODUCTOS = Target.the("opción del menú Productos & Servicios").
            located(By.xpath("//div[@id='navbar-collapse-grid']/ul[@class='nav navbar-nav']//a[@href='#']"));
    public static final Target OPCION_PRESTAMOS = Target.the("opción Depósitos").
            located(By.cssSelector("[href='/wps/portal/banistmo/personas/productos-y-servicios/prestamos/']"));

}
