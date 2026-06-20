package Collection;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        System.out.println(91880105%16);

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
