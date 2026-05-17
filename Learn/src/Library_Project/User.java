package Library_Project;
import java.util.*;

public class User {
    private int id;
    private String name;
    private List<LibraryItem> list;

    public User(int id, String name){
        this.id = id;
        this.name = name;
        list = new ArrayList<>();
    }


    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public List<LibraryItem> getList() {
        return list;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", list=" + list +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof User user)) return false;
        return getId() == user.getId();
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getId());
    }
}
