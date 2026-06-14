package Collection;
import java.util.*;

public class Main {
    public static void main(String[] args) {

// removeShortWords
        List<String> allShort = new ArrayList<>(List.of("a", "go", "hi"));
        removeShortWords(allShort, 3);
        System.out.println(allShort);   // [] все удалены

        List<String> noShort = new ArrayList<>(List.of("code", "java"));
        removeShortWords(noShort, 3);
        System.out.println(noShort);    // [code, java] без изменений

// removeNegatives
        List<Integer> allNeg = new ArrayList<>(List.of(-1, -2, -3));
        System.out.println(removeNegatives(allNeg) + " " + allNeg);  // 3 []

        List<Integer> noNeg = new ArrayList<>(List.of(1, 2, 3));
        System.out.println(removeNegatives(noNeg) + " " + noNeg);    // 0 [1, 2, 3]

    }

    public static void removeShortWords(List<String> words, int minLength){

        Iterator<String> it = words.iterator();
        while (it.hasNext()) {
            String word = it.next();
            if (word.length() < minLength) {
                it.remove();
            }
        }

    }



    public static int removeNegatives(List<Integer> numbers) {
        int countRemove = 0;
        Iterator<Integer> it = numbers.iterator();
        while (it.hasNext()) {
            Integer number = it.next();
            if (number < 0) {
                it.remove();
                countRemove++;
            }
    }
        return countRemove;
}}
