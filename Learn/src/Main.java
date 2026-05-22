import Library_Project.*;
import StaticDemo.Counter;
import StaticDemo.Status;

public class Main {
    public static void main(String[] args) {

        Counter o1 = new Counter();
        Counter o2 = new Counter();
        Counter o3 = new Counter();

        System.out.println(Counter.count);
        Status currentStatus = Status.ACTIVE;
        if (currentStatus == Status.ACTIVE){
            System.out.println("Активен");
        }

        currentStatus = Status.BLOCKED;
        switch (currentStatus) {
            case ACTIVE:
                System.out.println("Активный");
                break;
            case INACTIVE: System.out.println("Не активный");
            break;
            case BLOCKED: System.out.println("Заблокирован");
            break;
        }

    }
}
