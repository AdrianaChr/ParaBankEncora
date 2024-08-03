package screenplay.questions;

import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import screenplay.user_interfaces.HomePage;
import net.serenitybdd.screenplay.Question;

public class BQuestion {
    public static Question<String> txtBienvenida(){
        return actor -> BrowseTheWeb.as(actor).find(HomePage.TXT_BIENVENIDA)
                .then()
                .waitUntilPresent()
                .waitUntilVisible()
                .getText();
    }

    public static Question<String> txtBienvenidaInicioSesion(){
        return actor -> BrowseTheWeb.as(actor).find(HomePage.TXT_INICIO_SESION)
                .then()
                .waitUntilPresent()
                .waitUntilVisible()
                .getText();
    }
}
