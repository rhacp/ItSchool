package session10_java_oop_inheritance_encapsulation.challenges.challenge07;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.UUID;

public class BankAccount {

    private String accountHolderName;
    private UUID accountNumber;
    private double balance;
    private ArrayList<String> summary = new ArrayList<>();

    public BankAccount(String accountHolderName, double balance) {
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    public UUID getAccountNumber() {
        return accountNumber;
    }

    public void setId() {
        accountNumber = UUID.randomUUID();
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void addSum(double sum) {
        DateTimeFormatter formatterTime = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        if (sum > 0) {
            this.balance += sum;
            System.out.println("Deposit successful!");
            summary.add(String.valueOf(LocalDateTime.now().format(formatterTime)) + " : Deposit of " + sum + ".");
            summary.add("Balance: " + Double.toString(this.balance));
            summary.add(" ");
        } else {
            System.out.println("The sum is not valid.");
        }
    }

    public void extractSum(double sum) {
        DateTimeFormatter formatterTime = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        if (sum > 0 && sum < balance) {
            this.balance -= sum;
            System.out.println("Withdrawal successful!");
            summary.add(String.valueOf(LocalDateTime.now().format(formatterTime)) + " : Withdrawal of " + sum + ".");
            summary.add("Balance: " + Double.toString(this.balance));
            summary.add(" ");
        } else {
            System.out.println("The sum is not valid.");
        }
    }

    public void showSummary(){
        for (int index = 0; index < summary.size(); index++) {
            System.out.println(summary.get(index));
        }
    }

    public void getAccountDetails() {
        System.out.println("Holder Name: " + accountHolderName + ", Account Number: " + accountNumber + ", Balance: " + balance);
    }

    public void addSumTransfer(String accountHolderName, double sum) {
        DateTimeFormatter formatterTime = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        this.balance += sum;
        summary.add(String.valueOf(LocalDateTime.now().format(formatterTime)) + " : Transfer of " + sum + " from " + accountHolderName);
        summary.add("Balance: " +  Double.toString(this.balance));
        summary.add(" ");
    }

    public void extractSumTransfer(String accountHolderName, double sum) {
        DateTimeFormatter formatterTime = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        if (sum > 0 && sum < balance) {
            this.balance -= sum;
            summary.add(String.valueOf(LocalDateTime.now().format(formatterTime)) + " : Transfer of " + sum + " to " + accountHolderName);
            summary.add("Balance: " + Double.toString(this.balance));
            summary.add(" ");
        } else {
            System.out.println("The sum is not valid.");
        }
    }
}
