package screenplay.user_interfaces;

import net.serenitybdd.screenplay.targets.Target;

public class HomePage {
    public static Target INPT_FIRST_NAME = Target.the("Input First Name")
            .locatedBy("//input[@id='customer.firstName']");

    public static Target INPT_LAST_NAME = Target.the("Input Last Name")
            .locatedBy("//input[@id='customer.lastName']");

    public static Target INPT_ADDRESS = Target.the("Input Address")
            .locatedBy("//input[@id='customer.address.street']");

    public static Target INPT_CITY = Target.the("Input City")
            .locatedBy("//input[@id='customer.address.city']");

    public static Target INPT_STATE = Target.the("Input State")
            .locatedBy("//input[@id='customer.address.state']");

    public static Target INPT_ZIP_CODE = Target.the("Input Zip Code")
            .locatedBy("//input[@id='customer.address.zipCode']");

    public static Target INPT_PHONE_NUMBER = Target.the("Input Phone Number")
            .locatedBy("//input[@id='customer.phoneNumber']");

    public static Target INPT_SSN = Target.the("Input SSN")
            .locatedBy("//input[@id='customer.ssn']");

    public static Target INPT_USERNAME = Target.the("Input Username")
            .locatedBy("//input[@id='customer.username']");

    public static Target INPT_PASSWORD = Target.the("Input Password")
            .locatedBy("//input[@id='customer.password']");

    public static Target INPT_REPEAT_PASSWORD = Target.the("Input Confirm")
            .locatedBy("//input[@id='repeatedPassword']");

    public static Target BTN_REGISTER = Target.the("Botón Register")
                .locatedBy("//div[@id='loginPanel']/p/a[contains(text(),'Register')]");

    public static Target BTN_FORM_REGISTER = Target.the("Botón Register del formulario")
                .locatedBy("//form[@id='customerForm']//td/input[@type='submit']");

    public static Target BTN_LOG_OUT = Target.the("Botón Log Out")
                .locatedBy("//div[@id='leftPanel']//a[contains(text(),'Log Out')]");

    public static Target TXT_BIENVENIDA = Target.the("Texto Bienvenida")
                .locatedBy("//div[@id='rightPanel']//p");

    public static Target TXT_INICIO_SESION = Target.the("Texto Bienvenida Inicio Sesión")
                .locatedBy("//div[@id='leftPanel']//p");

    public static Target TXT_MSJ_ERROR = Target.the("Texto Bienvenida")
            .locatedBy("//form[@id='customerForm']//span[@id='customer.username.errors']");
}
