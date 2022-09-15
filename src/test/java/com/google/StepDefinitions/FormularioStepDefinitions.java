package com.google.StepDefinitions;

import com.google.Steps.PagnaPrincipalStep;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.thucydides.core.annotations.Steps;

public class FormularioStepDefinitions {


    @Steps
    PagnaPrincipalStep paginaPrincipalStep;

    @Dado("^que el usuario se encuentre en la pagina de google ingrese el texto$")
    public void queElUsuarioSeEncuentreEnLaPaginaDeGoogleIngreseElTexto() {
        paginaPrincipalStep.abrirNavegador();
        paginaPrincipalStep.insertarBusqueda();



    }


    @Cuando("^el usuario diligencia el formulario$")
    public void elUsuarioDiligenciaElFormulario() {
        paginaPrincipalStep.clickEnTxt();
        paginaPrincipalStep.clicbBtnBorrar();
        paginaPrincipalStep.insertarBusquedaDoS();
    }

    @Entonces("^se espera una respuesta de google$")
    public void seEsperaUnaRespuestaDeGoogle() {
    paginaPrincipalStep.validarBusqueda();

    }

}
