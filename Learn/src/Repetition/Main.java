package Repetition;

public class Main {

    public static void main(String[] args) {

        boolean yes = isAdmin("admiN");
        System.out.println(yes);


    }

    static boolean isAdmin(String login){
        if (login == null){
            return false;
        }
        login = login.trim();
        return login.equalsIgnoreCase("admin");

    }

}