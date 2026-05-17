package Library_Project;

public abstract class LibraryItem {

    private int id;
    private String title;
    private int year;

    public LibraryItem(int id, String title, int year){
        this.id  = id;
        this.title = title;
        this.year = year;
    }


    public int getId() {
        return id;
    }

    public int getYear() {
        return year;
    }

    public String getTitle() {
        return title;
    }

    public abstract String getItemType();


    public String toString(){
        return "Id: " + id + ", Название: " + ", год издания: " + year;
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
