# ParaBankEncora
Este proyecto realiza el registro e inicio de sesión de un usuario

Se tiene que tener en cuenta que este proyecto está trabajado para la versión de navegador: 127.0.6533.89

Para su ejecución en JUnit hacerlo con el siguiente enviroment: -Denvironment=dev

Para su ejecución en Maven hacerlo con la siguiente linea de código: mvn clean verify "-Dcucumber.filter.tags=@prueba" -Denvironment=dev

Se detalla a continuación la funcionalidad

- Clase BQuestion: Se detallan los métodos para obtener y validar si un texto en específico se encuentran presentes y visibles.
- IniciarSesionTask: Valida si está presente, visible y habilitado los campos username y password, ingresa un valor para cada uno y luego hará clic para iniciar sesión.
- isTask: Abre el navegador en la página mencionada en serenity.conf
- commons: Se valida si los campos están presentes, visibles y habilitados, así también hace clic e ingresa el valor en cierto campo en específico.
- HomePage: Localizan los xpath de cada uno de los campos que se requieren encontrar en la página.
- LoginPage: Localizan los xpath de cada uno de los campos que se requieren encontrar en el formulario de inicio de sesión.
- RandomUsers: Crea, obtiene y establece 2 valores aleatorios y los agrega al final de un usuario obtenido.
- homeStepDefinitions: Se mapean las acciones que realizará el actor dentro de la página.
- RunnerTest: configuraciones para iniciar la ejecución de la prueba.
- Inicio.feature: Se mapean las acciones del actor en formato gherkin.