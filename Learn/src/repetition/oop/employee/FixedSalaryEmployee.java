package repetition.oop.employee;

public final class FixedSalaryEmployee extends Employee{

    private final int monthlySalary;

    public FixedSalaryEmployee(String name, int monthlySalary){
        super(name);
        if (monthlySalary < 0) throw new IllegalArgumentException("Зарплата не может быть отрицательной");
        this.monthlySalary = monthlySalary;
    }

    @Override
    public int calculateMonthlyPay(){
        return monthlySalary;
    }

}
