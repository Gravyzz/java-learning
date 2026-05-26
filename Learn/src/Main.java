import Library_Project.*;
import StaticDemo.Calculator;
import StaticDemo.Counter;
import StaticDemo.DivisionByZeroException;
import StaticDemo.Status;

import java.io.FileReader;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        HashMap<String, ArrayList<String>> autors = new HashMap<>();

        ArrayList<String> proiz = new ArrayList<>();
        proiz.add("Bella");
        proiz.add("Love");
        autors.put("Michel", proiz);
        System.out.println(autors);
    }

}
