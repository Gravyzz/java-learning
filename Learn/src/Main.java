import Library_Project.*;
import StaticDemo.Calculator;
import StaticDemo.Counter;
import StaticDemo.DivisionByZeroException;
import StaticDemo.Status;

import java.io.FileReader;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        try(Scanner sc = new Scanner(System.in)){
            double a = sc.nextDouble();
            double b = sc.nextDouble();

            try{
            System.out.println(Calculator.divide(a,b));

            } catch (DivisionByZeroException e){
                System.out.println("Деление на 0");

        }


        } catch(InputMismatchException e) {
            System.out.println("Введено не число!");
        } finally {
            System.out.println("Программа завершена!");
        }

    }

}
