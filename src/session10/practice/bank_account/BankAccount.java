package session10.practice.bank_account;

public class BankAccount {

    private double balance;

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposit: " + amount);
        } else {
            System.out.println("The amount is invalid.");
        }
    }

    public void withdraw(double amount) {
        if (amount <= balance && amount > 0) {
            balance -= amount;
            System.out.println("Withdraw: " + amount);
        } else {
            System.out.println("The amount is invalid or bigger than your balance.");
        }
    }

    public double checkBalance(){
        return balance;
    }
}
