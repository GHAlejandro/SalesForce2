#Autor: Christian David Tabares Pinilla
#Agosto 08 2023

Feature: Regresion Ventas

  Scenario Outline: OPCION CREACION DE PROSPECTO
    Given INGRESAR A LA URL SALESFORCE
    When INGRESAR CREDENCIALES <usuario> <contraseña>
    When VALIDAR E INGRESAR A LA OPCION NUEVA ATENCION
    When VALIDAR LA EXISTENCIA DEL PROSPECTO <documento>
    Then VERIFICAR LA OPCION PROSPECTO

    Examples:
      |usuario|contraseña|documento|
      |"leonardo.fetecua@claro.com.co.sit1"|"Julio2023*"|"123456789"|