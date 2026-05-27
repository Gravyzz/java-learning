package Generics;

public class Main {
    public static void main(String[] args) {



        Pair<String, Integer> p1 = new Pair<>("Ivan", 25);
        Pair<Integer, String> p2 = new Pair<>(25, "Ivan");

        System.out.println(p1.equals(p2));
    }
}
