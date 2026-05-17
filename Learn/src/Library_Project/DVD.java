package Library_Project;

public class DVD extends LibraryItem  {

    private int durationMinutes;

    public DVD(int id, String title, int year,int durationMinutes){
        super(id,  title,  year);
        this.durationMinutes = durationMinutes;
    }


    @Override
    public  String getItemType(){
        return "ДВД";
    }


    @Override
    public String toString(){
        return super.toString() + ", продолжительность в минутах: " + durationMinutes;
    }

}
