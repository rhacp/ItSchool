package session10_java_oop_inheritance_encapsulation.challenges.challenge07;

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
            System.out.println("4. Show account transactions history.");
            System.out.println("5. See all accounts (alphabetically).");
            System.out.println("6. See account details.");
            System.out.println("7. Transfer from one account to another.");
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
                    String sumHelp = scanner.nextLine();
                    if (sumHelp.matches("\\d+") && (Double.parseDouble(sumHelp) > 0)) {
                        double sumValue = Double.parseDouble(sumHelp);
                        accountList.addAccount(new BankAccount(nameValue, sumValue));
                        accountList.getAccount(nameValue).setId();
                    } else {
                        System.out.println("Invalid sum. Try again.");
                    }
                }
                case 2 -> {
                    System.out.print("Enter person name: ");
                    String nameValue = scanner.nextLine();
                    System.out.print("Enter sum to withdraw: ");
                    String sumHelp = scanner.nextLine();
                    if (sumHelp.matches("\\d+")) {
                        if (accountList.getAccount(nameValue) != null) {
                            double sumValue = Double.parseDouble(sumHelp);
                            accountList.getAccount(nameValue).extractSum(sumValue);
                        }
                    } else {
                        System.out.println("The sum is not valid. Nothing happened.");
                    }
                }
                case 3 -> {
                    System.out.print("Enter person name: ");
                    String nameValue = scanner.nextLine();
                    System.out.print("Enter sum to deposit: ");
                    String sumHelp = scanner.nextLine();
                    if (sumHelp.matches("\\d+")) {
                        if (accountList.getAccount(nameValue) != null) {
                            double sumValue = Double.parseDouble(sumHelp);
                            accountList.getAccount(nameValue).addSum(sumValue);
                        }
                    } else {
                        System.out.println("Sum is not valid. Nothing happened.");
                    }
                }
                case 4 -> {
                    System.out.print("Enter person name: ");
                    String nameValue = scanner.nextLine();
                    if (accountList.getAccount(nameValue) != null) {
                        accountList.getAccount(nameValue).showSummary();
                    } else {
                        System.out.println("This person has no account.");
                    }
                }
                case 5 -> {
                    accountList.showAllAccounts();
                }
                case 6 -> {
                    System.out.print("Enter person name: ");
                    String nameValue = scanner.nextLine();
                    if (accountList.getAccount(nameValue) != null) {
                        accountList.getAccount(nameValue).getAccountDetails();
                    } else {
                        System.out.println("This person has no account.");
                    }
                }
                case 7 -> {
                    System.out.print("Enter the account holder name to transfer from: ");
                    String nameValue = scanner.nextLine();
                    System.out.print("Enter the account holder name to transfer to: ");
                    String targetNameValue = scanner.nextLine();
                    System.out.print("Enter sum to transfer: ");
                    String sumHelp = scanner.nextLine();
                    if (sumHelp.matches("\\d+")) {
                        if (accountList.getAccount(nameValue) != null && accountList.getAccount(targetNameValue) != null) {
                            double amountValue = Double.parseDouble(sumHelp);
                            accountList.transferFunds(nameValue, targetNameValue, amountValue);
                        }
                    } else {
                        System.out.println("Sum is not valid. Nothing happened.");
                    }
                }
                case 0 -> {
                    break MENU_LOOP;
                }
            }
        }
        scanner.close();
    }
}

