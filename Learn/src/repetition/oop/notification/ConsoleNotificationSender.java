package repetition.oop.notification;

public class ConsoleNotificationSender implements NotificationSender {

    @Override
    public void send(String message){
        System.out.println("CONSOLE: " + message);
    }

}
