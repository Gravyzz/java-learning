package repetition.collections;
import java.util.*;
public class Main {
    public static void main(String[] args) {

        WordKey first = new WordKey("java");
        WordKey second = new WordKey("java");

        Map<WordKey, Integer> counts = new HashMap<>();
        counts.put(first, 1);
        counts.put(second, 2);

        System.out.println(first.equals(second));
        System.out.println(counts.size());
        System.out.println(counts.get(first));
    }
}
