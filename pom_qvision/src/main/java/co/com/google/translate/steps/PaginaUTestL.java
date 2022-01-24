package co.com.google.translate.steps;

import co.com.google.translate.pages.PaginaUTestLoguin;
import co.com.google.translate.pages.PaginaUTestRegistro;
import net.thucydides.core.annotations.Step;
import org.junit.Assert;

public class PaginaUTestL {

    PaginaUTestLoguin paginaUTestLoguin;

    @Step
    public void abrirPaginaUtestloguin(){
        paginaUTestLoguin.open();
    }

    @Step
    public void entrarLoguinUsuarioCorreo(String correologuin) {
        paginaUTestLoguin.clickOnBotonEntrar();
        paginaUTestLoguin.entrarLoguinUsuarioCorreo(correologuin);
    }

    @Step
    public void entrarLoguinUsuarioContra(String contraLoguin){
        paginaUTestLoguin.entrarLoguinUsuarioContra(contraLoguin);
        paginaUTestLoguin.clickOnBotonEntrar1();
    }

    @Step
    public void validarBotonEmailConfirmacion(String result1){
        Assert.assertEquals(paginaUTestLoguin.validarBotonEntrar1(), result1);
    }




}
