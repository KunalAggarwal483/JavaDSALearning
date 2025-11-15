package Multithreading.Synchronised;

public class BankAccount {

    private int balance = 100;

    public synchronized void withdraw(int amount) {
        System.out.println(Thread.currentThread().getName() +  " Attempting to withdraw " + amount);
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
    
}
