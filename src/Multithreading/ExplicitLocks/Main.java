package Multithreading.ExplicitLocks;

public class Main {

    // This example shows problems of using intrinsic locks via synchronized keyword - which is indefinite blocking of threads ans less control

    public static void main(String[] args) {
        BankAccount account = new BankAccount();

        BankAccount sbi = new BankAccount();

        // making object of Runnable interface using anonymous class
        Runnable withdrawTask = new Runnable() {
            @Override
            public void run() {
                account.withdraw(50);
            }
        };

        Thread t1 = new Thread(withdrawTask, "Thread-1");

        // This thread will have to wait till t1 completes because of synchronized method
        Thread t2 = new Thread(withdrawTask, "Thread-2");
    

        t1.start();
        t2.start();


                //METHOD - to directly create threads by passing Runnable object using lambda expression
        // Thread t1 = new Thread(() -> {
        //     account.withdraw(50);
        // }, "Thread-1");

        // Thread t2 = new Thread(() -> {
        //     account.withdraw(50);
        // }, "Thread-2");
    }
    
}
