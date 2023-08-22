package com.stepsDefinition;

import com.Questions.questions;
import com.UserInterfaces.LoginUi;
import com.Utils.utilidades;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.core.Serenity;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class menuProspecto {
    private LoginUi loginui = new LoginUi();
    private questions preguntas = new questions();

    private ChromeDriver driver;
    utilidades utils = new utilidades();

  @Given("^INGRESAR A LA URL SALESFORCE$")
    public void ingresarALaURL() {
       System.setProperty("webdriver.chrome.driver", "C:\\Users\\tabaresc\\IdeaProjects\\SALESFORCE\\src\\test\\resources\\WebDriver\\chromedriver.exe");
//        new DesiredCapabilities();
//        DesiredCapabilities capabilities = DesiredCapabilities.chrome();
//        capabilities.setCapability(CapabilityType.ForSeleniumServer.ENSURING_CLEAN_SESSION, true);
//        ChromeOptions opcion = new ChromeOptions();
//        opcion.addArguments("start-maximized");
//        capabilities.setCapability(ChromeOptions.CAPABILITY,opcion);
        ChromeOptions opcion = new ChromeOptions();
        driver = new ChromeDriver(opcion);
        driver.get(loginui.URLSALEFORCE);
        System.out.println(driver.getTitle());
        driver.manage().addCookie(new Cookie("Key","value"));

    }

    @When("^INGRESAR CREDENCIALES \"([^\"]*)\" \"([^\"]*)\"$")
    public void ingresarCredenciales(String usuario, String contrasena) {
        WebElement cUsuario = driver.findElement(LoginUi.cajaTextUsuario);
        cUsuario.sendKeys(usuario);
        WebElement uContrasena = driver.findElement(LoginUi.cajaTextContrasena);
        uContrasena.sendKeys(contrasena);
        Serenity.takeScreenshot();
        driver.findElement(LoginUi.botonLogin).click();


    }

    @When("^VALIDAR E INGRESAR A LA OPCION NUEVA ATENCION$")
    public void opcionNuevaAtencion() throws InterruptedException {

        utils.cerrarVentanas(String.valueOf(LoginUi.botonCerrar));
        utils.esperaImplicita(String.valueOf(LoginUi.botonNuevaAtencion));
        Serenity.takeScreenshot();
        driver.findElement(LoginUi.botonNuevaAtencion).click();



    }
    @When("^VALIDAR LA EXISTENCIA DEL PROSPECTO \"([^\"]*)\"$")
    public void existenciaProspecto(String documento) throws InterruptedException {

       utils.esperaImplicita(String.valueOf(LoginUi.selecTipoDocumento));

        WebElement comboBoxElement = driver.findElement(LoginUi.selecTipoDocumento);
        comboBoxElement.click();
        WebElement listbox= driver.findElement(LoginUi.selecCedula);
        listbox.click();
        comboBoxElement.sendKeys(Keys.TAB);

        Thread.sleep(1000);

        WebElement numeroDoc = driver.findElement(LoginUi.cajaTextNumeroDoc);
        numeroDoc.sendKeys(documento);
        Serenity.takeScreenshot();
        driver.findElement(LoginUi.botonBuscarProspecto).click();
        System.out.println("finalice la busqueda del numero de documento");


    }

   @Then("^VERIFICAR LA OPCION PROSPECTO$")
    public void anadirProspecto() {

        preguntas.validarElementoExistente(String.valueOf(LoginUi.mensajeNoExisteProspecto));

    }


}

