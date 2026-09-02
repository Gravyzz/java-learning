package repetition.oop.employee;

public abstract class Employee {
    private final String name;

    protected Employee(String name){
        if (name == null || name.isBlank()) throw new IllegalArgumentException("Недопустимое значение");
        this.name = name.trim();
    }

    public String getName(){
        return name;
    }

    public abstract int calculateMonthlyPay();

}
