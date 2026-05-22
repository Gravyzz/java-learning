package StaticDemo;

public class Calculator {
    public static double divide(double a, double b){
        if (b==0){
            throw new DivisionByZeroException("Деление на 0");
        }
        return a/b;
    }

}
