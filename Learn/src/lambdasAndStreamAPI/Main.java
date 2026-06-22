package lambdasAndStreamAPI;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        List<String> names = List.of("Иван", "Александр", "Ян", "Мария", "Лев");
        List<String> empty = List.of();

        System.out.println(longNamesUpper(names));
        System.out.println(countShort(names));
        System.out.println(nameLengths(names));

        System.out.println(longNamesUpper(empty));
        System.out.println(countShort(empty));
        System.out.println(nameLengths(empty));

    }

    public static List<String> longNamesUpper(List<String> names) {
        return names.stream()
                .filter(n -> n.length()>4)
                .map(n -> n.toUpperCase())
                .collect(Collectors.toList());
    }


    public static long countShort(List<String> names){
        return names.stream()
                .filter(n -> n.length()<=4)
                .count();
    }


    public static List<Integer> nameLengths(List<String> names){
        return names.stream()
                .map(n -> n.length())
                .collect(Collectors.toList());
    }

}
