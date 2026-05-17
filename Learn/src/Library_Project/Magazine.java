package Library_Project;

public class Magazine extends LibraryItem implements Borrowable {
    private int issueNumber;

    public Magazine(int id, String title, int year, int issueNumber){
        super(id, title, year);
        this.issueNumber = issueNumber;
    }


    @Override
    public  String getItemType(){
        return "Журнал";
    };


    @Override
    public String toString(){
        return super.toString() + ", номер выпуска: " + issueNumber;
    }
}
