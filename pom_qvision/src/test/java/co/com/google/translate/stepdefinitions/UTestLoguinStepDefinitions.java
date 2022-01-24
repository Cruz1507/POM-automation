package co.com.google.translate.stepdefinitions;


import co.com.google.translate.pages.PaginaUTestLoguin;
import co.com.google.translate.steps.PaginaUTestL;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class UTestLoguinStepDefinitions {


    @Steps
    PaginaUTestL iniciologuin;

    @Given("Que Mariana quiere entrar con su usuario a la página")
    public void UsuarioQuiereLoguearse(){
        iniciologuin.abrirPaginaUtestloguin();
    }

    @When("Realice el Loguin con el Correo {string}")
    public void LoguinUsuarioCorreo(String correologuin){

        iniciologuin.entrarLoguinUsuarioCorreo(correologuin);
    }
    @When("realice el logueo con la contraseña {string}")
    public void LoguinUsuarioContra(String contraLoguin){

        iniciologuin.entrarLoguinUsuarioContra(contraLoguin);
    }
    @Then("Puede ver {string} el boton de enviar un email de confirmacion")
    public void PuedeVerBotonEmailConfimacion(String result1){

        iniciologuin.validarBotonEmailConfirmacion(result1);
    }
}
