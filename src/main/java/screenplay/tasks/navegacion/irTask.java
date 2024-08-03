package screenplay.tasks.navegacion;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;

public class irTask {
    public static Performable aLaPaginaLogin(){
        return Task.where("{0} ingresa a la pagina",
                Open.browserOn().thePageNamed("login.page"));
    }
}
