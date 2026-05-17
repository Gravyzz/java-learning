package Library_Project;

public class Book extends LibraryItem implements  Borrowable {

    private String author;
    private int pages;

    public Book(int id, String title, int year, String author, int pages){
        super(id, title, year);
        this.author = author;
        this.pages = pages;
    }

    public String getItemType(){
        return "Книга";
    };

    public void borrow(User user){
        user.getList().add(this);
    };
    public void returnItem(){};
    public boolean isAvailable(){};
    public User getCurrentBorrower(){};

    @Override
    public String toString(){
        return super.toString() + " Автор: " + author + ", количество страниц: " + pages;
    }
}
