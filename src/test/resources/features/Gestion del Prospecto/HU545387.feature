#Autor: Christian David Tabares Pinilla
#Agosto 08 2023

Feature: HU545387_Datos Obligatorios en la creación
  @c
  Scenario Outline: OPCION CREACION DE PROSPECTO
    Given INGRESAR A LA URL SALESFORCE
    When INGRESAR CREDENCIALES <usuario> <contraseña>
    When VALIDAR E INGRESAR A LA OPCION NUEVA ATENCION
    When VALIDAR LA EXISTENCIA DEL PROSPECTO <documento>
    Then VERIFICAR LA OPCION PROSPECTO

    Examples:
      |usuario|contraseña|documento|
      |"leonardo.fetecua@claro.com.co.sit1"|"Julio2023*"|"123456789"|



@2
  Scenario Outline: VALIDACION DEL FORMATO CAMPO NOMBRE
    Given INGRESAR A LA URL SALESFORCE
    When INGRESAR CREDENCIALES <usuario> <contraseña>
    When VALIDAR E INGRESAR A LA OPCION NUEVA ATENCION
    #When VALIDAR LA EXISTENCIA DEL PROSPECTO
    #When AÑADIR PROSPECTO
    #When VALIDAR MARCA DE OBLIGATORIEDAD
    #When VALIDAR


    Examples:
      |usuario|contraseña|
      |"leonardo.fetecua@claro.com.co.sit1"|"Julio2023*"|