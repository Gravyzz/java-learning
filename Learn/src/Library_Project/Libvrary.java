package Library_Project;
import java.util.*;
public class Libvrary {

    private List<LibraryItem> list;
    private List<User> users;

    public Libvrary(){
        list = new ArrayList<>();
        users = new ArrayList<>();
    }

    public void addItem(LibraryItem item){
        list.add(item);
    }

    public void registerUser(User user){
        users.add(user);
    }

}
