Feature: Ingresar datos par crear una cuenta

  @Test2
  Scenario: ingresar datos a todos los campos
    Given que john ingresa la url de wikipedia
    When ingreso a crear una cuenta diligenciando todo los campos
    Then valido de que me salga el mesaje de Falta el codigo de confirmación o es incorrecto.