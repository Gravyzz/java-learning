package repetition.functional;

import java.util.Locale;

public class Main {
    public static void main(String[] args) {

        TextFormatter upper = text -> text.trim().toUpperCase(Locale.ROOT);
        TextFormatter brackets = text -> {
                return  "[" + text + "]";
        };
        TextFormatter exclamation = text -> text + "!";

        System.out.println(applyFormatter("  java  ", upper));
        System.out.println(applyFormatter("java", brackets));
        System.out.println(applyFormatter("java", exclamation));

    }

    static String applyFormatter(
            String text,
            TextFormatter formatter
    ){
        return formatter.format(text);
    }
}
