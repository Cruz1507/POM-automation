package co.com.google.translate.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;

@DefaultUrl("https://utest.com/")
public class PaginaUTestRegistro extends PageObject {


    @FindBy(xpath = "/html/body/ui-view/unauthenticated-container/div/div/unauthenticated-header/div/div[3]/ul[2]/li[2]/a")
    WebElement botonUneteHoy;

    @FindBy(xpath = "//*[@id=\"firstName\"]")
    WebElement cajaTextoPrimerNombre;

    @FindBy(xpath = "//*[@id=\"lastName\"]")
    WebElement cajaTextoApellido;

    @FindBy(xpath = "//*[@id=\"email\"]")
    WebElement cajaTextoCorreo;

    @FindBy(xpath = "//*[@id=\"birthMonth\"]")
    WebElement cajaTextoMes;

    @FindBy(xpath = "//*[@id=\"birthDay\"]")
    WebElement cajaTextoDia;

    @FindBy(xpath = "//*[@id=\"birthYear\"]")
    WebElement cajaTextoAno;

    @FindBy(xpath = "//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[2]/a/span")
    WebElement botonSiguienteUbicacion;

    @FindBy(xpath = "//*[@id='city']")
    WebElement cajaCiudad;

    @FindBy(xpath = "//*[@id=\"zip\"]")
    WebElement cajaCodigoPostal;

    @FindBy(xpath = "//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[1]/div[3]/div[1]/div[4]/div[2]/div/div/div[1]/span")
    WebElement cajaPais;

    @FindBy(xpath = "//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[2]/div/a")
    WebElement botonSiguienteDispositivos;
/*
    @FindBy(xpath = "//*[@id=\"web-device\"]/div[1]/div[2]/div/div[1]/span")
    WebElement cajaComputador;

    @FindBy(xpath = "//*[@id=\"web-device\"]/div[2]/div[2]/div/div[1]/span")
    WebElement cajaVersion;

    @FindBy(xpath = "//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[1]/div[3]/div[1]/div[4]/div[2]/div/div/div[1]/span")
    WebElement cajaLenguaje;
*/
    @FindBy(xpath = "//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/div[2]/div/a")
    WebElement botonSiguienteUltimoPaso;

    @FindBy(xpath = "//*[@id=\"password\"]")
    WebElement cajaContrasena1;

    @FindBy(xpath = "//*[@id=\"confirmPassword\"]")
    WebElement cajaContrasena2;

    @FindBy(xpath = "//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[5]/label/span[1]")
    WebElement recuadroTerminosYCondiciones;

    @FindBy(xpath = "//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[6]/label/span[1]")
    WebElement recuadroPrivacidad;

    @FindBy(xpath = "//*[@id=\"laddaBtn\"]")
    WebElement botonConfiguracionCompleta;

    @FindBy(xpath = "//*[@id=\"mainContent\"]/div/div/div[1]/div/h1")
    WebElement mensajeBienvenida;

    @FindBy(xpath = "//*[@class='step-intro']")
    WebElement mensajeCiudad;





    public void clickOnBotonUneteHoy() {

        botonUneteHoy.click();
    }

    public void entrarPrimerNombreNuevoUsusario(String primerNombre) {

        cajaTextoPrimerNombre.sendKeys(primerNombre);
    }

    public void entrarApellidoNuevoUsusario(String apellido) {

        cajaTextoApellido.sendKeys(apellido);
    }

    public void entrarCorreoNuevoUsuario(String correo) {

        cajaTextoCorreo.sendKeys(correo);
    }

    public void entrarMesNuevoUsuario(String mes) {

        cajaTextoMes.sendKeys(mes);
    }

    public void entrarDiaNuevoUsuario(String dia) {

        cajaTextoDia.sendKeys(dia);
    }

    public void entrarAnoNuevoUsuario(String ano) {

        cajaTextoAno.sendKeys(ano);
    }

    public void clickOnBotonSiguienteUbicacion() {

        botonSiguienteUbicacion.click();
    }

    public void entrarCiudadNuevoUsuario(String ciudad) {
        // cajaCiudad.clear();
        cajaCiudad.sendKeys(ciudad);
        mensajeCiudad.click();
        // cajaCiudad.sendKeys(Keys.DOWN);
        // cajaCiudad.sendKeys(Keys.ENTER);
    }



    public void entrarCodigoPostalNuevoUsuario(String codigoPostal) {

        cajaCodigoPostal.clear();
        cajaCodigoPostal.sendKeys(codigoPostal);
    }



    public void entrarPaisNuevoUsuario(String pais) {

       // withAction().doubleClick(cajaPais);
      //  cajaPais.click();
        cajaPais.sendKeys(pais);
      //  cajaPais.sendKeys(Keys.DOWN);
       // cajaPais.sendKeys(Keys.RETURN);

    }

    public void clickOnBotonSiguienteDispositivos() {

        botonSiguienteDispositivos.click();
    }
/*
    public void entrarComputadorNuevoUsuario(String computador) {

        cajaComputador.click();
        cajaComputador.sendKeys(computador);
    }

    public void entrarVersionNuevoUsuario(String version) {

        cajaVersion.click();
        cajaVersion.sendKeys(version);
    }

    public void entrarLenguajeNuevoUsuario(String lenguaje) {

        cajaLenguaje.click();
        cajaLenguaje.sendKeys(lenguaje);
    }
*/
    public void clickOnBotonSiguienteUltimoPaso() {

        botonSiguienteUltimoPaso.click();
    }

    public void entrarContrasenaNuevoUsuario(String contra) {

        cajaContrasena1.sendKeys(contra);
    }

    public void entrarDeNuevoContrasenaNuevoUsuario(String contra1) {

        cajaContrasena2.sendKeys(contra1);
    }

    public void clickOnRecuadroTerminosYCondiciones() {

        recuadroTerminosYCondiciones.click();
    }

    public void clickOnRecuadroPrivacidad() {

        recuadroPrivacidad.click();
    }

    public void clickOnBotonConfiguracionCompleta() {

        botonConfiguracionCompleta.click();
    }

    public String mensajeResultanteDeBienvenida() {

        return mensajeBienvenida.getText();
    }

}
