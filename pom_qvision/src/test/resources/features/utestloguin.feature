#language: es

Característica: Loguin de usuario
  Yo como usuario de la página
  Deseo poder loguearme
  Para interactuar con las funcionalidades de la aplicación
  Escenario: Logueo de la página
  Dado Que Mariana quiere entrar con su usuario a la página
  Cuando Realice el Loguin con el Correo "user1@utest.com"
  Y realice el logueo con la contraseña "Demouser-1234*/"
  Entonces Puede ver "Resend Confirmation Email" el boton de enviar un email de confirmacion