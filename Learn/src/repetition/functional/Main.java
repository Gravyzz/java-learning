package repetition.functional;

import java.util.Locale;
import java.util.Optional;



public class Main {
    public static void main(String[] args) {

        System.out.println(normalizeLogin("  ZAKHAR  ").orElse("guest"));
        System.out.println(normalizeLogin("   ").orElse("guest"));
        System.out.println(normalizeLogin(null).orElse("guest"));
        System.out.println(normalizeLogin("").orElse("guest"));

    }

    static Optional<String> normalizeLogin(String login){
        if (login == null) return Optional.empty();
        String normalized = login.trim();
        if (normalized.isEmpty()) return Optional.empty();
        return Optional.of(normalized.toLowerCase(Locale.ROOT));
    }

}
