package com.banistmo.reto.stepdefinition;

import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import iu.PersonasHomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import questions.NombreDelDocumento;
import task.DescargarDocumentoProhibiciones;
import task.IrPrestamosDeAuto;
import task.IrTasasTarifas;

public class DescargarStepDefinition {

    @Dado("que el {actor} quiere acceder a un prestamo de auto")
    public void queElActorQuiereAccederAUnPrestamoDeAuto(Actor actor) {
        actor.wasAbleTo(
                Open.browserOn().the(PersonasHomePage.class),
                IrPrestamosDeAuto.delProductoPrestamosPersonas()
        );
    }

    @Cuando("va a la seccion de Tasas y tarifas")
    public void vaALaSeccionDeTasasTarifas() {
        OnStage.theActorInTheSpotlight().attemptsTo(
                IrTasasTarifas.delProductoPersonas()
        );
    }

    @Cuando("^descarga el documento (.*)")
    public void descargaElDocumento(String nombreDocumento) {
        OnStage.theActorInTheSpotlight().attemptsTo(
                DescargarDocumentoProhibiciones.pdf()
        );
    }

    @Entonces("deberia ver el documento generado")
    public void deberiaVerElDocumentoGenerado() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(NombreDelDocumento.es("ProhibicionesSuperIntendenciaDeBancosSIB.pdf")));
    }

}
