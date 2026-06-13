package Workspace_project;

import java.util.Objects;

public class Booking {

    private final int bookingId;
    private final Workspace workspace;
    private final String userName;
    private final int startHour;
    private final int endHour;

    public Booking(int bookingId, Workspace workspace, String userName, int startHour, int endHour){
        if (workspace == null) throw new InvalidBookingException("Место не указано");
        if (userName == null || userName.isBlank()) throw new InvalidBookingException("Имя пользователя не указано");
        if (startHour < 0 || startHour > 23) throw new InvalidBookingException("Некорректный час начала: " + startHour);
        if (endHour < 1 || endHour>24) throw new InvalidBookingException("Некорректный час конца: " + endHour);
        if (startHour >= endHour) throw new InvalidBookingException("Час начала должен быть раньше конца");

        this.bookingId = bookingId;
        this.workspace = workspace;
        this.userName = userName;
        this.startHour = startHour;
        this.endHour = endHour;

    }


    public int getBookingId() {
        return bookingId;
    }

    public Workspace getWorkspace() {
        return workspace;
    }

    public String getUserName() {
        return userName;
    }

    public int getStartHour() {
        return startHour;
    }

    public int getEndHour() {
        return endHour;
    }


    public int getDurationHours(){
        return endHour-startHour;
    }

    public double getTotalCost(){
        return getDurationHours() * workspace.getPricePerHour();
    }

    public boolean overlaps(Booking other){
        return this.startHour < other.endHour && other.startHour < this.endHour;
    }


    @Override
    public String toString() {
        return "Бронь #" + bookingId + ": "
                + userName + ", " + "Место #" + workspace.getId() + " ("+workspace.getType().getDescription()+"), "+
                startHour +"-"+
                endHour + ", " + "стоимость: " + getTotalCost();
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Booking booking)) return false;
        return getBookingId() == booking.getBookingId();
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getBookingId());
    }
}
