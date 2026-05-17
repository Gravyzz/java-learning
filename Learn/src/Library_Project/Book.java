package Library_Project;

public class Book extends LibraryItem {
    private String author;
    private int pages;

    public Book(int id, String title, int year, String author, int pages){
        super(id, title, year);
        this.author = author;
        this.pages = pages;
    }

    @Override
    public String getItemType(){
        return "Книга";
    }

    @Override
    public String toString(){
        return super.toString() + ", Автор: " + author + ", количество страниц: " + pages;
    }
}