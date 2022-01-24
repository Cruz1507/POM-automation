#language: es

Característica: Registro de usuario
  Yo como usuario de la página
  Deseo poder iniciar Sesion
  Para interactuar con las funcionalidades de la aplicación
  Escenario: Iniciar sesión
    Dado que Mariana se encuentra en la pagina web de Utest
    Cuando realice el registro de un nuevo usuario con el primer nombre "Mariana"
    Y realice el registro de un nuevo usuario con el Apellido "Cruz"
    Y realice el registro de un nuevo usuario con el Correo "user3@utest.com"
    Y realice el registro de un nuevo usuario con el Mes de Nacimiento "Julio"
    Y realice el registro de un nuevo usuario con el Día de Nacimiento "15"
    Y realice el registro de un nuevo usuario con el Año de Nacimiento "2000"
    Y realice el registro de un nuevo usuario con la ciudad "Manizales"
    Y realice el registro de un nuevo usuario con el Código Postal "170002"
    Y realice el registro de un nuevo usuario con el Pais "Colombia"
    Y Cree una contraseña "Demouser-1234*/"
    Y Cree una contraseña1 "Demouser-1234*/" y acepte las políticas de datos
    Entonces Puede ver "Welcome to the world's largest community of freelance software testers!"  en la pantalla


