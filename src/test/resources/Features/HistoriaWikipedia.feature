Feature: Ver la version de movil y historial
  Como estudiante Quiero ingreasr a wikipedia y cambiar a la version movil
  Para ver el funcionamiento

  @Test3
  Scenario: Cambio de version
    Given que john ingresa la url de wikipedia
    When cambia la version a movil y mira el historial
    Then validar de que le aprezca el titulo
     |txtTitle|
     |Explorar historial interactivamente|