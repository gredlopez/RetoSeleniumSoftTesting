package com.google.Steps;

import com.google.Model.EsperaExplicitita;
import com.google.Model.EsperaImplicita;
import com.google.PageObjects.PaginaPrincipalPageObject;
import net.thucydides.core.annotations.Step;
import org.hamcrest.Matchers;
import org.junit.Assert;


public class PagnaPrincipalStep {

    EsperaExplicitita esperaExplicitita = new EsperaExplicitita();
    EsperaImplicita esperaImplicita = new EsperaImplicita();
    PaginaPrincipalPageObject paginaPrincipalPageObject = new PaginaPrincipalPageObject();

    @Step
    public void abrirNavegador (){
         paginaPrincipalPageObject.open();
    }

@Step
    public void insertarBusqueda (){
    esperaImplicita.esperaimplicita(3);
    paginaPrincipalPageObject.getDriver().findElement(paginaPrincipalPageObject.getInputgoogle()).
            sendKeys("Test");
}

    @Step
    public void clickEnTxt (){
        paginaPrincipalPageObject.getDriver().findElement(paginaPrincipalPageObject.getClickTxt()).click();
    }




    @Step
    public void clicbBtnBorrar (){
        paginaPrincipalPageObject.getDriver().findElement(paginaPrincipalPageObject.getBtnCerrar()).click();
    }


  @Step
   public void insertarBusquedaDoS (){
      esperaExplicitita.esperaesplicititaTexto(paginaPrincipalPageObject.getDriver(), paginaPrincipalPageObject.getInputgoogle());
      paginaPrincipalPageObject.getDriver().findElement(paginaPrincipalPageObject.getInputgoogle()).
               sendKeys("Test02");
    }



    @Step
    public void validarBusqueda() {
        Assert.assertThat(paginaPrincipalPageObject.getDriver().
                findElement(paginaPrincipalPageObject.getInputgoogle()).isEnabled(), Matchers.is(true));
    }

}





