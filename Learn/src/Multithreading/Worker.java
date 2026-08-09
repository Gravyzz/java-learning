package Multithreading;

public class Worker {

    private volatile boolean running = true;

    public void stop(){
        running = false;
    }

    public void work(){
        while (running) {
            //workaem
        }
        System.out.println("Stop work");
    }

}
