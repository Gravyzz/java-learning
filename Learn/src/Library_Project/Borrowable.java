package Library_Project;

public interface Borrowable {

    public void borrow(User user);
    public void returnItem();
    public boolean isAvailable();
    public User getCurrentBorrower();

}
