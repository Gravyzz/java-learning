package repetition.oop.employee;

public class Main {
    public static void main(String[] args){
        Employee employee =
                new FixedSalaryEmployee("  Zakhar  ", 100_000);

        System.out.println(employee.getName());
        System.out.println(employee.calculateMonthlyPay());

    }
}
