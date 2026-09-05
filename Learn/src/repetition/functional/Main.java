package repetition.functional;

import java.util.List;
import java.util.Locale;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {

        List<Integer> numbers = List.of(1, 2, 3);

        Stream<Integer> stream = numbers.stream()
                .filter(number -> {
                    System.out.println("filter " + number);
                    return number >= 2;
                })
                .map(number -> {
                    System.out.println("map " + number);
                    return number * 10;
                });

        System.out.println("before");

        List<Integer> result = stream.toList();

        System.out.println(result);


    }
}
