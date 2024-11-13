@Carrito
Feature: Automatizacion de carrito de compra

  Background:
    Given que estoy en la pagina de registro

#  @registroUsuario
#  Scenario Outline:Registro de usuario en la pagina de carrito
#    And valido que estoy en la pagina de registro
#    Then ingreso un "<nombre>", "<apellido>", "<correo>", "<telefono>", "<contraseña>"
#    Then registro el nuevo usuario
#    Examples:
#       | nombre | apellido | correo         | telefono  |contraseña|
#       | Luis   | Lopez    | luismas@gmail.com | 044567893 |user12345 |


  @carritoCompra
  Scenario Outline:carrito compra
    And valido que estoy en la pagina principal
    And agrego los productos al carrito
    And selecciono el detalle del carrito
    And le doy click en ver carrito
    Then valido los productos en el carrito
    And continuo con la compra
    And selecciono cuenta como invitado
    Then ingreso los datos de la cuenta invitado "<nombre>","<apellido>","<correo>","<telefono>"
    And continuo ingresando los demas datos "<company>","<address1>","<address2>","<city>","<postcode>","<country>","<region>"
    Then valido los estados de compra realizada
    Examples:
      | nombre | apellido | correo           | telefono  | company|address1|address2|city|postcode|country|region|
      | CARLOS | GONZALES | CARLOS@GMAIL.COM | 345678312 |nose    |nose    |nose    |LIMA|12345   |Peru   |La Libertad  |
    







