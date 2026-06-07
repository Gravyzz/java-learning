package Generics;
import java.util.*;


public class Main {
    public static void main(String[] args) {


        List<Integer> intList = List.of(3, 7, 2, 8, 5);
        System.out.println("Сумма Integer: " + Utils.sum(intList));   // 25.0

        List<Double> doubleList = List.of(1.5, 2.5, 3.0);
        System.out.println("Сумма Double: " + Utils.sum(doubleList));  // 7.0

        List<Integer> ints = new ArrayList<>(List.of(1, 2, 3));
        List<Double> doubles = new ArrayList<>(List.of(4.6,7.3));
        List<Number> nums = new ArrayList<>(List.of(10.5));

        Utils.addAll(nums, ints);
        Utils.addAll(nums,doubles);// копируем Integer'ы в список Number'ов
        System.out.println(nums);
       // [10.5, 1, 2, 3]



    }
}
