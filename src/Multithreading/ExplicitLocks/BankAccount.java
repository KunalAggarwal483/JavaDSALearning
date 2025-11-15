package Multithreading.ExplicitLocks;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class BankAccount {

    private int balance = 100;

    private final Lock lock = new ReentrantLock();

    public void withdraw(int amount) {
        System.out.println(Thread.currentThread().getName() +  " Attempting to withdraw " + amount);

        try {
            if(lock.tryLock(1000, TimeUnit.MILLISECONDS)){ 
                // Critical section

                if (balance >= amount) {
                System.out.println(Thread.currentThread().getName()+ " Withdrawing " + amount);

                try {
                    Thread.sleep(5000); // Simulate time taken to process the withdrawal
                } catch (InterruptedException e) {
                    System.out.println(e);
                }

                balance -= amount;
                System.out.println(Thread.currentThread().getName() +" Completed withdrawal of " + amount);
                System.out.println("Remaining balance: " + balance);
                } else {
                    System.out.println(Thread.currentThread().getName() + " Insufficient funds for withdrawal of " + amount);
                }

            }
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            System.out.println(e);
            Thread.currentThread().interrupt();
        }

        
    }
    
}
