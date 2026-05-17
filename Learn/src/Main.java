import Library_Project.*;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();
        Book bookOfDostoevsky = new Book(0,"Crime and nakazanie", 1850, "Dostoevsky", 195);
        Book bookOfTolstoq = new Book(1,"Non", 1846, "Tolstoi", 246);
        DVD dvd1 = new DVD(3, "Star wars", 1998,130);
        Magazine mag1 = new Magazine(4, "Playboy",2007, 65);
        library.addItem(bookOfDostoevsky);
        library.addItem(bookOfTolstoq);
        library.addItem(dvd1);
        library.addItem(mag1);

        User user1 = new User(0 , "Thomas");
        User user2 = new User(1, "Michel");

        library.registerUser(user1);
        library.registerUser(user2);

        library.printAllItems();
        

    }
}
