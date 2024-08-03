package stepDefinitions.home;

import io.cucumber.java.es.*;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import screenplay.questions.BQuestion;
import screenplay.tasks.autenticacion.iniciarSesionTask;
import screenplay.tasks.navegacion.irTask;
import screenplay.tasks.commons;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.ensure.Ensure;
import screenplay.user_interfaces.HomePage;
import screenplay.utils.RandomUsers;

public class homeStepDefinitions {

    private final static String PSW = "achinguel";

    @Dado("(que ){actor} ingresa a la pagina principal")
    public void abrirLogin(Actor actor){
        actor.attemptsTo(
                irTask.aLaPaginaLogin()
        );
    }

    @Y("{actor} hace clic en el boton Registrar")
    public void clicRegistrar(Actor actor){
        actor.attemptsTo(
                commons.clicBotonRegistrar()
        );
    }

    @Y("{actor} hace clic en el boton Registrar del formulario")
    public void clicFormRegistrar(Actor actor){
        actor.attemptsTo(
                commons.clicBotonFormRegistrar()
        );

        boolean mensajeError = BrowseTheWeb.as(actor).find(HomePage.TXT_MSJ_ERROR).then().isPresent();

        if (mensajeError){

            String username = RandomUsers.getUserRandome();
            actor.attemptsTo(commons.ingresarUsername(username));
            ingresarPassword(actor, PSW);

            actor.attemptsTo(
                    commons.clicBotonFormRegistrar()
            );
        }
        else {
            System.out.println("Nuevo usuario creado");
        }
    }

    @Y("{actor} hace clic en el boton Log Out")
    public void clicBotonLogOut(Actor actor){
        actor.attemptsTo(
                commons.clicBotonLogOut()
        );
    }

    @Y("{actor} valida el texto {string}")
    public void validarTextoBienvenida(Actor actor, String texto){
        actor.attemptsTo(Ensure.that(BQuestion.txtBienvenida()).isEqualTo(texto)
        );
    }

    @Y("{actor} valida el texto Welcome {string}{string}")
    public void validarTextoBienvenidaInicioSesion(Actor actor, String firstname, String lastname){
        String texto = "Welcome " + firstname + " " + lastname;
        actor.attemptsTo(Ensure.that(BQuestion.txtBienvenidaInicioSesion()).isEqualTo(texto)
        );
    }

    @Cuando("{actor} inicia sesión con usuario y {string}")
    public void iniciarSesion(Actor actor, String password){
        String username = RandomUsers.getUserRandome();
        actor.attemptsTo(
                iniciarSesionTask.inParabank(username,password)
        );
    }

    @Cuando("{actor} ingresa {string} en el campo First Name")
    public void ingresarFirstName(Actor actor, String texto){
        actor.attemptsTo(
                commons.ingresarFirstName(texto)
        );
    }

    @Cuando("{actor} ingresa {string} en el campo Last Name")
    public void ingresarLastName(Actor actor, String texto){
        actor.attemptsTo(
                commons.ingresarLastName(texto)
        );
    }

    @Cuando("{actor} ingresa {string} en el campo Address")
    public void ingresarAddress(Actor actor, String texto){
        actor.attemptsTo(
                commons.ingresarAddress(texto)
        );
    }

    @Cuando("{actor} ingresa {string} en el campo City")
    public void ingresarCity(Actor actor, String texto){
        actor.attemptsTo(
                commons.ingresarCity(texto)
        );
    }

    @Cuando("{actor} ingresa {string} en el campo State")
    public void ingresarState(Actor actor, String texto){
        actor.attemptsTo(
                commons.ingresarState(texto)
        );
    }

    @Cuando("{actor} ingresa {string} en el campo Zip Code")
    public void ingresarZipCode(Actor actor, String texto){
        actor.attemptsTo(
                commons.ingresarZipCode(texto)
        );
    }

    @Cuando("{actor} ingresa {string} en el campo Phone")
    public void ingresarPhone(Actor actor, String texto){
        actor.attemptsTo(
                commons.ingresarPhone(texto)
        );
    }

    @Cuando("{actor} ingresa {string} en el campo SSN")
    public void ingresarSSN(Actor actor, String texto){
        actor.attemptsTo(
                commons.ingresarSsn(texto)
        );
    }

    @Cuando("{actor} ingresa {string} en el campo Username")
    public void ingresarUsername(Actor actor, String texto){
        RandomUsers.setUserRandom(texto);
        String username = RandomUsers.getUserRandome();
        actor.attemptsTo(
                commons.ingresarUsername(username)
        );
    }

    @Cuando("{actor} ingresa {string} en el campo Password")
    public void ingresarPassword(Actor actor, String texto){
        actor.attemptsTo(
                commons.ingresarPassword(texto),
                commons.ingresarConfirm(texto)
        );
    }
}
