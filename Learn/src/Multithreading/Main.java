package Multithreading;

public class Main {
    public static void main(String[] args) {
        Runnable task = () -> {
            System.out.println("Привет из потока!");
        };

        Thread thread = new Thread(task);
        thread.start();


    }
}
