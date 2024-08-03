package screenplay.tasks;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;
import screenplay.user_interfaces.HomePage;

public class commons {

    public static Performable clicBotonRegistrar() {
        return Task.where("Clic en botón register",
                WaitUntil.the(HomePage.BTN_REGISTER, WebElementStateMatchers.isPresent()),
                WaitUntil.the(HomePage.BTN_REGISTER, WebElementStateMatchers.isVisible()),
                WaitUntil.the(HomePage.BTN_REGISTER, WebElementStateMatchers.isEnabled()),
                WaitUntil.the(HomePage.BTN_REGISTER, WebElementStateMatchers.isClickable()),
                Click.on(HomePage.BTN_REGISTER)
        );
    }

    public static Performable clicBotonFormRegistrar() {
        return Task.where("Clic en botón register en formulario",
                WaitUntil.the(HomePage.BTN_FORM_REGISTER, WebElementStateMatchers.isPresent()),
                WaitUntil.the(HomePage.BTN_FORM_REGISTER, WebElementStateMatchers.isVisible()),
                WaitUntil.the(HomePage.BTN_FORM_REGISTER, WebElementStateMatchers.isEnabled()),
                WaitUntil.the(HomePage.BTN_FORM_REGISTER, WebElementStateMatchers.isClickable()),
                Click.on(HomePage.BTN_FORM_REGISTER)
        );
    }

    public static Performable clicBotonLogOut() {
        return Task.where("Clic en botón Log Out",
                WaitUntil.the(HomePage.BTN_LOG_OUT, WebElementStateMatchers.isPresent()),
                WaitUntil.the(HomePage.BTN_LOG_OUT, WebElementStateMatchers.isVisible()),
                WaitUntil.the(HomePage.BTN_LOG_OUT, WebElementStateMatchers.isEnabled()),
                WaitUntil.the(HomePage.BTN_LOG_OUT, WebElementStateMatchers.isClickable()),
                Click.on(HomePage.BTN_LOG_OUT)

        );
    }

    public static Performable ingresarFirstName(String texto) {
        return Task.where("ingresar " + texto + " en campo First Name",
                WaitUntil.the(HomePage.INPT_FIRST_NAME, WebElementStateMatchers.isPresent()),
                WaitUntil.the(HomePage.INPT_FIRST_NAME, WebElementStateMatchers.isVisible()),
                WaitUntil.the(HomePage.INPT_FIRST_NAME, WebElementStateMatchers.isEnabled()),
                Enter.theValue(texto).into(HomePage.INPT_FIRST_NAME)
        );
    }

    public static Performable ingresarLastName(String texto) {
        return Task.where("ingresar " + texto + " en campo Last Name",
                WaitUntil.the(HomePage.INPT_LAST_NAME, WebElementStateMatchers.isPresent()),
                WaitUntil.the(HomePage.INPT_LAST_NAME, WebElementStateMatchers.isVisible()),
                WaitUntil.the(HomePage.INPT_LAST_NAME, WebElementStateMatchers.isEnabled()),
                Enter.theValue(texto).into(HomePage.INPT_LAST_NAME)
        );
    }

    public static Performable ingresarAddress(String texto) {
        return Task.where("ingresar " + texto + " en campo Address",
                WaitUntil.the(HomePage.INPT_ADDRESS, WebElementStateMatchers.isPresent()),
                WaitUntil.the(HomePage.INPT_ADDRESS, WebElementStateMatchers.isVisible()),
                WaitUntil.the(HomePage.INPT_ADDRESS, WebElementStateMatchers.isEnabled()),
                Enter.theValue(texto).into(HomePage.INPT_ADDRESS)
        );
    }

    public static Performable ingresarCity(String texto) {
        return Task.where("ingresar " + texto + " en campo City",
                WaitUntil.the(HomePage.INPT_CITY, WebElementStateMatchers.isPresent()),
                WaitUntil.the(HomePage.INPT_CITY, WebElementStateMatchers.isVisible()),
                WaitUntil.the(HomePage.INPT_CITY, WebElementStateMatchers.isEnabled()),
                Enter.theValue(texto).into(HomePage.INPT_CITY)
        );
    }

    public static Performable ingresarState(String texto) {
        return Task.where("ingresar " + texto + " en campo State",
                WaitUntil.the(HomePage.INPT_STATE, WebElementStateMatchers.isPresent()),
                WaitUntil.the(HomePage.INPT_STATE, WebElementStateMatchers.isVisible()),
                WaitUntil.the(HomePage.INPT_STATE, WebElementStateMatchers.isEnabled()),
                Enter.theValue(texto).into(HomePage.INPT_STATE)
        );
    }

    public static Performable ingresarZipCode(String texto) {
        return Task.where("ingresar " + texto + " en campo Zip Code",
                WaitUntil.the(HomePage.INPT_ZIP_CODE, WebElementStateMatchers.isPresent()),
                WaitUntil.the(HomePage.INPT_ZIP_CODE, WebElementStateMatchers.isVisible()),
                WaitUntil.the(HomePage.INPT_ZIP_CODE, WebElementStateMatchers.isEnabled()),
                Enter.theValue(texto).into(HomePage.INPT_ZIP_CODE)
        );
    }

    public static Performable ingresarPhone(String texto) {
        return Task.where("ingresar " + texto + " en campo Phone Number",
                WaitUntil.the(HomePage.INPT_PHONE_NUMBER, WebElementStateMatchers.isPresent()),
                WaitUntil.the(HomePage.INPT_PHONE_NUMBER, WebElementStateMatchers.isVisible()),
                WaitUntil.the(HomePage.INPT_PHONE_NUMBER, WebElementStateMatchers.isEnabled()),
                Enter.theValue(texto).into(HomePage.INPT_PHONE_NUMBER)
        );
    }

    public static Performable ingresarSsn(String texto) {
        return Task.where("ingresar " + texto + " en campo SSN",
                WaitUntil.the(HomePage.INPT_SSN, WebElementStateMatchers.isPresent()),
                WaitUntil.the(HomePage.INPT_SSN, WebElementStateMatchers.isVisible()),
                WaitUntil.the(HomePage.INPT_SSN, WebElementStateMatchers.isEnabled()),
                Enter.theValue(texto).into(HomePage.INPT_SSN)
        );
    }

    public static Performable ingresarUsername(String texto) {
        return Task.where("ingresar " + texto + " en campo Username",
                WaitUntil.the(HomePage.INPT_USERNAME, WebElementStateMatchers.isPresent()),
                WaitUntil.the(HomePage.INPT_USERNAME, WebElementStateMatchers.isVisible()),
                WaitUntil.the(HomePage.INPT_USERNAME, WebElementStateMatchers.isEnabled()),
                Enter.theValue(texto).into(HomePage.INPT_USERNAME)
        );
    }

    public static Performable ingresarPassword(String texto) {
        return Task.where("ingresar " + texto + " en campo Password",
                WaitUntil.the(HomePage.INPT_PASSWORD, WebElementStateMatchers.isPresent()),
                WaitUntil.the(HomePage.INPT_PASSWORD, WebElementStateMatchers.isVisible()),
                WaitUntil.the(HomePage.INPT_PASSWORD, WebElementStateMatchers.isEnabled()),
                Enter.theValue(texto).into(HomePage.INPT_PASSWORD)
        );
    }

    public static Performable ingresarConfirm(String texto) {
        return Task.where("ingresar " + texto + " en campo Confirm",
                WaitUntil.the(HomePage.INPT_REPEAT_PASSWORD, WebElementStateMatchers.isPresent()),
                WaitUntil.the(HomePage.INPT_REPEAT_PASSWORD, WebElementStateMatchers.isVisible()),
                WaitUntil.the(HomePage.INPT_REPEAT_PASSWORD, WebElementStateMatchers.isEnabled()),
                Enter.theValue(texto).into(HomePage.INPT_REPEAT_PASSWORD)
        );
    }
}
