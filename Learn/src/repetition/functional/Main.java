package repetition.functional;

import java.util.Locale;
import java.util.function.*;

public class Main {
    public static void main(String[] args) {

        Predicate<String> validLogin = login -> (login != null) && (login.trim().length() >= 3);

        Function<String, Integer> trimmedLength =
                text -> text.trim().length();

        Consumer<String> printNormalized = text ->
                System.out.println("NORMALIZED: " + text.trim().toLowerCase(Locale.ROOT));


        printNormalized.accept("   JAVA   ");
        printNormalized.accept(" Backend ");


    }


}
