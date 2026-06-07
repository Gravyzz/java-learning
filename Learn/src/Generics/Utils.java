package Generics;
import java.util.*;

public class Utils {

    public static <T extends Comparable<T>> T findMax(List<T> list){
        if (list.isEmpty()) return null;
        return Collections.max(list);
    }

    public static double sum(List<? extends Number> list){
        if (list.isEmpty()) return 0.0;
        double sum = 0;
        for (int i = 0; i < list.size(); i++) {
            sum+=list.get(i).doubleValue();
        }return sum;
    }

    public static <T> void addAll(List<? super T> dest, List<? extends T> source){
        for (int i = 0; i < source.size(); i++) {
            dest.add(source.get(i));
        }
    }



}
