package screenplay.user_interfaces;

import net.serenitybdd.screenplay.targets.Target;
public class LoginPage {
    public static Target TXT_USER = Target.the("Login - Usuario")
            .locatedBy("//div[@id='loginPanel']//input[@name='username']");
    public static Target TXT_PASS = Target.the("Login - Contraseña")
            .locatedBy("//div[@id='loginPanel']//input[@name='password']");

    public static Target BTN_LOG_IN = Target.the("Botón Log In")
            .locatedBy("//div[@id='loginPanel']//input[@value='Log In']");

}
