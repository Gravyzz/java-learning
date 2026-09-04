package repetition.functional;

import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        TextFormatter normalizer = text -> text.trim().toLowerCase(Locale.ROOT);

        TextFormatter formatter = text -> {
            System.out.println("format");
            return text.trim();
        };


        String result = formatter.format(" Java ");
        System.out.println(result);

        TextFormatter upper = text -> text.trim().toUpperCase(Locale.ROOT);
        TextFormatter brackets = text -> {
                return  "[" + text + "]";
        };

        System.out.println(applyFormatter("  java  ", upper));
        System.out.println(applyFormatter("java", brackets));

    }

    static String applyFormatter(
            String text,
            TextFormatter formatter
    ){
        return formatter.format(text);
    }
}
