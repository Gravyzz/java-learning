package Library_Project;

public class Magazine extends LibraryItem implements Borrowable {
    private int issueNumber;

    public Magazine(int id, String title, int year, int issueNumber){
        super(id, title, year);
        this.issueNumber = issueNumber;
    }

    public  String getItemType(){
        return "Журнал";
    };

    public void borrow(User user){user.getList().add(this);};
    public void returnItem(){};
    public boolean isAvailable(){};
    public User getCurrentBorrower(){};


    @Override
    public String toString(){
        return super.toString() + ", номер выпуска: " + issueNumber;
    }
}
