package Multithreading;

public class Main {
    public static void main(String[] args) {

    Counter counter = new Counter();
    Runnable task = () -> {
        for (int i = 0; i < 10000; i++){
            counter.increment();
            System.out.println(counter.getCount());
        }
    };

    Thread t1 = new Thread(task);
    Thread t2 = new Thread(task);
    t1.start();
    t2.start();
    

    }}
