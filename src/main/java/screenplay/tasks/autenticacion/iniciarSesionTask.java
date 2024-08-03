package screenplay.tasks.autenticacion;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;
import screenplay.user_interfaces.HomePage;
import screenplay.user_interfaces.LoginPage;

public class iniciarSesionTask {

    public static Performable inParabank(String usr, String psw){
        return Task.where("{0} llena sus datos e inicia sesión en Parabank",
                WaitUntil.the(LoginPage.TXT_USER, WebElementStateMatchers.isPresent()),
                WaitUntil.the(LoginPage.TXT_USER, WebElementStateMatchers.isVisible()),
                WaitUntil.the(LoginPage.TXT_USER, WebElementStateMatchers.isEnabled()),
                Enter.theValue(usr).into(LoginPage.TXT_USER),

                WaitUntil.the(LoginPage.TXT_PASS, WebElementStateMatchers.isPresent()),
                WaitUntil.the(LoginPage.TXT_PASS, WebElementStateMatchers.isVisible()),
                WaitUntil.the(LoginPage.TXT_PASS, WebElementStateMatchers.isEnabled()),
                Enter.theValue(psw).into(LoginPage.TXT_PASS),

                WaitUntil.the(LoginPage.BTN_LOG_IN, WebElementStateMatchers.isPresent()),
                WaitUntil.the(LoginPage.BTN_LOG_IN, WebElementStateMatchers.isVisible()),
                WaitUntil.the(LoginPage.BTN_LOG_IN, WebElementStateMatchers.isEnabled()),
                Click.on(LoginPage.BTN_LOG_IN)
                );

    }
}







