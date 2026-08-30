package Repetition;

public class Main {

    public static void main(String[] args) {

        String text = "   Java Backend   ";
        text = normalize(text);

        System.out.println(text);

    }

    static String normalize(String text){
        text = text.trim();
        text = text.toLowerCase();
        return text;
    }

}