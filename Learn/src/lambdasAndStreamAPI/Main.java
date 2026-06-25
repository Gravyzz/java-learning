package lambdasAndStreamAPI;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        List<Integer> nums = List.of(3, -2, 4, 1, -5, 6);
        List<Integer> empty = List.of();

        System.out.println(evensDoubled(nums));
        System.out.println(evensDoubled(empty));

        System.out.println(sumOfPositives(nums));
        System.out.println(sumOfPositives(empty));

        System.out.println(hasNegative(nums));
        System.out.println(hasNegative(empty));

        System.out.println(joinSorted(nums));
        System.out.println(joinSorted(empty));

    }

    public static List<Integer> evensDoubled(List<Integer> nums){
        return nums.stream()
                .filter(n -> n>0)
                .filter(n -> n%2==0)
                .map(n -> n*2)
                .collect(Collectors.toList());
    }

    public static int sumOfPositives(List<Integer> nums){
        return nums.stream()
                .filter(n -> n>=0)
                .mapToInt(n -> n)
                .sum();

    }

    public static boolean hasNegative(List<Integer> nums){
        return nums.stream()
                .anyMatch(n -> n<0);
    }

    public static String joinSorted(List<Integer> nums){
        return nums.stream()
                .sorted()
                .map(n -> String.valueOf(n))
                .collect(Collectors.joining(", "));
    }

}
