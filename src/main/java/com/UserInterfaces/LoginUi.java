package com.UserInterfaces;


import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginUi  {
    //public static final Target URLSALESFORCE = Target.the("URL SALESFORCE");

    private ChromeDriver driver;
    public String URLSALEFORCE = "https://test.salesforce.com/";
    public static By cajaTextUsuario = By.xpath("//*[@id='username']");
    public static By cajaTextContrasena = By.xpath("//*[@id='password']");
    public static By botonLogin = By.xpath("//*[@id='Login']");
    public static By botonCerrar = By.xpath("//*[@data-key='close']");
    public static By botonNuevaAtencion = By.xpath("//*[@id=\"brandBand_1\"]/div/div/div/div/div/div[1]/div[1]/div[1]/c-cf-f-v-u_-home-page-sales-agent/div/vlocity_cmt-flex-card-state/div/slot/div/div[2]/vlocity_cmt-flex-action/div/span/c-tooltip/span/c-button/button");
    public static By selecTipoDocumento = By.xpath("//span[text()='Tipo del Documento']//following::input[1]");
    public static By selecCedula = By.xpath("//*[@data-label='CEDULA DE CIUDADANIA']");
    public static By cajaTextNumeroDoc = By.xpath("//*[contains(text(),'Identifica')]/following::input[6]");
    public static By botonBuscarProspecto = By.xpath("//span[text()='Buscar']");
    public static By mensajeNoExisteProspecto = By.xpath("//*[@data-key='close']");



    public String USUARIO = "leonardo.fetecua@claro.com.co.sit1";
    public String CONTRASENA = "Julio2023*";










}
