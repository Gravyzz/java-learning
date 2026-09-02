package repetition.oop;

public class Main {
    public static void main(String[] args) {

        System.out.println(describe(10) );
        System.out.println(describe("java") );
        System.out.println(describe(10,20) );

    }

    static String describe(int value){
        return "number: " + value;
    }
    static String describe(String value){
        return "text: " + value;
    }
    static String describe(int first, int second){
        return "sum: " + (first+second);
    }

}
