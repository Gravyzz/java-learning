package Library_Project;

public abstract class LibraryItem implements Borrowable {

    private int id;
    private String title;
    private int year;
    private User currentBorrower;

    public LibraryItem(int id, String title, int year){
        this.id = id;
        this.title = title;
        this.year = year;
    }

    public int getId() { return id; }
    public int getYear() { return year; }
    public String getTitle() { return title; }

    public abstract String getItemType();


    @Override
    public boolean isAvailable() {
        return currentBorrower == null;
    }

    @Override
    public User getCurrentBorrower() {
        return currentBorrower;
    }

    @Override
    public void borrow(User user) {
        if (!isAvailable()) {
            System.out.println("Предмет уже взят пользователем " + currentBorrower.getName());
            return;
        }
        this.currentBorrower = user;
        user.addBorrowedItem(this);
        System.out.println(user.getName() + " взял: " + getTitle());
    }

    @Override
    public void returnItem() {
        if (isAvailable()) {
            System.out.println("Этот предмет и так свободен");
            return;
        }
        System.out.println(currentBorrower.getName() + " вернул: " + getTitle());
        currentBorrower.removeBorrowedItem(this);
        this.currentBorrower = null;
    }

    @Override
    public String toString(){
        return "Id: " + id + ", Название: " + title + ", год издания: " + year;
    }

    @Override
    public boolean equals(Object o){
        if (this == o) return true;
        if (!(o instanceof LibraryItem)) return false;
        LibraryItem other = (LibraryItem) o;
        return id == other.id;
    }

    @Override
    public int hashCode() {
        return Integer.hashCode(id);
    }
}