#language: es

@Inicio
Característica: Inicio

  @Prueba
  Esquema del escenario: Registro e ingreso de usuario
    Dado que '<usuario>' ingresa a la pagina principal
    Y él hace clic en el boton Registrar
    Cuando él ingresa '<first-name>' en el campo First Name
    Y él ingresa '<last-name>' en el campo Last Name
    Y él ingresa '<address>' en el campo Address
    Y él ingresa '<city>' en el campo City
    Y él ingresa '<state>' en el campo State
    Y él ingresa '<zip-code>' en el campo Zip Code
    Y él ingresa '<phone>' en el campo Phone
    Y él ingresa '<SSN>' en el campo SSN
    Y él ingresa '<username>' en el campo Username
    Y él ingresa '<password>' en el campo Password
    Y él hace clic en el boton Registrar del formulario
    Y él valida el texto 'Your account was created successfully. You are now logged in.'
    Y él hace clic en el boton Log Out
    Y él inicia sesión con usuario y '<password>'
    Y él valida el texto Welcome '<first-name>''<last-name>'
    Ejemplos:
      | usuario | first-name | last-name | address     | city | state | zip-code | phone     | SSN | username | password  |
      | usuario | Adriana    | Chinguel  | Laurel Rosa | Lima | Lima  | 14805    | 987654321 | 123 | adriana  | achinguel |
