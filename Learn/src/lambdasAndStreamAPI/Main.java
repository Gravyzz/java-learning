package lambdasAndStreamAPI;

public class Main {
    public static void main(String[] args) {


        String r1 = applyTransform("hello", s -> s.toUpperCase());
        System.out.println(r1);


        String r2 = applyTransform("java", s -> new StringBuilder(s).reverse().toString());
        System.out.println(r2);


        String r3 = applyTransform("ab", s -> s + s);
        System.out.println(r3);


        String r4 = applyTransform("length", s -> String.valueOf(s.length()));
        System.out.println(r4);



    }
    public static String applyTransform(String input, StringTransformer transformer){
        return transformer.transform(input);
    }

}
