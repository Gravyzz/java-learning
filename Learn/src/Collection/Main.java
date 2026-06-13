package Collection;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        System.out.println(removeDuplicates(new ArrayList<>(List.of(1,2,2,3,1,4,3))));  // [1,2,3,4]
        System.out.println(removeDuplicates(new ArrayList<>(List.of(5,5,5,5))));        // [5]
        System.out.println(removeDuplicates(new ArrayList<>(List.of(1,2,3))));          // [1,2,3]
        System.out.println(removeDuplicates(new ArrayList<>(List.of())));               // []
        System.out.println(removeDuplicates(new ArrayList<>(List.of(3,1,2,1,3))));      // [3,1,2]

    }

    public static List<Integer> removeDuplicates(List<Integer> input){
        Set<Integer> seen = new HashSet<>();
        List<Integer> result = new ArrayList<>();
        for (Integer number : input) {
            if (!seen.contains(number)) {
                seen.add(number);
                result.add(number);
            }
        }
        return result;
    }

}
