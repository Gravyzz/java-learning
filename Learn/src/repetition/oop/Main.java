package repetition.oop;

public class Main {
    public static void main(String[] args) {

        parse("abc");

    }
    static int parse(String text) {
        try {
            return Integer.parseInt(text);
        } catch (NumberFormatException exception) {
            System.out.println("invalid");
            return -1;
        } finally {
            System.out.println("finished");
        }
    }

}
