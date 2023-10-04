package session10.challenges.challenge07;

import java.util.ArrayList;

public class AccountList {

    private ArrayList<BankAccount> accountList = new ArrayList();

    public void addAccount(BankAccount account) {
        if (accountList.size() == 0) {
            accountList.add(account);
        } else {
            int helpCounter = 0;
            for (BankAccount element : accountList) {
                if (element.equals(account)) {
                    System.out.println("This person already has an account. Please try again.");
                    helpCounter = 1;
                    break;
                }
            }

            if (helpCounter == 0) {
                int secondHelp = 0;
                for (int index = accountList.size() - 1; index >= 0; index--) {
                    if ((accountList.get(index).getAccountHolderName()).compareToIgnoreCase(account.getAccountHolderName()) < 0) {
                        secondHelp = index + 1;
                        break;
                    }
                }
                accountList.add(secondHelp, account);
            }
        }
    }

    public BankAccount getAccount(String name) {
        int helpCounter = 0;
        for (int index = 0; index < accountList.size(); index++) {
            if ((accountList.get(index).getAccountHolderName()).equals(name)) {
                helpCounter = 1;
                return accountList.get(index);
            }
        }
        if (helpCounter == 0) {
            System.out.println("This person has no account. Try again.");
        }
        return null;
    }

    public void showAllAccounts() {
        for (int index = 0; index < accountList.size(); index++) {
            System.out.println(accountList.get(index).getAccountHolderName() + ", Account Number: " + accountList.get(index).getAccountNumber() + ", Sum: " + accountList.get(index).getBalance());
        }
    }

    public void transferFunds(String accountHolderName, String targetAccountHolderName, double amount) {
        for (int index = 0; index < accountList.size(); index++) {
            if ((accountList.get(index).getAccountHolderName()).equals(accountHolderName)) {
                accountList.get(index).extractSumTransfer(targetAccountHolderName, amount);
            }
            if ((accountList.get(index).getAccountHolderName()).equals(targetAccountHolderName)) {
                accountList.get(index).addSumTransfer(accountHolderName, amount);
            }
            }
        System.out.println("Transfer successful!");
        }
    }

