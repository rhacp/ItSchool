package session9.challenges.challenge03;

import session9.challenges.challenge02.Catalog;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        AccountList accountList = new AccountList();
        menu(accountList);
    }

    public static void menu(AccountList accountList) {
        Scanner scanner = new Scanner(System.in);
        int helpCounter;
        MENU_LOOP:
        while (true) {
            System.out.println("");
            System.out.println("MENU");
            System.out.println("---");
            System.out.println("Choose your item:");
            System.out.println("1. Create account.");
            System.out.println("2. Withdraw from account.");
            System.out.println("3. Deposit in account.");
            System.out.println("4. Show account summary.");
            System.out.println("5. See all accounts (alphabetically).");
            System.out.println("0. Exit.");
            System.out.println("");
            System.out.print("Choose the item by number: ");
            String secondHelpCounter = scanner.nextLine();
            while (!secondHelpCounter.matches("\\d+")) {
                System.out.print("Invalid input. Try again: ");
                secondHelpCounter = scanner.nextLine();
            }
            helpCounter = Integer.parseInt(secondHelpCounter);
            System.out.println("");

            switch (helpCounter) {
                case 1 -> {
                    System.out.print("Enter person name: ");
                    String nameValue = scanner.nextLine();
                    System.out.print("Enter initial sum: ");
                    double sumValue = Double.parseDouble(scanner.nextLine());
                    accountList.addAccount(new Account(nameValue, sumValue));
                    accountList.getAccount(nameValue).setId();
                }
                case 2 -> {
                    System.out.print("Enter person name: ");
                    String nameValue = scanner.nextLine();
                    System.out.print("Enter sum to withdraw: ");
                    double sumValue = Double.parseDouble(scanner.nextLine());
                    accountList.getAccount(nameValue).extractSum(sumValue);
                }
                case 3 -> {
                    System.out.print("Enter person name: ");
                    String nameValue = scanner.nextLine();
                    System.out.print("Enter sum to deposit: ");
                    double sumValue = Double.parseDouble(scanner.nextLine());
                    accountList.getAccount(nameValue).addSum(sumValue);
                }
                case 4 -> {
                    System.out.print("Enter person name: ");
                    String nameValue = scanner.nextLine();
                    accountList.getAccount(nameValue).showSummary();
                }
                case 5 -> {
                    accountList.showAllAccounts();
                }
                case 0 -> {
                    break MENU_LOOP;
                }
            }
        }
    }
}
