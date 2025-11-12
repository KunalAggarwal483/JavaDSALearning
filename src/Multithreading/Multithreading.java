package Multithreading;

public class Multithreading extends Thread {

    // This is a demonstration to show different states (life cycle) of a thread
    public void run() {
        System.out.println("RUNNING");

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
           System.out.println(e);
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Multithreading t1 = new Multithreading();
        
        System.out.println(t1.getState());

        t1.start();
        System.out.println(t1.getState());
        Thread.sleep(100);
        System.out.println(t1.getState());
        t1.join();
        System.out.println(t1.getState());

    
    }


    
}
