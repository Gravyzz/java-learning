package repetition.oop;

import repetition.oop.notification.ConsoleNotificationSender;
import repetition.oop.notification.EmailNotificationSender;
import repetition.oop.notification.NotificationService;

public class Main {
    public static void main(String[] args) {

        BankAccount first = new BankAccount(100);
        BankAccount second = first;

        first.deposit(50);
        System.out.println(second.getBalance());

        first = new BankAccount(10);
        System.out.println(first.getBalance());
        System.out.println(second.getBalance());



    }


}
