package repetition.functional;

import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        TextFormatter normalizer = text -> text.trim().toLowerCase(Locale.ROOT);

        TextFormatter formatter = text -> {
            System.out.println("format");
            return text.trim();
        };

        System.out.println("before");

        String result = formatter.format(" Java ");

        System.out.println(result);

    }
}
