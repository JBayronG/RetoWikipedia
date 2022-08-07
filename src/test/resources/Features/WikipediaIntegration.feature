@Smoke
Feature: Integration all user hisrory

 Background: ingreso exitoso
    Given que john ingresa la url de wikipedia
    Then valida que le aparezca el titulo de Bienvenidos
      |txtTitle|
      |Bienvenidos|

  @Test1
  Scenario: Realizar una busqueda
    When ingreso la palabra en el buscador
      |txtPalabra|
      |Sistemas  |
    Then valido de que me salga Analisis CEEM
      |txtTitle|
      |Análisis CEEM|

  @Test2
  Scenario: ingresar datos a todos los campos
    When ingreso a crear una cuenta diligenciando todo los campos
      |txtName|  txtpass |   txtEmail       |txtCaptche|
      |SALSAu |Trouy#192-|saueg233@gmail.com|Srtru283i |
    Then valido de que me salga el mesaje
      |txtTitle|
      |Falta el código de confirmación o es incorrecto.|

  @Test3
  Scenario: Cambio de version
    When cambia la version a movil y mira el historial
    Then validar de que le aprezca el titulo
      |txtTitle|
      |Explorar historial interactivamente|