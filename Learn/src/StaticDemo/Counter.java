package StaticDemo;

public class Counter {
    public static int count;
    public static final int MAX_COUNT = 5;

    public Counter() {
        count++;
    }

    public static int getCount() {
        return count;
    }


}


