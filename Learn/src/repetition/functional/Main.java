package repetition.functional;

import java.util.Set;
import java.util.HashSet;



public class Main {
    public static void main(String[] args) {




        System.out.println(hasDuplicatesWithSet(new int[]{3, 7, 3}));
        System.out.println(hasDuplicatesWithSet(new int[]{3, 7, 9}));
        System.out.println(hasDuplicatesWithSet(new int[]{4}));
        System.out.println(hasDuplicatesWithSet(new int[]{}));




    }


    static boolean hasDuplicatesWithSet(int[] numbers){
        HashSet<Integer> seen = new HashSet<>();
        for (int i = 0; i < numbers.length; i++) {
            if (!(seen.add(numbers[i]))){
                return true;
            }
        }
        return false;
    }

    

}
