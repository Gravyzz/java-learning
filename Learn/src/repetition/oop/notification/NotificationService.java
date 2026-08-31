package repetition.oop.notification;

public class NotificationService {
    private final NotificationSender sender;

    public NotificationService(NotificationSender sender){
        if ( sender == null ) throw new IllegalArgumentException("null значение");
        this.sender = sender;
    }

    public void notifyUser(String message){
        if (message == null || message.isBlank()) throw new IllegalArgumentException("Недопустимое значение");
        sender.send(message);
    }

}
