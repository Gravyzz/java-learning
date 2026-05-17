package Library_Project;
import java.util.*;
public class Library {

    private List<LibraryItem> items;
    private List<User> users;

    public Library(){
        items = new ArrayList<>();
        users = new ArrayList<>();
    }

    public void addItem(LibraryItem item){
        items.add(item);
    }

    public void registerUser(User user){
        users.add(user);
    }

    public LibraryItem findItemById(int id) {
        for (LibraryItem item : items) {
            if (item.getId() == id) return item;
        }
        return null;
    }

    public User findUserById(int id) {
        for (User user : users) {
            if (user.getId() == id) return user;
        }
        return null;
    }

    public void borrowItem(int itemId, int userId) {
        LibraryItem item = findItemById(itemId);
        User user = findUserById(userId);

        if (item == null) {
            System.out.println("Предмет с id=" + itemId + " не найден");
            return;
        }
        if (user == null) {
            System.out.println("Пользователь с id=" + userId + " не найден");
            return;
        }

        item.borrow(user);  // ← полиморфизм! Не важно, Book, DVD или Magazine
    }

    public void returnItem(int itemId) {
        LibraryItem item = findItemById(itemId);
        if (item == null) {
            System.out.println("Предмет с id=" + itemId + " не найден");
            return;
        }
        item.returnItem();
    }

    public void printAllItems() {
        System.out.println("=== Все предметы ===");
        for (LibraryItem item : items) {
            String status = item.isAvailable() ? "свободен" : "у " + item.getCurrentBorrower().getName();
            System.out.println(item.getItemType() + " | " + item + " | " + status);
        }
    }

    public void printAvailableItems() {
        System.out.println("=== Доступные предметы ===");
        for (LibraryItem item : items) {
            if (item.isAvailable()) {
                System.out.println(item.getItemType() + " | " + item);
            }
        }
    }
}