package session11_oop_abstraction.challenge.challenge02;

public class App {

    public static void main(String[] args) {
        BankA bankA = new BankA();
        BankB bankB = new BankB();
        BankC bankC = new BankC();

        System.out.println("There is a deposit in Bank A of: ");
        bankA.getBalance();
        System.out.println("There is a deposit in Bank B of: ");
        bankB.getBalance();
        System.out.println("There is a deposit in Bank C of: ");
        bankC.getBalance();
    }
}
