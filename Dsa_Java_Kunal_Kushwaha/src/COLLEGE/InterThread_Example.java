package COLLEGE;

public class InterThread_Example {
        public static void main(String arg[]) {
            final Client c = new Client();
            new Thread() {
                public void run() {
                    c.withdraw(15000);
                }
            }.start();
            new Thread() {
                public void run() {
                    c.deposit(10000);
                }
            }.start();
            new Thread() {
                public void run() {
                    c.deposit(10000);
                }
            }.start();
        }}
    class Client {
        int amount = 10000;
        synchronized void withdraw(int amount) {
            System.out.println("Available Balance: " + this.amount);
            System.out.println("Withdrawal amount: " + amount);
            if (this.amount < amount) {System.out.println("Insufficient Balance waiting for deposit.");try {
                wait();
            } catch (InterruptedException e) {
                System.out.println("Interruption Occurred"); }}
            this.amount -= amount;
            System.out.println("Deducted amount: " + amount);
            System.out.println("Balance amount: " + this.amount);
        }
        synchronized void deposit(int amount) {
            System.out.println("Going to deposit: " + amount);
            this.amount += amount;
            System.out.println("Available Balance: " + this.amount);
            System.out.println("Transaction completed.\n");
            notify();
        }}
