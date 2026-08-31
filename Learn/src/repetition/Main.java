package repetition;

public class Main {

    public static void main(String[] args) {

        System.out.println(sumPositive(new int[]{3, -2, 0, 5}));

    }

    static int sumPositive(int[] numbers){
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > 0) {
                sum+=numbers[i];
        }
    }
        return sum;
}
}