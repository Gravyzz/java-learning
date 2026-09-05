package repetition.functional;

import java.util.List;
import java.util.Locale;
import java.util.function.*;

public class Main {
    public static void main(String[] args) {

        List<Integer> numbers = List.of(-2, 0, 3, 5, -1, 3);
        List<Integer> result = numbers.stream()
                .filter(number -> number > 0)
                .map(number -> number * 2)
                .toList();


        System.out.println(result);
        System.out.println(numbers);
    }



}
