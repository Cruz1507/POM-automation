package co.com.google.translate.stepdefinitions;

import co.com.google.translate.steps.PaginaUTest;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;



public class UTestRegistroStepDefinitions {

    @Steps
    PaginaUTest iniciosesion;

    @Given("que Mariana se encuentra en la pagina web de Utest")
    public void UsuarioQuiereIngresarPagina(){
      iniciosesion.abrirPaginaUtest();
    }

    @When("realice el registro de un nuevo usuario con el primer nombre {string}")
    public void RegistroNuevoUsuarioPrimerNombre(String primerNombre){

        iniciosesion.entrarPrimerNombreNuevoUsusario(primerNombre);
    }
    @When("realice el registro de un nuevo usuario con el Apellido {string}")
    public void RegistroNuevoUsuarioApellido(String apellido){

        iniciosesion.entrarApellidoNuevoUsusario(apellido);
    }
    @When("realice el registro de un nuevo usuario con el Correo {string}")
    public void RegistroNuevoUsuarioCorreo(String correo){

        iniciosesion.entrarCorreoNuevoUsusario(correo);
    }
    @When("realice el registro de un nuevo usuario con el Mes de Nacimiento {string}")
    public void RegistroNuevoUsuarioMes(String mes){

        iniciosesion.entrarMesNuevoUsuario(mes);
    }
    @When("realice el registro de un nuevo usuario con el Día de Nacimiento {string}")
    public void RegistroNuevoUsuarioDia(String dia){

        iniciosesion.entrarDiaNuevoUsuario(dia);
    }
    @When("realice el registro de un nuevo usuario con el Año de Nacimiento {string}")
    public void RegistroNuevoUsuarioAno(String ano){

        iniciosesion.entrarAnoNuevoUsuario(ano);
    }
    @When("realice el registro de un nuevo usuario con la ciudad {string}")
    public void RegistroNuevoUsuarioCiudad(String ciudad){

        iniciosesion.entrarCiudadNuevoUsuario(ciudad);
    }
    @When("realice el registro de un nuevo usuario con el Código Postal {string}")
    public void RegistroNuevoUsuarioCodigoPostal(String codigoPostal){

        iniciosesion.entrarCodigoPostalNuevoUsuario(codigoPostal);
    }
   @When("realice el registro de un nuevo usuario con el Pais {string}")
    public void RegistroNuevoUsuarioPais(String pais){
        iniciosesion.entrarPaisNuevoUsuario(pais);}

   /* @When("realice el registro de un nuevo usuario con el Computador {string}")
    public void RegistroNuevoUsuarioComputador(String computador){

        iniciosesion.entrarComputadorNuevoUsuario(computador);
    }
    @When("realice el registro de un nuevo usuario con la Version {string}")
    public void RegistroNuevoUsuarioVersion(String version){

        iniciosesion.entrarVersionNuevoUsuario(version);
    }
   @When("realice el registro de un nuevo usuario con el lenguaje {string}")
    public void RegistroNuevoUsuarioLenguaje(String lenguaje){

        iniciosesion.entrarLenguajeNuevoUsuario(lenguaje);
    }

*/
    @When("Cree una contraseña {string}")
    public void RegistroNuevoUsusarioContra(String contra){

        iniciosesion.entrarContrasenaNuevoUsuario(contra);
    }

    @When("Cree una contraseña1 {string} y acepte las políticas de datos")
    public void RegistroNuevoUsusarioContra1(String contra1){

        iniciosesion.entrarDeNuevoContrasenaNuevoUsuario(contra1);
    }

    @Then("Puede ver {string}  en la pantalla")
    public void PuedeVerSuNombreEnLaPantalla(String result){

        iniciosesion.validarSuNombreEnPantalla(result);
    }








}
