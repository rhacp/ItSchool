package session9.challenges.challenge03;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.UUID;

public class Account {

    private String personName;
    private UUID id;
    private double sum;
    private ArrayList<String> summary = new ArrayList<>();

    public Account(String personName, double sum) {
        this.personName = personName;
        this.sum = sum;
    }

    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }

    public UUID getId() {
        return id;
    }

    public void setId() {
        id = UUID.randomUUID();
    }

    public double getSum() {
        return sum;
    }

    public void setSum(double sum) {
        this.sum = sum;
    }

    public void addSum(double sum) {
        DateTimeFormatter formatterTime = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        this.sum += sum;
        summary.add(String.valueOf(LocalDateTime.now().format(formatterTime)) + " : Deposit of " + sum + ".");
        summary.add("Balance: " +  Double.toString(this.sum));
        summary.add(" ");
    }

    public void extractSum(double sum) {
        DateTimeFormatter formatterTime = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        this.sum -= sum;
        summary.add(String.valueOf(LocalDateTime.now().format(formatterTime)) + " : Withdrawal of " + sum + ".");
        summary.add("Balance: " +  Double.toString(this.sum));
        summary.add(" ");
    }

    public void showSummary(){
        for (int index = 0; index < summary.size(); index++) {
            System.out.println(summary.get(index));
        }
    }

    public double checkSum() {
        return sum;
    }
}
