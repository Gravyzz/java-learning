import java.util.ArrayList;
import java.util.List;

public class Main{
    public static void main(String[] args) {
        List<Integer> source = List.of(10, 20, 30);
        List<Number> destination = new ArrayList<>();

        copy(source, destination);

        System.out.println(destination);
    }

    static <T> void copy(List<? extends T> source, List<? super T> destination ){

        for (T sourceObject : source) {
            destination.add(sourceObject);
        }


    }

}