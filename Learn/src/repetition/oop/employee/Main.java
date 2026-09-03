package repetition.oop.employee;

import java.util.*;

public class Main {
        public static void main(String[] args){

            List<Integer> numbers =
                    new ArrayList<>(List.of(-1, -2, -3, 4));

            for (int i = 0; i < numbers.size(); i++) {
                if (numbers.get(i) < 0) {
                    numbers.remove(i);
                }
            }

            System.out.println(numbers);

        }

    static void removeNegative(List<Integer> numbers){
        Iterator<Integer> iterator = numbers.iterator();

        while (iterator.hasNext()) {
            int number = iterator.next();

            if (number < 0) {
                iterator.remove();
            }
        }
    }

}
