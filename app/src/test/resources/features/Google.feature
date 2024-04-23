Feature: Probar crear una cuenta

    Scenario: Crear cuenta

    Given Estoy en MagentoWeb
    When click Create an Account
    Then rellenar campo First Name
    Then rellenar campo Last Name
    Then rellenar campo Email
    Then rellenar campo PastWord
    Then confirmar Password
    Then create acount
    Then clickList
    Then lista
    And cerrar
