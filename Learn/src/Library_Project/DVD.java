package Library_Project;

public class DVD extends LibraryItem implements Borrowable {

    private int durationMinutes;

    public DVD(int id, String title, int year,int durationMinutes){
        super(id,  title,  year);
        this.durationMinutes = durationMinutes;
    }

    public  String getItemType(){
        return "ДВД";
    };

    public void borrow(User user){user.getList().add(this);};
    public void returnItem(){list.add(this);};
    public boolean isAvailable(){};
    public User getCurrentBorrower(){};


    @Override
    public String toString(){
        return super.toString() + ", продолжительность в минутах: " + durationMinutes;
    }

}
