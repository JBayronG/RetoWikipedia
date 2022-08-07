Feature: Ingresar datos par crear una cuenta

  @Test2
  Scenario: ingresar datos a todos los campos
    Given que john ingresa la url de wikipedia
    When ingreso a crear una cuenta diligenciando todo los campos
    |txtName|  txtpass |   txtEmail       |txtCaptche|
    |SALSAu |Trouy#192-|saueg233@gmail.com|Srtru283i |
    Then valido de que me salga el mesaje
    |txtTitle|
    |Falta el código de confirmación o es incorrecto.|
