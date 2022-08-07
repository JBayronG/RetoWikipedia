Feature: Ingreso a la pagina de wikipedia

  @Regresion
  Scenario: ingreso exitoso
    Given que john ingresa la url de wikipedia
    Then valida que le aparezca el titulo de Bienvenidos
    |txtTitle|
    |Bienvenidos|