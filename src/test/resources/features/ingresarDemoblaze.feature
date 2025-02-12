#language: es
#Autor:paolaR
@HULOGIN
Característica: Validar login de formulario
  COMO usuario
  QUIERO poder realizar logins
  PARA poder acceder a la plataforma

  Antecedentes: 
    Dado me encuentro en la pagina de inicio

@CP1
  Esquema del escenario: Validar el ingreso  al login Credenciales correctas
    Y el usuario  digite usuario y clave
      | usuario   | contrasenna   |
      | <usuario> | <contrasenna> |
    Y da clic en el boton Iniciar sesion
    Entonces Validar  inicio sesion a la pagina de forma exitosa

    Ejemplos:
      | usuario          | contrasenna      |
      | todo@yopmail.com | todo@yopmail.com |



  @CP2
  Esquema del escenario: Validar mensaje que no se encuentra el usuario
    Y el usuario  digite usuario y clave
      | usuario   | contrasenna   |
      | <usuario> | <contrasenna> |
    Y da clic en el boton Iniciar sesion
    Entonces Validar  mensaje de que no se encontro el usuario

    Ejemplos:
      | usuario            | contrasenna      |
      | paoramos@gmail.com | todo@yopmail.com |


