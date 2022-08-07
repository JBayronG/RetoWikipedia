Feature: Busqueda exitosa

  @Test1
  Scenario: Realizar una busqueda
    Given que john ingresa la url de wikipedia
    When ingreso la palabra en el buscador
    |txtPalabra|
    |Sistemas  |
    Then valido de que me salga Analisis CEEM
    |txtTitle|
    |Análisis CEEM|