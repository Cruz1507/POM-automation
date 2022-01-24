package co.com.google.translate.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;

@DefaultUrl("https://utest.com/")
public class PaginaUTestLoguin extends PageObject {


    @FindBy(xpath = "/html/body/ui-view/unauthenticated-container/div/div/unauthenticated-header/div/div[3]/ul[2]/li[1]/a")
    WebElement botonEntrar;

    @FindBy(xpath = "//*[@id=\"username\"]")
    WebElement cajaTextoCorreoLoguin;

    @FindBy(xpath = "//*[@id=\"password\"]")
    WebElement cajaTextoContraLoguin;

    @FindBy(xpath = "//*[@id=\"kc-login\"]")
    WebElement botonEntrar1;

    @FindBy(xpath = "//*[@id=\"action-link\"]")
    WebElement botonConfirmarEmail;



    public void clickOnBotonEntrar() {
        botonEntrar.click();
    }

    public void entrarLoguinUsuarioCorreo(String correologuin) {

        cajaTextoCorreoLoguin.sendKeys(correologuin);
    }

    public void entrarLoguinUsuarioContra(String contraLoguin) {

        cajaTextoContraLoguin.sendKeys(contraLoguin);
    }

    public void clickOnBotonEntrar1(){

        botonEntrar1.click();
    }

    public String validarBotonEntrar1() {

        return botonConfirmarEmail.getText();
    }


}