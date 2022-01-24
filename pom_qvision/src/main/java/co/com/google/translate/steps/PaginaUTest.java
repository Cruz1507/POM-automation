package co.com.google.translate.steps;

import co.com.google.translate.pages.PaginaUTestRegistro;
import net.thucydides.core.annotations.Step;
import org.junit.Assert;


public class PaginaUTest {

    PaginaUTestRegistro paginaUTestRegistro;


    @Step
    public void abrirPaginaUtest(){
        paginaUTestRegistro.open();
    }

    @Step
    public void entrarPrimerNombreNuevoUsusario(String primerNombre) {
        paginaUTestRegistro.clickOnBotonUneteHoy();
        paginaUTestRegistro.entrarPrimerNombreNuevoUsusario(primerNombre);
    }
    @Step
    public void entrarApellidoNuevoUsusario(String apellido) {
        paginaUTestRegistro.entrarApellidoNuevoUsusario(apellido);
    }
    @Step
    public void entrarCorreoNuevoUsusario(String correo){
        paginaUTestRegistro.entrarCorreoNuevoUsuario(correo);
    }
    @Step
    public void entrarMesNuevoUsuario(String mes){
        paginaUTestRegistro.entrarMesNuevoUsuario(mes);
    }
    @Step
    public void entrarDiaNuevoUsuario(String dia){
        paginaUTestRegistro.entrarDiaNuevoUsuario(dia);
    }
    @Step
    public void entrarAnoNuevoUsuario(String ano){
        paginaUTestRegistro.entrarAnoNuevoUsuario(ano);
        paginaUTestRegistro.clickOnBotonSiguienteUbicacion();
    }

    @Step
    public void entrarCiudadNuevoUsuario(String ciudad){
        paginaUTestRegistro.entrarCiudadNuevoUsuario(ciudad);
    }
    @Step
    public void entrarCodigoPostalNuevoUsuario(String codigoPostal){
        paginaUTestRegistro.entrarCodigoPostalNuevoUsuario(codigoPostal);
    }
     @Step
    public void entrarPaisNuevoUsuario(String pais){
        paginaUTestRegistro.entrarPaisNuevoUsuario(pais);
        paginaUTestRegistro.clickOnBotonSiguienteDispositivos();
    }
/*
    @Step
    public void entrarComputadorNuevoUsuario(String computador){

        paginaUTestRegistro.entrarComputadorNuevoUsuario(computador);
    }
    @Step
    public void entrarVersionNuevoUsuario(String version){
        paginaUTestRegistro.entrarVersionNuevoUsuario(version);}

    @Step
    public void entrarLenguajeNuevoUsuario(String lenguaje){

        paginaUTestRegistro.entrarLenguajeNuevoUsuario(lenguaje);


    }
*/

    @Step
    public void entrarContrasenaNuevoUsuario(String contra){
        paginaUTestRegistro.clickOnBotonSiguienteUltimoPaso();
        paginaUTestRegistro.entrarContrasenaNuevoUsuario(contra);
    }

    @Step
    public void entrarDeNuevoContrasenaNuevoUsuario(String contra1){
        paginaUTestRegistro.entrarDeNuevoContrasenaNuevoUsuario(contra1);
        paginaUTestRegistro.clickOnRecuadroTerminosYCondiciones();
        paginaUTestRegistro.clickOnRecuadroPrivacidad();
        paginaUTestRegistro.clickOnBotonConfiguracionCompleta();
    }

    @Step
    public void validarSuNombreEnPantalla(String resultWord){
        Assert.assertEquals(paginaUTestRegistro.mensajeResultanteDeBienvenida(), resultWord);
    }

}
