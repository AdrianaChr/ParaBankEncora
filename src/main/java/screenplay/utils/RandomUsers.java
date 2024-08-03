package screenplay.utils;

import lombok.Getter;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import screenplay.user_interfaces.HomePage;

import java.util.Random;

public class RandomUsers {


    private static String userRandom;
    public static String randomUsername(String username){
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        Random random = new Random();
        char randomChar1 = alphabet.charAt(random.nextInt(alphabet.length()));
        char randomChar2 = alphabet.charAt(random.nextInt(alphabet.length()));
        String randomString = String.valueOf(randomChar1) + String.valueOf(randomChar2);

        return username + randomString;
    }

    public static String getUserRandome() {
        return userRandom;
    }

    public static void setUserRandom(String sessionVariable) {
        sessionVariable = RandomUsers.randomUsername(sessionVariable);
        RandomUsers.userRandom = sessionVariable;
    }
}
