Feature: Ver la version de movil y historial
  Como estudiante
  Quiero ingresar a wikipedia, registrarme con usuarios incorrectos
  Para validar de que la pagina si genera la excepción de error

  @Test3
  Scenario: Cambio de version
    Given que john ingresa la url de wikipedia
    When cambia la version a movil y mira el historial
    Then validar de que le aprezca el titulo
     |txtTitle|
     |Explorar historial interactivamente|